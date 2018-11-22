package com.nestvision.nest.service.error.amqp;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import lombok.Data;

@Data
public class QMessage implements Serializable {

    private static final long serialVersionUID = 1L;

    private String app;

    private String messageId;

    private String nestMessageId;

    private String tenantId;

    private String projectDeploymentId;

    private String projectDeploymentName;

    private String endpointId;

    private String payloadType;

    private Date datetime;

    private String projectId;

    private String projectName;

    private Map<String, Object> headers;

    private byte[] payload;

    private String exception;

    private List<Dimension> dimensions;

    @Data
    public static class Dimension implements Serializable {

        private static final long serialVersionUID = 1L;

        private String name;

        private String dimensionIdentifier;

        private String value;

        private String text;

        public Map<String, Object> toEsMap() {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("name", name);
            map.put("dimensionIdentifier", dimensionIdentifier);
            map.put("value", value);
            map.put("text", text);
            return map;
        }
    }

    public Map<String, Object> toEsMap() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS");
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("app", app);
        map.put("messageId", messageId);
        map.put("nestMessageId", nestMessageId);
        map.put("projectId", projectId);
        map.put("projectDeploymentId", projectDeploymentId);
        map.put("endpointId", endpointId);
        map.put("payloadType", payloadType);
        map.put("projectName", projectName);
        map.put("datetime", sdf.format(datetime));
        map.put("projectDeploymentName", projectDeploymentName);
        map.put("tenantId", tenantId);

        List<Map<String, Object>> dis = new ArrayList<>();
        for (Dimension dimension : dimensions) {
            dis.add(dimension.toEsMap());
        }

        map.put("dimensions", dis);
        map.put("size", payload.length);
        return map;
    }
}
