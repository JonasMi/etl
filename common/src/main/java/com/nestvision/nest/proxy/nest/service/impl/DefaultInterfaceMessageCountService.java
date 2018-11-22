package com.nestvision.nest.proxy.nest.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nestvision.nest.proxy.base.dao.BaseRepository;
import com.nestvision.nest.proxy.base.service.AbstractBaseService;
import com.nestvision.nest.proxy.nest.dao.InterfaceMessageCountRepository;
import com.nestvision.nest.proxy.nest.entity.InterfaceMessageCount;
import com.nestvision.nest.proxy.nest.service.InterfaceMessageCountService;

@Service
public class DefaultInterfaceMessageCountService extends AbstractBaseService<InterfaceMessageCount, String> implements InterfaceMessageCountService {
    @Autowired
    private InterfaceMessageCountRepository interfaceMessageCountRepository;

    @Override
    protected BaseRepository<InterfaceMessageCount, String> getBaseRepository() {

        return interfaceMessageCountRepository;
    }

    @Override
    public int countByUpHospitalAndLogicInterfaceName(String upHospitalName, String logicInterfaceName) {
        return interfaceMessageCountRepository.countByUpHospitalAndLogicInterfaceName(upHospitalName, logicInterfaceName);
    }

    @Override
    public InterfaceMessageCount findByUpHospitalAndLogicInterfaceName(String upHospitalName, String logicInterfaceName) {
        return interfaceMessageCountRepository.findByUpHospitalAndLogicInterfaceName(upHospitalName, logicInterfaceName);
    }

}
