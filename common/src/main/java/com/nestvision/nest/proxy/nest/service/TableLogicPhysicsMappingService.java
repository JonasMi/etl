package com.nestvision.nest.proxy.nest.service;

import com.nestvision.nest.proxy.base.service.BaseService;
import com.nestvision.nest.proxy.nest.entity.InterfaceLogicPhysicsMapping;
import com.nestvision.nest.proxy.nest.entity.TableLogicPhysicsMapping;

public interface TableLogicPhysicsMappingService extends BaseService<TableLogicPhysicsMapping, String> {
    public String getTableLogicName(String physicalName);

    public String getNameBySystemValue(String systemValue);

    public String getInteractionNameByResource(String resource);

    public Boolean assertResourceExist(String resource);

    public InterfaceLogicPhysicsMapping getInterfaceNameMapping(String resource);

    public TableLogicPhysicsMapping getTableLogicPhysicsMappingByPhysicalName(String physicalName);

    public void loadName();

    public void tableNameInit();

    public void interfaceNameInit();

    public void systemValueToNameInit();

    public void specicalResourceInit();

    public void interactionResourceToName();
}
