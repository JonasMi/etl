package com.nestvision.nest.proxy.nest.service;

import com.nestvision.nest.proxy.base.service.BaseService;
import com.nestvision.nest.proxy.nest.entity.ToUploadMessage;

public interface ToUploadMessageService extends BaseService<ToUploadMessage, String> {
	public void saveOrUpdate(ToUploadMessage toUploadMessage);

	public void deleteMessageByUpHospitalAndLogicInterfaceNameAndIdentifier(String upHospital,
			String logicInterfaceName, String identifier);
}
