package com.nestvision.nest.proxy.nest.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nestvision.nest.proxy.base.dao.BaseRepository;
import com.nestvision.nest.proxy.base.service.AbstractBaseService;
import com.nestvision.nest.proxy.nest.dao.InterfaceLogicPhysicsMappingRepository;
import com.nestvision.nest.proxy.nest.entity.InterfaceLogicPhysicsMapping;
import com.nestvision.nest.proxy.nest.service.InterfaceLogicPhysicsMappingService;

@Service
public class DefaultInterfaceLogicPhysicsMappingService extends AbstractBaseService<InterfaceLogicPhysicsMapping, String>
                implements InterfaceLogicPhysicsMappingService {
    @Autowired
    private InterfaceLogicPhysicsMappingRepository interfaceLogicPhysicsMappingRepository;

    @Override
    protected BaseRepository<InterfaceLogicPhysicsMapping, String> getBaseRepository() {
        return interfaceLogicPhysicsMappingRepository;
    }

}
