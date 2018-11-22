package com.nestvision.nest.proxy.history.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.nestvision.nest.proxy.base.entity.BaseEntity;

@Table(name = BaseEntity.TABLE_PREFIX + "MATCHER_CONFIGURATION_MAPPING")
@Entity
public class MatcherConfigurationMapping {

    @Id
    @Column(length=100)
    private String clazz;

    @Column(columnDefinition = "text")
    private String matcher;

    public String getClazz() {
        return clazz;
    }

    public void setClazz(String clazz) {
        this.clazz = clazz;
    }

    public String getMatcher() {
        return matcher;
    }

    public void setMatcher(String matcher) {
        this.matcher = matcher;
    }
}
