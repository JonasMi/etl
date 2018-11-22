package com.nestvision.nest.proxy.fhir.dao;
import org.springframework.stereotype.Repository;

import com.nestvision.nest.proxy.base.dao.BaseRepository;
import com.nestvision.nest.proxy.fhir.entity.OutpatientMedicalRecord;

@Repository
public interface OutpatientMedicalRecordRepository extends BaseRepository<OutpatientMedicalRecord, String>{

}