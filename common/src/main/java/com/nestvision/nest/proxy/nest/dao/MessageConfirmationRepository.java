package com.nestvision.nest.proxy.nest.dao;

import com.nestvision.nest.proxy.base.dao.BaseRepository;
import com.nestvision.nest.proxy.nest.entity.MessageConfirmation;

public interface MessageConfirmationRepository extends BaseRepository<MessageConfirmation, String> {
	public MessageConfirmation findByNestmessageId(String nestMessageId);
	
	public void deleteByNestmessageId(String nestMessageId);
}
