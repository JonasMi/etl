package com.nestvision.nest.proxy.nest.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nestvision.nest.proxy.base.dao.BaseRepository;
import com.nestvision.nest.proxy.base.service.AbstractBaseService;
import com.nestvision.nest.proxy.nest.dao.ToUploadMessageRepository;
import com.nestvision.nest.proxy.nest.entity.ToUploadMessage;
import com.nestvision.nest.proxy.nest.service.ToUploadMessageService;

/*@Service*/
public class DefaultToUploadMessageService extends AbstractBaseService<ToUploadMessage, String>
		implements ToUploadMessageService {
	
	@Autowired
	private ToUploadMessageRepository toUploadMessageRepository;

	@Override
	protected BaseRepository<ToUploadMessage, String> getBaseRepository() {
		return toUploadMessageRepository;
	}

	@Override
	public void saveOrUpdate(ToUploadMessage toUploadMessage) {
		ToUploadMessage message = toUploadMessageRepository.findByIdentifier(toUploadMessage.getIdentifier());
		if(message != null){
			toUploadMessage.setType(message.getType());
			toUploadMessage.setCount(message.getCount() + 1);
			toUploadMessage.setId(message.getId());
		}
		toUploadMessageRepository.saveAndFlush(toUploadMessage);
	}

	@Override
	public void deleteMessageByUpHospitalAndLogicInterfaceNameAndIdentifier(String upHospital,
			String logicInterfaceName, String identifier) {
		toUploadMessageRepository.deleteByUpHospitalAndLogicInterfaceNameAndIdentifier(upHospital,logicInterfaceName,identifier);
		
	}
}
