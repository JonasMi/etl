package com.nestvision.nest.proxy.nest.service;

import com.nestvision.nest.proxy.base.service.BaseService;
import com.nestvision.nest.proxy.nest.entity.InterfaceMessageCount;

public interface InterfaceMessageCountService extends BaseService<InterfaceMessageCount, String> {
    public int countByUpHospitalAndLogicInterfaceName(String upHospitalName, String logicInterfaceName);

    public InterfaceMessageCount findByUpHospitalAndLogicInterfaceName(String upHospitalName, String logicInterfaceName);
}
