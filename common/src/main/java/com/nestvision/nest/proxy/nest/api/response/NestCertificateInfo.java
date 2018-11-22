package com.nestvision.nest.proxy.nest.api.response;

import com.nestvision.nest.proxy.base.api.response.RestResponseBean;
import com.nestvision.nest.proxy.nest.entity.NestCertificate;

public class NestCertificateInfo extends RestResponseBean<NestCertificate> {

    private String cn;

    private String password;

    public NestCertificateInfo(NestCertificate entity) {
        super(entity);
        this.cn = entity.getCn();
        this.password = entity.getPassword();
    }

    public String getCn() {
        return cn;
    }

    public String getPassword() {
        return password;
    }

}
