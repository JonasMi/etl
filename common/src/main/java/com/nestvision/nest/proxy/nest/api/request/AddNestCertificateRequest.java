package com.nestvision.nest.proxy.nest.api.request;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;
import org.springframework.web.multipart.MultipartFile;

public class AddNestCertificateRequest {

    @NotBlank(message = "Nest证书所属机构CN不能为空")
    private String cn;

    @NotNull(message = "请上传Nest证书文件")
    private MultipartFile file;

    @NotBlank(message = "Nest证书文件的密码不能为空")
    private String password;

    public String getCn() {
        return cn;
    }

    public void setCn(String cn) {
        this.cn = cn;
    }

    public MultipartFile getFile() {
        return file;
    }

    public void setFile(MultipartFile file) {
        this.file = file;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
