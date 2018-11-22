package com.nestvision.nest.proxy.nest.api.response;

import java.util.HashMap;
import java.util.Map;

public class LogicPhsicalMappingHolder {

    private static Map<String, String> tableMappings = new HashMap<>();

    private static Map<String, String> interfaceMappings = new HashMap<>();

    public static Map<String, String> getTableMappings() {
        return tableMappings;
    }

    public static void setTableMappings(Map<String, String> tableMappings) {
        LogicPhsicalMappingHolder.tableMappings = tableMappings;
    }

    public static Map<String, String> getInterfaceMappings() {
        return interfaceMappings;
    }

    public static void setInterfaceMappings(Map<String, String> interfaceMappings) {
        LogicPhsicalMappingHolder.interfaceMappings = interfaceMappings;
    }

}
