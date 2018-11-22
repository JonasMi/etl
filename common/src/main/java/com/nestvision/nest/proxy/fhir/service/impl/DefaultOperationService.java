package com.nestvision.nest.proxy.fhir.service.impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nestvision.nest.proxy.base.dao.BaseRepository;
import com.nestvision.nest.proxy.base.service.AbstractBaseService;
import com.nestvision.nest.proxy.fhir.dao.OperationRepository;
import com.nestvision.nest.proxy.fhir.entity.Operation;
import com.nestvision.nest.proxy.fhir.service.OperationService;

@Service
public class DefaultOperationService extends AbstractBaseService<Operation, String> implements OperationService {

    @Autowired
    private OperationRepository operationRepository;

    @Override
    protected BaseRepository<Operation, String> getBaseRepository() {

        return operationRepository;
    }

}
