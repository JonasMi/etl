package com.nestvision.nest.proxy.fhir.api;

import com.nestvision.nest.proxy.base.dto.ArrayParameterRequest;
import com.nestvision.nest.proxy.base.exception.EtlException;
import com.nestvision.nest.proxy.base.exception.ResourceNotFoundException;
import com.nestvision.nest.proxy.fhir.entity.FhirResourceEntity;
import com.nestvision.nest.proxy.fhir.entity.Patient;
import com.nestvision.nest.proxy.fhir.service.PatientService;
import com.nestvision.nest.proxy.nest.api.FhirResourceEntityControllerSupport;
import com.nestvision.nest.proxy.transform.model.NestRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/Patient/")
public class RestPatientController extends FhirResourceEntityControllerSupport<Patient> {

    @Autowired
    private PatientService patientService;

    /**
     * 手动增加的代码，分页查询消息列表
     *
     * @param bizId         业务主键
     * @param processResult 处理结果
     * @param timeBegin     业务发生的时间，起
     * @param timeEnd       业务发生的时间，终
     * @return 数据列表
     */
    @GetMapping
    public Page<Patient> list(@RequestParam(required = false) String bizId, @RequestParam(required = false) FhirResourceEntity.ProcessResult processResult,
                              @RequestParam(required = false, defaultValue = "0") long timeBegin,
                              @RequestParam(required = false, defaultValue = "0") long timeEnd, Pageable pageable) {
        return patientService.findAll(bizId, processResult, timeBegin, timeEnd, pageable);
    }

    /**
     * 查询单条ETL的信息
     *
     * @return ETL的单条信息
     */
    @GetMapping("{messageId}/")
    public Patient getDetail(@PathVariable String messageId) {
        Patient patient = patientService.findOne(messageId);
        if (patient == null) {
            throw new ResourceNotFoundException("ID为：" + messageId + "的消息未找到");
        }

        return patient;
    }

    /**
     * 根据消息ID查询消息的发送历史记录
     *
     * @param messageId 消息ID
     * @return 该消息的全部历史记录
     */
    @Override
    @GetMapping("{messageId}/nest-requests/")
    public List<NestRequest> findNestRequests(@PathVariable String messageId) {
        //去掉不需要的属性,减少网络开销
        return super.findNestRequests(messageId).parallelStream().peek(nestRequest -> {
            nestRequest.setBody("");
        }).collect(Collectors.toList());
    }

    /**
     * 根据请求ID查询请求的明细信息
     *
     * @param requestId 请求ID
     * @return 该请求的明细信息
     */
    @GetMapping("{messageId}/nest-requests/{requestId}/")
    public NestRequest findNestRequestDetail(@PathVariable String messageId, @PathVariable String requestId) {
        NestRequest nestRequest = super.findNestRequestById(requestId);
        if (nestRequest == null) {
            throw new ResourceNotFoundException("消息：" + messageId + "的ID为：" + requestId + "的请求未找到");
        }

        return nestRequest;
    }

    /**
     * 删除消息
     *
     * @param request 要删除的ID列表
     */
    @PostMapping("delete/")
    public void deleteAll(@RequestBody ArrayParameterRequest request) {
        patientService.deleteAll(request.getIds().toArray(new String[0]));
    }

    /**
     * 手动发送单条消息
     *
     * @param request 要发送的消息ID
     */
    @PostMapping("send/")
    public void sendAll(@RequestBody ArrayParameterRequest request) {
        request.getIds().parallelStream().flatMap(messageId -> findNestRequests(messageId).stream()).map(this::internalSendNestRequest).forEach(sendResult -> {
            if (!sendResult.getSuccess()) {
                throw new EtlException("手动发送ID为：" + sendResult.getMessage() + "的消息失败。");
            }
        });
    }

}