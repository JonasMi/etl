package com.nestvision.nest.proxy.history.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import com.nestvision.nest.proxy.base.entity.BaseEntity;

@Table(name = BaseEntity.TABLE_PREFIX + "RETRY_TASK")
@Entity
public class RetryTask extends BaseEntity {

    /**
     * 
     */
    private static final long serialVersionUID = 1722226427784861596L;

    /**
     * 主键
     */
    @Id
    @GeneratedValue
    private Long id;

    /**
     * 消息id
     */
    private String messageId;

    /**
     * 消息实体类名
     */
    private String messageClass;

    /**
     * 当前任务状态
     */
    @Enumerated(EnumType.STRING)
    private RetryStatus status;

    /**
     * 任务类型
     */
    @Enumerated(EnumType.STRING)
    private RetryType type;

    /**
     * 上次重发时间
     */
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastRetryTime;

    /**
     * 需要重发的请求
     */
    @OneToMany(mappedBy = "retryTask", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @Fetch(FetchMode.SUBSELECT)
    private List<RetryTaskRequest> retryTaskRequests;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMessageId() {
        return messageId;
    }

    public void setMessageId(String messageId) {
        this.messageId = messageId;
    }

    public String getMessageClass() {
        return messageClass;
    }

    public void setMessageClass(String messageClass) {
        this.messageClass = messageClass;
    }

    public RetryStatus getStatus() {
        return status;
    }

    public void setStatus(RetryStatus status) {
        this.status = status;
    }

    public RetryType getType() {
        return type;
    }

    public void setType(RetryType type) {
        this.type = type;
    }

    public Date getLastRetryTime() {
        return lastRetryTime;
    }

    public void setLastRetryTime(Date lastRetryTime) {
        this.lastRetryTime = lastRetryTime;
    }

    public List<RetryTaskRequest> getRetryTaskRequests() {
        return retryTaskRequests;
    }

    public void setRetryTaskRequests(List<RetryTaskRequest> retryTaskRequests) {
        this.retryTaskRequests = retryTaskRequests;
    }

}
