package com.nestvision.nest.proxy.fhir.service.impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nestvision.nest.proxy.base.dao.BaseRepository;
import com.nestvision.nest.proxy.base.service.AbstractBaseService;
import com.nestvision.nest.proxy.fhir.dao.BirthCertificateRepository;
import com.nestvision.nest.proxy.fhir.entity.BirthCertificate;
import com.nestvision.nest.proxy.fhir.service.BirthCertificateService;

@Service
public class DefaultBirthCertificateService extends AbstractBaseService<BirthCertificate, String> implements BirthCertificateService {

    @Autowired
    private BirthCertificateRepository birthCertificateRepository;

    @Override
    protected BaseRepository<BirthCertificate, String> getBaseRepository() {

        return birthCertificateRepository;
    }

}
