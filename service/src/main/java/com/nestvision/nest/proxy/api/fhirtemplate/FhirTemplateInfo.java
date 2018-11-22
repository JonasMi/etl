package com.nestvision.nest.proxy.api.fhirtemplate;

import com.nestvision.nest.proxy.base.api.response.RestResponseBean;
import com.nestvision.nest.proxy.nest.entity.FhirTemplate;

public class FhirTemplateInfo extends RestResponseBean<FhirTemplate> {

    private String name;

    private String template;

    public FhirTemplateInfo(FhirTemplate entity) {
        super(entity);
        this.name = entity.getName();
        this.template = entity.getTemplate();
    }

    public String getName() {
        return name;
    }

    public String getTemplate() {
        return template;
    }

}
