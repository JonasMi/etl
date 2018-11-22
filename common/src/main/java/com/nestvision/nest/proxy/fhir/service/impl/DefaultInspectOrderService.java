package com.nestvision.nest.proxy.fhir.service.impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nestvision.nest.proxy.base.dao.BaseRepository;
import com.nestvision.nest.proxy.base.service.AbstractBaseService;
import com.nestvision.nest.proxy.fhir.dao.InspectOrderRepository;
import com.nestvision.nest.proxy.fhir.entity.InspectOrder;
import com.nestvision.nest.proxy.fhir.service.InspectOrderService;

@Service
public class DefaultInspectOrderService extends AbstractBaseService<InspectOrder, String> implements InspectOrderService {

    @Autowired
    private InspectOrderRepository inspectOrderRepository;

    @Override
    protected BaseRepository<InspectOrder, String> getBaseRepository() {

        return inspectOrderRepository;
    }

}
