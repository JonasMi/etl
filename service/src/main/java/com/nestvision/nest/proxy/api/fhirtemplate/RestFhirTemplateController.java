package com.nestvision.nest.proxy.api.fhirtemplate;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nestvision.nest.proxy.base.api.RestControllerSupport;
import com.nestvision.nest.proxy.base.api.response.EmptyRestResponse;
import com.nestvision.nest.proxy.base.api.response.RestResponse;
import com.nestvision.nest.proxy.base.api.response.RestResponseFactory;
import com.nestvision.nest.proxy.nest.entity.FhirTemplate;
import com.nestvision.nest.proxy.nest.service.FhirTemplateService;

@RestController
@RequestMapping("/api/FhirTemplate")
public class RestFhirTemplateController extends RestControllerSupport {

    @Autowired
    private FhirTemplateService fhirTemplateService;

    @GetMapping("/")
    public RestResponse<List<FhirTemplateInfo>> findAll() {

        List<FhirTemplate> templates = fhirTemplateService.findAll();
        List<FhirTemplateInfo> templateInfos = new ArrayList<>(templates.size());
        for (FhirTemplate fhirTemplate : templates) {
            templateInfos.add(new FhirTemplateInfo(fhirTemplate));
        }
        return RestResponseFactory.newSuccessResponse("获取Fhir消息模板列表成功", templateInfos);

    }

    @GetMapping("/{name}")
    public RestResponse<FhirTemplateDetails> get(@PathVariable String name) {

        FhirTemplate fhirTemplate = fhirTemplateService.findOne(name);
        if (fhirTemplate == null) {
            return RestResponseFactory.newNotFoundErrorResponse("Fhir消息模板[" + name + "]不存在!");
        }
        return RestResponseFactory.newSuccessResponse("获取Fhir消息模板详情成功", new FhirTemplateDetails(fhirTemplate));
    }

    @PostMapping(value = "/", consumes = "application/json")
    public EmptyRestResponse add(@RequestBody @Valid AddFhirTemplateRequest addFhirTemplateRequest, BindingResult bindingResult) {

        Map<String, Object> errors = fetchErrors(bindingResult);
        if (!errors.isEmpty()) {
            return RestResponseFactory.newInputErrorEmptyResponse(errors);
        }
        if (fhirTemplateService.exists(addFhirTemplateRequest.getName())) {
            return RestResponseFactory.newErrorEmptyResponse("Fhir消息模板的名称重复了:" + addFhirTemplateRequest.getName());
        }
        FhirTemplate fhirTemplate = new FhirTemplate();
        copyProperties(addFhirTemplateRequest, fhirTemplate);
        fhirTemplateService.save(fhirTemplate);
        return RestResponseFactory.newSuccessEmptyResponse("成功新增一个Fhir消息模板:" + addFhirTemplateRequest.getName());
    }

    @PutMapping(value = "/", consumes = "application/json")
    public EmptyRestResponse update(@RequestBody @Valid UpdateFhirTemplateRequest updateFhirTemplateRequest, BindingResult bindingResult) {

        Map<String, Object> errors = fetchErrors(bindingResult);
        if (!errors.isEmpty()) {
            return RestResponseFactory.newInputErrorEmptyResponse(errors);
        }
        FhirTemplate fhirTemplate = fhirTemplateService.findOne(updateFhirTemplateRequest.getName());
        if (fhirTemplate == null) {
            return RestResponseFactory.newErrorEmptyResponse("Fhir消息模板不存在:" + updateFhirTemplateRequest.getName());
        }
        copyProperties(updateFhirTemplateRequest, fhirTemplate);
        fhirTemplateService.save(fhirTemplate);
        return RestResponseFactory.newSuccessEmptyResponse("成功更新一个Fhir消息模板:" + updateFhirTemplateRequest.getName());
    }

    @DeleteMapping("/{name}")
    public EmptyRestResponse delete(@PathVariable String name) {
        if (!fhirTemplateService.exists(name)) {
            return RestResponseFactory.newNotFoundErrorEmptyResponse("Fhir消息模板[" + name + "]不存在!");
        }
        fhirTemplateService.delete(name);
        return RestResponseFactory.newSuccessEmptyResponse("成功删除一个Fhir消息模板:" + name);
    }

    private void copyProperties(AddFhirTemplateRequest addFhirTemplateRequest, FhirTemplate fhirTemplate) {
        fhirTemplate.setName(addFhirTemplateRequest.getName());
        fhirTemplate.setTemplate(addFhirTemplateRequest.getTemplate());
    }

}
