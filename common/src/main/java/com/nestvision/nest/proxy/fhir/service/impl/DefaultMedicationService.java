package com.nestvision.nest.proxy.fhir.service.impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nestvision.nest.proxy.base.dao.BaseRepository;
import com.nestvision.nest.proxy.base.service.AbstractBaseService;
import com.nestvision.nest.proxy.fhir.dao.MedicationRepository;
import com.nestvision.nest.proxy.fhir.entity.Medication;
import com.nestvision.nest.proxy.fhir.service.MedicationService;

@Service
public class DefaultMedicationService extends AbstractBaseService<Medication, String> implements MedicationService {

    @Autowired
    private MedicationRepository medicationRepository;

    @Override
    protected BaseRepository<Medication, String> getBaseRepository() {

        return medicationRepository;
    }

}
