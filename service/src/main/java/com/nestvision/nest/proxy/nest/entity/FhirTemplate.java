package com.nestvision.nest.proxy.nest.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

import com.nestvision.nest.proxy.base.entity.BaseEntity;

@Entity
@Table(name = "T_FHIR_TEMPLATE")
public class FhirTemplate extends BaseEntity {

    /**
     * 
     */
    private static final long serialVersionUID = 5620326888349126044L;

    @Id
    @Column(length = 32)
    private String name;

    @Lob
    @Column(columnDefinition = "LongText", length = 16777215)
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
