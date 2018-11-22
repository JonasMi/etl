package com.nestvision.nest.proxy.nest.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nestvision.nest.proxy.base.dao.BaseRepository;
import com.nestvision.nest.proxy.base.service.AbstractBaseService;
import com.nestvision.nest.proxy.nest.dao.NestCertificateRepository;
import com.nestvision.nest.proxy.nest.entity.NestCertificate;
import com.nestvision.nest.proxy.nest.service.NestCertificateService;

@Service
public class DefaultNestCertificateService extends AbstractBaseService<NestCertificate, String> implements NestCertificateService {

    @Autowired
    private NestCertificateRepository nestCertificateRepository;

    @Override
    protected BaseRepository<NestCertificate, String> getBaseRepository() {

        return nestCertificateRepository;
    }
	@Override
	public NestCertificate findByCn(String cn) {
		return nestCertificateRepository.findByCn(cn);
	}

}
