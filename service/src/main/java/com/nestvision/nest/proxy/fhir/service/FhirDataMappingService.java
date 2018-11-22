package com.nestvision.nest.proxy.fhir.service;

public interface FhirDataMappingService {

    /**
     * @param table
     *            映射表名称
     * @param key
     *            映射表中的key
     * @param defaultValue
     *            默认值
     * @return 映射表中key所对应的值
     */
    public String getMappingValue(String table, String key, String defaultValue);

    /**
     * @param table
     *            映射表名称
     * @param key
     *            映射表中的key
     *            默认值
     * @return 映射表中key所对应的值
     */
    public String getMappingValue(String table, String key);
}
