package com.nestvision.nest.proxy.fhir.api.response;

import com.nestvision.nest.proxy.base.api.response.FhirResourceRecord;
import com.nestvision.nest.proxy.fhir.entity.Schedule;

public class ScheduleRecord extends FhirResourceRecord {

    public ScheduleRecord(Schedule schedule) {
        super(schedule);
    }
}