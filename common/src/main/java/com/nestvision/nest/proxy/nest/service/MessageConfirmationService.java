package com.nestvision.nest.proxy.nest.service;

import com.nestvision.nest.proxy.base.service.BaseService;
import com.nestvision.nest.proxy.nest.entity.MessageConfirmation;

public interface MessageConfirmationService extends BaseService<MessageConfirmation, String> {
	
	public MessageConfirmation deleteMessageConfirmation(String nestMessageId);
	
	public MessageConfirmation findByNestMessageId(String nestMessageId);
	
}
