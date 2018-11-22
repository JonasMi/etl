package com.nestvision.nest.proxy.history.api;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.nestvision.nest.proxy.base.api.RestControllerSupport;
import com.nestvision.nest.proxy.base.api.response.EmptyRestResponse;
import com.nestvision.nest.proxy.base.api.response.RestResponse;
import com.nestvision.nest.proxy.base.api.response.RestResponseFactory;
import com.nestvision.nest.proxy.base.util.JSONUtil;
import com.nestvision.nest.proxy.history.api.request.MatcherConfigurationMappingRequest;
import com.nestvision.nest.proxy.history.api.response.MatcherConfigurationMappingDetail;
import com.nestvision.nest.proxy.history.api.response.MatcherConfigurationMappingRecord;
import com.nestvision.nest.proxy.history.entity.MatcherConfigurationMapping;
import com.nestvision.nest.proxy.history.match.MatcherConfiguration;
import com.nestvision.nest.proxy.history.service.MatcherConfigurationMappingService;

@RestController
@RequestMapping("/api/MatcherConfigurationMapping")
public class RestMatcherConfigurationMappingController extends RestControllerSupport {

    @Autowired
    private MatcherConfigurationMappingService matcherConfigurationMappingService;

    @GetMapping("/get")
    public RestResponse<MatcherConfigurationMappingDetail> get(String clazz) {
        
        MatcherConfigurationMapping mapping =matcherConfigurationMappingService.findOne(clazz);
        if(mapping==null){
            return RestResponseFactory.newNotFoundErrorResponse("匹配规则不存在:"+clazz);
        }
        return RestResponseFactory.newSuccessResponse(new MatcherConfigurationMappingDetail(mapping));
    }

    @GetMapping("/")
    public RestResponse<List<MatcherConfigurationMappingRecord>> findAll() {

        List<MatcherConfigurationMapping> mappings = matcherConfigurationMappingService.findAll();
        List<MatcherConfigurationMappingRecord> records = new ArrayList(mappings.size());
        for (MatcherConfigurationMapping mapping : mappings) {
            records.add(new MatcherConfigurationMappingRecord(mapping));
        }
        return RestResponseFactory.newSuccessResponse(records);
    }

    @DeleteMapping("/{clazz}")
    public EmptyRestResponse delete(@PathVariable String clazz) {
        matcherConfigurationMappingService.delete(clazz);
        return RestResponseFactory.newSuccessEmptyResponse();
    }

    @DeleteMapping("/clear")
    public EmptyRestResponse clear() {
        matcherConfigurationMappingService.deleteAll();
        return RestResponseFactory.newSuccessEmptyResponse();
    }

    @RequestMapping(value = "/", method = { RequestMethod.POST, RequestMethod.PUT }, consumes = MediaType.APPLICATION_JSON_VALUE)
    public EmptyRestResponse save(@RequestBody @Valid MatcherConfigurationMappingRequest matcherConfigurationMappingRequest, BindingResult bindingResult) {
        Map<String, Object> errors = fetchErrors(bindingResult);
        if (!errors.isEmpty()) {
            return RestResponseFactory.newInputErrorEmptyResponse(errors);
        }

        String clazz = matcherConfigurationMappingRequest.getClazz();
        MatcherConfiguration matcher = matcherConfigurationMappingRequest.getMatcher();
        MatcherConfigurationMapping mapping = new MatcherConfigurationMapping();
        mapping.setClazz(clazz);
        String matcherJSON = JSONUtil.toJSONString(matcher);
        mapping.setMatcher(matcherJSON);
        matcherConfigurationMappingService.save(mapping);
        return RestResponseFactory.newSuccessEmptyResponse();
    }
    /*@Autowired
    private DataQualityErrorRateSchedule dataQualityErrorRateSchedule;
    @RequestMapping(value="/test/")
    public void test(){
    	dataQualityErrorRateSchedule.statisticsErrorIdentifier();
    }*/
}
