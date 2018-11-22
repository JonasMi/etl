package com.nestvision.nest.proxy.nest;

public class NestCertificateNotFoundException extends NestCertificateException {

    /**
     * 
     */
    private static final long serialVersionUID = 1485023508178052743L;

    private String cn;

    public NestCertificateNotFoundException(String cn) {

        super("无法找到CN为:" + cn + "的Nest证书");
        this.cn = cn;

    }
    public String getCn() {
        return cn;
    }
}
