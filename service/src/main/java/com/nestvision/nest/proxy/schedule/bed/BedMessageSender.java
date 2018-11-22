package com.nestvision.nest.proxy.schedule.bed;
import org.springframework.stereotype.Component;
import java.util.Arrays;
import java.util.List;
import com.nestvision.nest.proxy.schedule.AbstractMultipleMessageSender;
import com.nestvision.nest.proxy.schedule.SoapRequest;
import com.nestvision.nest.proxy.fhir.entity.FhirResourceEntity.OperationState;
import com.nestvision.nest.proxy.fhir.entity.Bed;

@Component
public class BedMessageSender extends AbstractMultipleMessageSender<Bed> {

    private static final String NEW_SOAPACTION = "http://www.aixin-health.com/platform/data/location/new";
    private static final String UPDATE_SOAPACTION = "http://www.aixin-health.com/platform/data/location/update";
  
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
    protected List<SoapRequest> createSoapRequests(Bed message) {
        SoapRequest soapRequest = new SoapRequest();
        soapRequest.setSoapAction(detectSoapAction(message.getOperationState()));
        soapRequest.setResourceType("Location");
        soapRequest.setBody(createRequestBody(message));

        return Arrays.asList(soapRequest);
    }

}