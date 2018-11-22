package com.nestvision.nest.proxy.fhir.service.impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nestvision.nest.proxy.base.dao.BaseRepository;
import com.nestvision.nest.proxy.base.service.AbstractBaseService;
import com.nestvision.nest.proxy.fhir.dao.SlotRepository;
import com.nestvision.nest.proxy.fhir.entity.Slot;
import com.nestvision.nest.proxy.fhir.service.SlotService;

@Service
public class DefaultSlotService extends AbstractBaseService<Slot, String> implements SlotService {

    @Autowired
    private SlotRepository slotRepository;

    @Override
    protected BaseRepository<Slot, String> getBaseRepository() {

        return slotRepository;
    }

}
