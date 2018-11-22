package com.nestvision.nest.proxy.history.service;

import com.nestvision.nest.proxy.base.service.BaseService;
import com.nestvision.nest.proxy.history.entity.RetryTask;
import com.nestvision.nest.proxy.transform.model.NestRequest;


public interface RetryTaskService extends BaseService<RetryTask, Long>{

    public boolean matchAutoRetry(NestRequest nestRequest);

    

}
