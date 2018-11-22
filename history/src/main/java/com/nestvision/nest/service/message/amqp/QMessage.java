package com.nestvision.nest.service.message.amqp;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Map;

import lombok.Data;
import lombok.ToString;

@Data
@ToString(exclude = "payload")
public class QMessage implements Serializable {

    private static final long serialVersionUID = 1L;// 必须为1，保持统一

    private String app;

    private String messageId;

    private String nestMessageId;

    private String projectId;

    private String projectDeploymentId;

    private String endpointId;

    private String locationId;

    private Date datetime;

    private String payloadType;

    private String direction;

    private String projectName;

    private String projectDeploymentName;

    private byte[] payload;

    private Map<String, Object> headers;

    private String tenantId;

    private List<Dimension> dimensions;

    private boolean originalRequest;

    @Data
    @ToString
    public static class Dimension implements Serializable {

        private static final long serialVersionUID = 1L;

        private String name;

        private String dimensionIdentifier;

        private String value;

        private String text;
    }
}
