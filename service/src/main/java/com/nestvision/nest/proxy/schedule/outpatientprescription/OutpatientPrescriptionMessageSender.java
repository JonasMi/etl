package com.nestvision.nest.proxy.schedule.outpatientprescription;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.nestvision.nest.proxy.schedule.AbstractMultipleMessageSender;
import com.nestvision.nest.proxy.schedule.SoapRequest;
import com.nestvision.nest.proxy.fhir.entity.FhirResourceEntity.OperationState;
import com.nestvision.nest.proxy.fhir.entity.OutpatientPrescription;

@Component
public class OutpatientPrescriptionMessageSender extends AbstractMultipleMessageSender<OutpatientPrescription> {

    private static final String NEW_SOAPACTION = "http://www.aixin-health.com/platform/data/medicationorder/new";
    private static final String UPDATE_SOAPACTION = "http://www.aixin-health.com/platform/data/medicationorder/update";
  
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
    protected List<SoapRequest> createSoapRequests(OutpatientPrescription message) {
    	List<SoapRequest> list = new ArrayList<>();
        message.getOutpatientPrescriptionDetails().forEach(outpatientPrescription -> {
            SoapRequest soapRequest = new SoapRequest();
            soapRequest.setSoapAction(detectSoapAction(message.getOperationState()));
            soapRequest.setResourceType("MedicationOrder");
            outpatientPrescription.setOutpatientPrescription(message);
            soapRequest.setBody(createRequestBody(outpatientPrescription));
            list.add(soapRequest);
        });
        return list;
    }

}