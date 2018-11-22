package com.nestvision.nest.proxy.history.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.nestvision.nest.proxy.base.entity.BaseEntity;

@Table(name = BaseEntity.TABLE_PREFIX + "RETRY_TASK_REQUEST")
@Entity
public class RetryTaskRequest extends BaseEntity {

    /**
     * 
     */
    private static final long serialVersionUID = -2551548526490433172L;

    /**
     * 主键
     */
    @Id
    @GeneratedValue
    private Long id;

    /**
     * nest请求id
     */
    private String requestId;

    /**
     * nest请求所存储的表名
     */
    private String requestTableName;

    /**
     * 当前重发状态
     */
    @Enumerated(EnumType.STRING)
    private RetryStatus status;

    /**
     * 已经重发的次数
     */
    private int retryedTimes;

    /**
     * 最近一次重发时间
     */
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastRetryTime;

    /**
     * 所属的重发任务
     */
    @ManyToOne
    private RetryTask retryTask;
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public String getRequestTableName() {
        return requestTableName;
    }

    public void setRequestTableName(String requestTableName) {
        this.requestTableName = requestTableName;
    }

    public RetryStatus getStatus() {
        return status;
    }

    public void setStatus(RetryStatus status) {
        this.status = status;
    }

    public int getRetryedTimes() {
        return retryedTimes;
    }

    public void setRetryedTimes(int retryedTimes) {
        this.retryedTimes = retryedTimes;
    }

    public Date getLastRetryTime() {
        return lastRetryTime;
    }

    public void setLastRetryTime(Date lastRetryTime) {
        this.lastRetryTime = lastRetryTime;
    }

    public RetryTask getRetryTask() {
        return retryTask;
    }

    public void setRetryTask(RetryTask retryTask) {
        this.retryTask = retryTask;
    }
    
}
