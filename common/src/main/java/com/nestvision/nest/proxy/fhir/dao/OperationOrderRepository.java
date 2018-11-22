package com.nestvision.nest.proxy.fhir.dao;
import org.springframework.stereotype.Repository;

import com.nestvision.nest.proxy.base.dao.BaseRepository;
import com.nestvision.nest.proxy.fhir.entity.OperationOrder;

@Repository
public interface OperationOrderRepository extends BaseRepository<OperationOrder, String>{

}