package com.nestvision.nest.proxy.fhir.dao;
import org.springframework.stereotype.Repository;

import com.nestvision.nest.proxy.base.dao.BaseRepository;
import com.nestvision.nest.proxy.fhir.entity.PathologicalReport;

@Repository
public interface PathologicalReportRepository extends BaseRepository<PathologicalReport, String>{

}