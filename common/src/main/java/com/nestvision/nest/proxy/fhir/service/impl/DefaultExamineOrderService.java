package com.nestvision.nest.proxy.fhir.service.impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nestvision.nest.proxy.base.dao.BaseRepository;
import com.nestvision.nest.proxy.base.service.AbstractBaseService;
import com.nestvision.nest.proxy.fhir.dao.ExamineOrderRepository;
import com.nestvision.nest.proxy.fhir.entity.ExamineOrder;
import com.nestvision.nest.proxy.fhir.service.ExamineOrderService;

@Service
public class DefaultExamineOrderService extends AbstractBaseService<ExamineOrder, String> implements ExamineOrderService {

    @Autowired
    private ExamineOrderRepository examineOrderRepository;

    @Override
    protected BaseRepository<ExamineOrder, String> getBaseRepository() {

        return examineOrderRepository;
    }

}
