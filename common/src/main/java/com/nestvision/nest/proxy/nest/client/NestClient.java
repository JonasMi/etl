package com.nestvision.nest.proxy.nest.client;

import javax.xml.transform.Source;

import com.nestvision.nest.proxy.nest.service.NestCertificateService;

public interface NestClient {

    public NestResponse request(Source request, String resourceType, String soapAction);

}
