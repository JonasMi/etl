package com.nestvision.nest.proxy.fhir.api.response;

import com.nestvision.nest.proxy.base.api.response.FhirResourceRecord;
import com.nestvision.nest.proxy.fhir.entity.Appointment;

public class AppointmentRecord extends FhirResourceRecord {

    public AppointmentRecord(Appointment appointment) {
        super(appointment);
    }
}