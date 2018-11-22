package com.nestvision.nest.proxy.history.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nestvision.nest.proxy.base.dao.BaseRepository;
import com.nestvision.nest.proxy.base.service.AbstractBaseService;
import com.nestvision.nest.proxy.history.dao.RetryTaskRequestRepository;
import com.nestvision.nest.proxy.history.entity.RetryTaskRequest;
import com.nestvision.nest.proxy.history.service.RetryTaskRequestService;

@Service
public class DefaultRetryTaskRequestService extends AbstractBaseService<RetryTaskRequest, Long> implements RetryTaskRequestService{
    
    @Autowired
    private RetryTaskRequestRepository retryTaskRequestRepository;
    
    @Override
    protected BaseRepository<RetryTaskRequest, Long> getBaseRepository() {
      
        return retryTaskRequestRepository;
    }

}
