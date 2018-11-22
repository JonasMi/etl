package com.nestvision.nest.proxy.schedule.adulthealthexamination;
import org.springframework.stereotype.Component;
import java.util.Arrays;
import java.util.List;
import com.nestvision.nest.proxy.schedule.AbstractMultipleMessageSender;
import com.nestvision.nest.proxy.schedule.SoapRequest;
import com.nestvision.nest.proxy.fhir.entity.FhirResourceEntity.OperationState;
import com.nestvision.nest.proxy.fhir.entity.AdultHealthExamination;

@Component
public class AdultHealthExaminationMessageSender extends AbstractMultipleMessageSender<AdultHealthExamination> {

    private static final String NEW_SOAPACTION = "http://www.aixin-health.com/platform/data/adulthealthexamination/new";
    private static final String UPDATE_SOAPACTION = "http://www.aixin-health.com/platform/data/adulthealthexamination/update";
  
    protected String detectSoapAction(OperationState state) {

        switch (state) {
        case CREATE:

            return NEW_SOAPACTION;
        case UPDATE:
            return UPDATE_SOAPACTION;

        default:
            throw new UnsupportedOperationException("不支持的 OperationState:" + state);
        }
    }

    
    @Override
    protected List<SoapRequest> createSoapRequests(AdultHealthExamination message) {
        SoapRequest soapRequest = new SoapRequest();
        soapRequest.setSoapAction(detectSoapAction(message.getOperationState()));
        soapRequest.setResourceType("AdultHealthExamination");
        soapRequest.setBody(createRequestBody(message));

        return Arrays.asList(soapRequest);
    }

}