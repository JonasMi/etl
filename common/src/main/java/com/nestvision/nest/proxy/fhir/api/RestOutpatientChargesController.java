package com.nestvision.nest.proxy.fhir.api;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.nestvision.nest.proxy.base.api.request.Consts;
import com.nestvision.nest.proxy.base.api.response.EmptyRestResponse;
import com.nestvision.nest.proxy.base.api.response.RestResponse;
import com.nestvision.nest.proxy.base.api.response.RestResponseFactory;
import com.nestvision.nest.proxy.fhir.api.request.OutpatientChargesFindRequest;
import com.nestvision.nest.proxy.fhir.api.response.OutpatientChargesDetails;
import com.nestvision.nest.proxy.fhir.api.response.OutpatientChargesRecord;

import com.nestvision.nest.proxy.fhir.entity.OutpatientCharges;
import com.nestvision.nest.proxy.fhir.service.OutpatientChargesService;
import com.nestvision.nest.proxy.nest.api.FhirResourceEntityControllerSupport;
import com.nestvision.nest.proxy.nest.api.response.NestRequestDetail;
import com.nestvision.nest.proxy.nest.api.response.NestRequestRecord;
import com.nestvision.nest.proxy.nest.api.response.SendResult;
import com.nestvision.nest.proxy.transform.model.NestRequest;

@RestController
@RequestMapping("/api/OutpatientCharges")
public class RestOutpatientChargesController extends FhirResourceEntityControllerSupport<OutpatientCharges> {
		
    @Autowired
    private OutpatientChargesService outpatientChargesService;

    @GetMapping("/{id}")
    public RestResponse<OutpatientChargesDetails> get(@PathVariable String id, HttpServletRequest request) {
        if (!hasGetPermission(OutpatientCharges.class, request)) {
            return RestResponseFactory.newAuthErrorResponse("没有权限获取[" + OutpatientCharges.class.getSimpleName() + "]消息详情的权限");
        }
        OutpatientCharges outpatientCharges = outpatientChargesService.findOne(id);
        if (outpatientCharges == null) {
            return RestResponseFactory.newNotFoundErrorResponse("指定获取的消息 - 类型[" + OutpatientCharges.class.getSimpleName() + "],ID[" + id + "] 不存在!");
        }
        OutpatientChargesDetails outpatientChargesDetails = new OutpatientChargesDetails(outpatientCharges);
        return RestResponseFactory.newSuccessResponse("获取消息详情成功", outpatientChargesDetails);
    }

    @GetMapping("/{id}/nestRequests")
    public RestResponse<List<NestRequestRecord>> findNestRequests(@PathVariable String id, HttpServletRequest request) {
        if (!hasGetPermission(OutpatientCharges.class, request)) {
            return RestResponseFactory.newAuthErrorResponse("没有权限获取[" + OutpatientCharges.class.getSimpleName() + "]消息的请求记录");
        }
        List<NestRequest> nestRequests = findNestRequests(id);

        List<NestRequestRecord> nestRequestRecords = new ArrayList<>(nestRequests.size());
        for (NestRequest nestRequest : nestRequests) {
            NestRequestRecord nestRequestRecord = new NestRequestRecord(nestRequest);
            nestRequestRecords.add(nestRequestRecord);
        }
        return RestResponseFactory.newSuccessResponse("获取消息请求记录成功", nestRequestRecords);
    }

    @GetMapping("/nestRequestRecords/{id}")
    public RestResponse<NestRequestRecord> getNestRequestRecord(@PathVariable String id, HttpServletRequest request) {
        if (!hasGetPermission(OutpatientCharges.class, request)) {
            return RestResponseFactory.newAuthErrorResponse("没有权限获取[" + OutpatientCharges.class.getSimpleName() + "]消息的请求");
        }
        NestRequest nestRequest = findNestRequestById(id);
        if (nestRequest == null) {
            return RestResponseFactory.newNotFoundErrorResponse("Nest请求不存在:" + id);
        }
        NestRequestRecord nestRequestRecord = new NestRequestRecord(nestRequest);
        return RestResponseFactory.newSuccessResponse(nestRequestRecord);
    }

    @GetMapping("/nestRequests/{id}")
    public RestResponse<NestRequestDetail> getNestRequest(@PathVariable String id, HttpServletRequest request) {
        if (!hasGetPermission(OutpatientCharges.class, request)) {
            return RestResponseFactory.newAuthErrorResponse("没有权限获取[" + OutpatientCharges.class.getSimpleName() + "]消息的请求详情");
        }
        NestRequest nestRequest = findNestRequestById(id);
        if (nestRequest == null) {
            return RestResponseFactory.newNotFoundErrorResponse("Nest请求不存在:" + id);
        }
        NestRequestDetail nestRequestDetail = new NestRequestDetail(nestRequest);
        return RestResponseFactory.newSuccessResponse(nestRequestDetail);
    }

    @GetMapping("/")
    public RestResponse<Page<OutpatientChargesRecord>> find(@Valid @ModelAttribute OutpatientChargesFindRequest outpatientChargesFindRequest, BindingResult bindingResult,
                                                   HttpServletRequest request) {
        if (!hasFindPermission(OutpatientCharges.class, request)) {
            return RestResponseFactory.newAuthErrorResponse("没有权限获取[" + OutpatientCharges.class.getSimpleName() + "]消息记录列表的权限");
        }
        Map<String, Object> errors = fetchErrors(bindingResult);
        if (!errors.isEmpty()) {
            return RestResponseFactory.newInputErrorResponse(errors);
        }
        Pageable pageable = outpatientChargesFindRequest.convertToPageRequest();
        Specification<OutpatientCharges> specification = outpatientChargesFindRequest.convertToSpecification();
        Page<OutpatientCharges> originalPage = outpatientChargesService.findAll(specification, pageable);

        List<OutpatientCharges> originalContent = originalPage.getContent();
        List<OutpatientChargesRecord> content = new ArrayList<>(originalContent.size());
        for (OutpatientCharges outpatientCharges : originalContent) {
            OutpatientChargesRecord outpatientChargesRecord = new OutpatientChargesRecord(outpatientCharges);
            content.add(outpatientChargesRecord);
        }
        Page<OutpatientChargesRecord> page = new PageImpl<>(content, pageable, originalPage.getTotalElements());
        return RestResponseFactory.newSuccessResponse("获取消息列表成功", page);
    }

    @DeleteMapping("/{id}")
    public EmptyRestResponse delete(@PathVariable String id, HttpServletRequest request) {
        if (!hasDeletePermission(OutpatientCharges.class, request)) {
            return RestResponseFactory.newAuthErrorResponse("没有权限删除[" + OutpatientCharges.class.getSimpleName() + "]消息记录");
        }
        if (!outpatientChargesService.exists(id)) {
            return RestResponseFactory.newNotFoundErrorResponse("指定删除的消息 - 类型[" + OutpatientCharges.class.getSimpleName() + "],ID[" + id + "] 不存在!");
        }
        outpatientChargesService.delete(id);
        return RestResponseFactory.newSuccessEmptyResponse("删除消息成功");
    }

    @PostMapping("/deleteAll")
    public EmptyRestResponse deleteAll(@RequestParam("id[]") String[] id, HttpServletRequest request) {
        if (!hasDeletePermission(OutpatientCharges.class, request)) {
            return RestResponseFactory.newAuthErrorResponse("没有权限删除[" + OutpatientCharges.class.getSimpleName() + "]消息记录");
        }
        if (id == null || id.length == 0) {
            return RestResponseFactory.newInputErrorResponse("id[]", "指定的消息ID不能为空");
        }
        outpatientChargesService.deleteAll(id);
        return RestResponseFactory.newSuccessEmptyResponse("删除消息成功");
    }

    @PostMapping("/{id}/send")
    public RestResponse<List<SendResult>> send(@PathVariable String id, @RequestParam(required = false) Integer option, HttpServletRequest request) {
        if (!hasSendPermission(OutpatientCharges.class, request)) {
            return RestResponseFactory.newAuthErrorResponse("没有权限发送[" + OutpatientCharges.class.getSimpleName() + "]消息记录");
        }
        List<NestRequest> nestRequests = null;
        int optionValue = option != null ? option.intValue() : Consts.SEND_OPTION_NOT_SUCCESS;
        if (optionValue == Consts.SEND_OPTION_SUCCESS) {
            nestRequests = findNestRequests(id, true);// 所有已成功请求
        } else if (optionValue == Consts.SEND_OPTION_ALL) {
            nestRequests = findNestRequests(id);// 所有请求
        } else {
            nestRequests = findNestRequests(id, false);// 所有未成功的请求
        }
        if (nestRequests != null && !nestRequests.isEmpty()) {
            List<SendResult> sendResults = internalSendAllNestRequests(nestRequests);
            return RestResponseFactory.newSuccessResponse(sendResults);
        }
        return RestResponseFactory.newNotFoundErrorResponse("这条消息还没有被解析成Nest请求");
    }

    @PostMapping("/sendAllNestRequests")
    public RestResponse<Map<String, SendResult>> sendAllNestRequests(@RequestParam("nestRequestId[]") String[] nestRequestIds, HttpServletRequest request) {

        if (!hasSendPermission(OutpatientCharges.class, request)) {
            return RestResponseFactory.newAuthErrorResponse("没有权限发送[" + OutpatientCharges.class.getSimpleName() + "]消息");
        }
        if (nestRequestIds == null || nestRequestIds.length == 0) {
            return RestResponseFactory.newInputErrorResponse("nestRequestId[]", "没有传入任何NestRequest的ID");
        }
        Map<String, SendResult> sendResultMap = new HashMap<>(nestRequestIds.length);

        for (String nestRequestId : nestRequestIds) {

            NestRequest nestRequest = findNestRequestById(nestRequestId);
            if (nestRequest != null) {
                sendResultMap.put(nestRequestId, internalSendNestRequest(nestRequest));
            } else {
                sendResultMap.put(nestRequestId, new SendResult(false, false, "指定的NestRequest不存在,ID=" + nestRequestId));
            }

        }
        return RestResponseFactory.newSuccessResponse(sendResultMap);

    }

    @PostMapping("/sendNestRequest")
    public RestResponse<SendResult> sendNestRequest(String nestRequestId, HttpServletRequest request) {

        if (!hasSendPermission(OutpatientCharges.class, request)) {
            return RestResponseFactory.newAuthErrorResponse("没有权限发送[" + OutpatientCharges.class.getSimpleName() + "]消息");
        }
        NestRequest nestRequest = findNestRequestById(nestRequestId);
        if (nestRequest == null) {
            return RestResponseFactory.newNotFoundErrorResponse("指定的NestRequest不存在,ID=" + nestRequestId);
        }
        SendResult sendResult = internalSendNestRequest(nestRequest);
        return RestResponseFactory.newSuccessResponse(sendResult);

    }

    @PostMapping("/sendAll")
    public RestResponse<Map<String, List<SendResult>>> sendAll(@RequestParam("id[]") String[] id, @RequestParam(required = false) Integer option,
                                                               HttpServletRequest request) {
        if (!hasSendPermission(OutpatientCharges.class, request)) {
            return RestResponseFactory.newAuthErrorResponse("没有权限发送[" + OutpatientCharges.class.getSimpleName() + "]消息记录");
        }
        if (id == null || id.length == 0) {
            return RestResponseFactory.newInputErrorResponse("id[]", "指定的消息ID不能为空");
        }
        int optionValue = option != null ? option.intValue() : Consts.SEND_OPTION_NOT_SUCCESS;
        Map<String, List<SendResult>> resultMap = new HashMap<>(id.length);
        for (String messageId : id) {
            List<NestRequest> nestRequests = null;
            if (optionValue == Consts.SEND_OPTION_SUCCESS) {
                nestRequests = findNestRequests(messageId, true);// 所有已成功请求
            } else if (optionValue == Consts.SEND_OPTION_ALL) {
                nestRequests = findNestRequests(messageId);// 所有请求
            } else {
                nestRequests = findNestRequests(messageId, false);// 所有未成功的请求
            }
            if (nestRequests != null && !nestRequests.isEmpty()) {
                resultMap.put(messageId, internalSendAllNestRequests(nestRequests));
            }

        }
        return RestResponseFactory.newSuccessResponse(resultMap);
    }

}