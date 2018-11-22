package com.nestvision.nest.proxy.history.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.nestvision.nest.proxy.base.dao.BaseRepository;
import com.nestvision.nest.proxy.history.entity.RetryStatus;
import com.nestvision.nest.proxy.history.entity.RetryTask;

@Repository
public interface RetryTaskRepository extends BaseRepository<RetryTask, Long> {

    @Query("From RetryTask where status=?1 order by lastRetryTime ASC")
    public List<RetryTask> findAllByStatus(RetryStatus status);

}
