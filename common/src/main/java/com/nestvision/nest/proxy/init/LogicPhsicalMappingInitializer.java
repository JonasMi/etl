package com.nestvision.nest.proxy.init;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nestvision.nest.proxy.nest.service.FieldModelService;
import com.nestvision.nest.proxy.nest.service.TableLogicPhysicsMappingService;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public final class LogicPhsicalMappingInitializer {
	@Autowired
	private TableLogicPhysicsMappingService tableLogicPhysicsMappingService;
	
	@Autowired
	private FieldModelService fieldModelService;

	@PostConstruct
	public void onApplicationEvent() {
		log.info("开始加载映射表...");
		tableLogicPhysicsMappingService.systemValueToNameInit();
		tableLogicPhysicsMappingService.specicalResourceInit();
		tableLogicPhysicsMappingService.interactionResourceToName();
		if (tableLogicPhysicsMappingService.findAll().isEmpty()) {
			tableLogicPhysicsMappingService.tableNameInit();
		}
		tableLogicPhysicsMappingService.loadName();
		log.info("映射表初始化完成...");
		log.info("开始初始化结构化json数据...");
		fieldModelService.loadFieldModelMaps();
		

	}
}
