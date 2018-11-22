package com.nestvision.nest.proxy.nest.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import com.nestvision.nest.proxy.base.dao.BaseRepository;
import com.nestvision.nest.proxy.base.service.AbstractBaseService;
import com.nestvision.nest.proxy.nest.dao.MessageConfirmationRepository;
import com.nestvision.nest.proxy.nest.entity.MessageConfirmation;
import com.nestvision.nest.proxy.nest.service.MessageConfirmationService;

/*@Service*/
public class DefaultMessageConfirmationService extends AbstractBaseService<MessageConfirmation, String>
		implements MessageConfirmationService {
	@Autowired
	private MessageConfirmationRepository messageConfirmationRepository;

	@Override
	protected BaseRepository<MessageConfirmation, String> getBaseRepository() {
		return messageConfirmationRepository;
	}

	@Override
	public MessageConfirmation deleteMessageConfirmation(String nestMessageId) {
		MessageConfirmation messageConfirmation = messageConfirmationRepository.findByNestmessageId(nestMessageId);
		if(messageConfirmation != null){
			messageConfirmationRepository.delete(messageConfirmation);
		}
		return messageConfirmation;
	}

	@Override
	public MessageConfirmation findByNestMessageId(String nestMessageId) {
		return  messageConfirmationRepository.findByNestmessageId(nestMessageId);
	}


}
