package com.nestvision.nest.proxy.nest.entity;

import java.io.Serializable;
import java.util.Map;

import lombok.Data;

@Data
public class S3Entity implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -3949196265030507136L;
	private String messageContent;
	private Map<String, Object> headers;
	private byte[] payload;
}
