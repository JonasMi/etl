package com.nestvision.nest.proxy.fhir.service.impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nestvision.nest.proxy.base.dao.BaseRepository;
import com.nestvision.nest.proxy.base.service.AbstractBaseService;
import com.nestvision.nest.proxy.fhir.dao.ChargingItemRepository;
import com.nestvision.nest.proxy.fhir.entity.ChargingItem;
import com.nestvision.nest.proxy.fhir.service.ChargingItemService;

@Service
public class DefaultChargingItemService extends AbstractBaseService<ChargingItem, String> implements ChargingItemService {

    @Autowired
    private ChargingItemRepository chargingItemRepository;

    @Override
    protected BaseRepository<ChargingItem, String> getBaseRepository() {

        return chargingItemRepository;
    }

}
