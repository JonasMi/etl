package com.nestvision.nest.proxy.fhir.dao;
import org.springframework.stereotype.Repository;

import com.nestvision.nest.proxy.base.dao.BaseRepository;
import com.nestvision.nest.proxy.fhir.entity.Clinictype;

@Repository
public interface ClinictypeRepository extends BaseRepository<Clinictype, String>{

}