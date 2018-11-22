package com.nestvision.nest.proxy.schedule.inpatientsymptom;
import org.springframework.stereotype.Component;
import java.util.Arrays;
import java.util.List;
import com.nestvision.nest.proxy.schedule.AbstractMultipleMessageSender;
import com.nestvision.nest.proxy.schedule.SoapRequest;
import com.nestvision.nest.proxy.fhir.entity.FhirResourceEntity.OperationState;
import com.nestvision.nest.proxy.fhir.entity.InpatientSymptom;

@Component
public class InpatientSymptomMessageSender extends AbstractMultipleMessageSender<InpatientSymptom> {

    private static final String NEW_SOAPACTION = "http://www.aixin-health.com/platform/data/condition/new";
    private static final String UPDATE_SOAPACTION = "http://www.aixin-health.com/platform/data/condition/update";
  
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
    protected List<SoapRequest> createSoapRequests(InpatientSymptom message) {
        SoapRequest soapRequest = new SoapRequest();
        soapRequest.setSoapAction(detectSoapAction(message.getOperationState()));
        soapRequest.setResourceType("Condition");
        soapRequest.setBody(createRequestBody(message));

        return Arrays.asList(soapRequest);
    }

}