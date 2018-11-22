package com.nestvision.nest.proxy.schedule.admissionrecord;
import org.springframework.stereotype.Component;
import java.util.Arrays;
import java.util.List;
import com.nestvision.nest.proxy.schedule.AbstractMultipleMessageSender;
import com.nestvision.nest.proxy.schedule.SoapRequest;
import com.nestvision.nest.proxy.fhir.entity.FhirResourceEntity.OperationState;
import com.nestvision.nest.proxy.fhir.entity.AdmissionRecord;

@Component
public class AdmissionRecordMessageSender extends AbstractMultipleMessageSender<AdmissionRecord> {

    private static final String NEW_SOAPACTION = "http://www.aixin-health.com/platform/data/admissionrecord/new";
    private static final String UPDATE_SOAPACTION = "http://www.aixin-health.com/platform/data/admissionrecord/update";
  
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
    protected List<SoapRequest> createSoapRequests(AdmissionRecord message) {
        SoapRequest soapRequest = new SoapRequest();
        soapRequest.setSoapAction(detectSoapAction(message.getOperationState()));
        soapRequest.setResourceType("AdmissionRecord");
        soapRequest.setBody(createRequestBody(message));

        return Arrays.asList(soapRequest);
    }

}