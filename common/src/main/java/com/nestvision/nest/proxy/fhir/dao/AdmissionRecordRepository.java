package com.nestvision.nest.proxy.fhir.dao;
import org.springframework.stereotype.Repository;

import com.nestvision.nest.proxy.base.dao.BaseRepository;
import com.nestvision.nest.proxy.fhir.entity.AdmissionRecord;

@Repository
public interface AdmissionRecordRepository extends BaseRepository<AdmissionRecord, String>{

}