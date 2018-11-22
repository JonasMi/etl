package com.nestvision.nest.proxy.nest.dao;

import org.springframework.stereotype.Repository;

import com.nestvision.nest.proxy.base.dao.BaseRepository;
import com.nestvision.nest.proxy.nest.entity.FhirTemplate;

@Repository
public interface FhirTemplateRepository extends BaseRepository<FhirTemplate, String>{

}
