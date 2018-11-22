package com.nestvision.nest.proxy.nest.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

@Entity
@Table(name = "T_NEST_CERTIFICATE")
public class NestCertificate implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 21452923534948237L;

    @Id
    @Column(length = 32)
    private String cn;

    @Lob
    private byte[] content;

    @Column(length = 32, nullable = false)
    private String password;

    public String getCn() {
        return cn;
    }

    public void setCn(String cn) {
        this.cn = cn;
    }

    public byte[] getContent() {
        return content;
    }

    public void setContent(byte[] content) {
        this.content = content;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
