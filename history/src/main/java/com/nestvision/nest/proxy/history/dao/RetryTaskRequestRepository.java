package com.nestvision.nest.proxy.history.dao;

import org.springframework.stereotype.Repository;

import com.nestvision.nest.proxy.base.dao.BaseRepository;
import com.nestvision.nest.proxy.history.entity.RetryTaskRequest;

@Repository
public interface RetryTaskRequestRepository extends BaseRepository<RetryTaskRequest, Long>{

}
