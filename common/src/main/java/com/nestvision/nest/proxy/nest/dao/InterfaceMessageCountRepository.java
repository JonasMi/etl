package com.nestvision.nest.proxy.nest.dao;

import com.nestvision.nest.proxy.base.dao.BaseRepository;
import com.nestvision.nest.proxy.nest.entity.InterfaceMessageCount;

public interface InterfaceMessageCountRepository extends BaseRepository<InterfaceMessageCount, String> {
    public int countByUpHospitalAndLogicInterfaceName(String upHospitalName, String logicInterfaceName);

    public InterfaceMessageCount findByUpHospitalAndLogicInterfaceName(String upHospitalName, String logicInterfaceName);

}
