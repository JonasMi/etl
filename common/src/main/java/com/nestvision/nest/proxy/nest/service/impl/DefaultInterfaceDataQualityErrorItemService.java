package com.nestvision.nest.proxy.nest.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.nestvision.nest.proxy.base.dao.BaseRepository;
import com.nestvision.nest.proxy.base.service.AbstractBaseService;
import com.nestvision.nest.proxy.nest.dao.InterfaceDataQualityErrorItemRepository;
import com.nestvision.nest.proxy.nest.entity.InterfaceDataQualityErrorItem;
import com.nestvision.nest.proxy.nest.service.InterfaceDataQualityErrorItemService;

/*@Service*/
@Transactional
public class DefaultInterfaceDataQualityErrorItemService extends AbstractBaseService<InterfaceDataQualityErrorItem, String>
                implements InterfaceDataQualityErrorItemService {
    @Autowired
    private InterfaceDataQualityErrorItemRepository interfaceDataQualityErrorItemRepository;

    @Override
    protected BaseRepository<InterfaceDataQualityErrorItem, String> getBaseRepository() {
        return interfaceDataQualityErrorItemRepository;
    }

}
