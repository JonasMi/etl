package com.nestvision.nest.proxy.nest.service;

import com.nestvision.nest.proxy.base.service.BaseService;
import com.nestvision.nest.proxy.nest.entity.NestCertificate;

public interface NestCertificateService extends BaseService<NestCertificate, String> {

	NestCertificate findByCn(String cn);

}
