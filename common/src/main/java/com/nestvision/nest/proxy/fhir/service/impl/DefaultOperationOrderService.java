package com.nestvision.nest.proxy.fhir.service.impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nestvision.nest.proxy.base.dao.BaseRepository;
import com.nestvision.nest.proxy.base.service.AbstractBaseService;
import com.nestvision.nest.proxy.fhir.dao.OperationOrderRepository;
import com.nestvision.nest.proxy.fhir.entity.OperationOrder;
import com.nestvision.nest.proxy.fhir.service.OperationOrderService;

@Service
public class DefaultOperationOrderService extends AbstractBaseService<OperationOrder, String> implements OperationOrderService {

    @Autowired
    private OperationOrderRepository operationOrderRepository;

    @Override
    protected BaseRepository<OperationOrder, String> getBaseRepository() {

        return operationOrderRepository;
    }

}
