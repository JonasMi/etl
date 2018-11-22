package com.nestvision.nest.proxy.nest.dao;

import com.nestvision.nest.proxy.base.dao.BaseRepository;
import com.nestvision.nest.proxy.nest.entity.ToUploadMessage;

public interface ToUploadMessageRepository extends BaseRepository<ToUploadMessage, String> {
	public ToUploadMessage findByIdentifier(String identifier);

	public void deleteByUpHospitalAndLogicInterfaceNameAndIdentifier(String upHospital, String logicInterfaceName,
			String identifier);
}
