package com.nestvision.nest.proxy.nest.api;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.nestvision.nest.proxy.base.api.RestControllerSupport;
import com.nestvision.nest.proxy.base.api.response.EmptyRestResponse;
import com.nestvision.nest.proxy.base.api.response.RestResponse;
import com.nestvision.nest.proxy.base.api.response.RestResponseFactory;
import com.nestvision.nest.proxy.nest.api.request.AddNestCertificateRequest;
import com.nestvision.nest.proxy.nest.api.request.UpdateNestCertificateRequest;
import com.nestvision.nest.proxy.nest.api.response.NestCertificateDetails;
import com.nestvision.nest.proxy.nest.api.response.NestCertificateInfo;
import com.nestvision.nest.proxy.nest.entity.NestCertificate;
import com.nestvision.nest.proxy.nest.service.NestCertificateService;

@RestController
@RequestMapping("/api/NestCertificate")
public class RestNestCertificateController extends RestControllerSupport {

    @Autowired
    private NestCertificateService nestCertificateService;

    @GetMapping("/")
    public RestResponse<List<NestCertificateInfo>> findAll() {

        List<NestCertificate> nestCertificates = nestCertificateService.findAll();
        List<NestCertificateInfo> nestCertificateInfos = new ArrayList<>(nestCertificates.size());
        for (NestCertificate nestCertificate : nestCertificates) {
            nestCertificateInfos.add(new NestCertificateInfo(nestCertificate));
        }
        return RestResponseFactory.newSuccessResponse("获取Nest证书列表成功", nestCertificateInfos);

    }

    @GetMapping("/{cn}")
    public RestResponse<NestCertificateDetails> get(@PathVariable String cn) {

        NestCertificate nestCertificate = nestCertificateService.findOne(cn);
        if (nestCertificate == null) {
            return RestResponseFactory.newNotFoundErrorResponse("Nest证书[" + cn + "]不存在!");
        }
        return RestResponseFactory.newSuccessResponse("获取Nest证书详情成功", new NestCertificateDetails(nestCertificate));
    }

    @PostMapping(value = "/")
    public EmptyRestResponse add(@ModelAttribute @Valid AddNestCertificateRequest addNestCertificateReqeust, BindingResult bindingResult) throws Exception {

        Map<String, Object> errors = fetchErrors(bindingResult);
        if (!errors.isEmpty()) {
            return RestResponseFactory.newInputErrorEmptyResponse(errors);
        }
        if (nestCertificateService.exists(addNestCertificateReqeust.getCn())) {
            return RestResponseFactory.newErrorEmptyResponse("Nest证书的CN重复了:" + addNestCertificateReqeust.getCn());
        }
        NestCertificate nestCertificate = new NestCertificate();
        copyProperties(addNestCertificateReqeust, nestCertificate);
        nestCertificateService.save(nestCertificate);
        return RestResponseFactory.newSuccessEmptyResponse("成功新增一个Nest证书:" + addNestCertificateReqeust.getCn());
    }

    @PostMapping(value = "/update")
    public EmptyRestResponse update(@ModelAttribute @Valid UpdateNestCertificateRequest updateNestCertificateRequest, BindingResult bindingResult)
                    throws Exception {

        Map<String, Object> errors = fetchErrors(bindingResult);
        if (!errors.isEmpty()) {
            return RestResponseFactory.newInputErrorEmptyResponse(errors);
        }
        NestCertificate nestCertificate = nestCertificateService.findOne(updateNestCertificateRequest.getCn());
        if (nestCertificate == null) {
            return RestResponseFactory.newNotFoundErrorEmptyResponse("Nest证书[" + updateNestCertificateRequest.getCn() + "]不存在!");
        }

        copyProperties(updateNestCertificateRequest, nestCertificate);
        nestCertificateService.save(nestCertificate);
        return RestResponseFactory.newSuccessEmptyResponse("成功更新一个Nest证书:" + updateNestCertificateRequest.getCn());
    }

    @DeleteMapping("/{cn}")
    public EmptyRestResponse delete(@PathVariable String cn) {
        if (!nestCertificateService.exists(cn)) {
            return RestResponseFactory.newNotFoundErrorEmptyResponse("Nest证书[" + cn + "]不存在!");
        }
        nestCertificateService.delete(cn);
        return RestResponseFactory.newSuccessEmptyResponse("成功删除一个Nest证书:" + cn);
    }

    private void copyProperties(AddNestCertificateRequest addNestCertificateReqeust, NestCertificate nestCertificate) throws IOException {
        nestCertificate.setCn(addNestCertificateReqeust.getCn());
        nestCertificate.setPassword(addNestCertificateReqeust.getPassword());
        MultipartFile multipartFile = addNestCertificateReqeust.getFile();
        nestCertificate.setContent(multipartFile.getBytes());

    }
}
