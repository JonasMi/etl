package com.nestvision.nest.proxy.nest.dao;

import org.springframework.stereotype.Repository;

import com.nestvision.nest.proxy.base.dao.BaseRepository;
import com.nestvision.nest.proxy.nest.entity.NestCertificate;

@Repository
public interface NestCertificateRepository extends BaseRepository<NestCertificate, String>{

	public NestCertificate findByCn(String cn);

}
