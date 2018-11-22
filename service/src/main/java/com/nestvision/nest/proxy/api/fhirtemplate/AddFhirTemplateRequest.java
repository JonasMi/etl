package com.nestvision.nest.proxy.api.fhirtemplate;

import org.hibernate.validator.constraints.NotBlank;

public class AddFhirTemplateRequest {

    @NotBlank(message = "模板名称不能为空")
    private String name;

    @NotBlank(message = "模板内容不能为空")
    private String template;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTemplate() {
        return template;
    }

    public void setTemplate(String template) {
        this.template = template;
    }
    
    
}
