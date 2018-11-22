package com.nestvision.nest.proxy.nest.service.impl;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Service;

import com.nestvision.nest.proxy.base.dao.BaseRepository;
import com.nestvision.nest.proxy.base.service.AbstractBaseService;
import com.nestvision.nest.proxy.nest.dao.InterfaceLogicPhysicsMappingRepository;
import com.nestvision.nest.proxy.nest.dao.TableLogicPhysicsMappingRepository;
import com.nestvision.nest.proxy.nest.entity.InterfaceLogicPhysicsMapping;
import com.nestvision.nest.proxy.nest.entity.TableLogicPhysicsMapping;
import com.nestvision.nest.proxy.nest.service.TableLogicPhysicsMappingService;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class DefaultTableLogicPhysicsMappingService extends AbstractBaseService<TableLogicPhysicsMapping, String>
                implements TableLogicPhysicsMappingService, ApplicationContextAware {
    @Autowired
    private TableLogicPhysicsMappingRepository tableLogicPhysicsMappingRepository;

    @Autowired
    private InterfaceLogicPhysicsMappingRepository interfaceLogicPhysicsMappingRepository;

    private Map<String, String> tableMappings = new HashMap<>();

    private ApplicationContext applicationContext;

    private Map<String, InterfaceLogicPhysicsMapping> interfaceMappings = new HashMap<>();

    private Map<String, TableLogicPhysicsMapping> tableLogicPhysicsMappings = new HashMap<>();

    private Map<String, String> systemValueToNameMap = new HashMap<>();

    private List<String> resources = new ArrayList<>();

    private Map<String, String> interactionMapping = new HashMap<>();

    @Override
    protected BaseRepository<TableLogicPhysicsMapping, String> getBaseRepository() {
        return tableLogicPhysicsMappingRepository;
    }

    @Override
    public String getTableLogicName(String physicalName) {
        return tableMappings.get(physicalName);
    }

    @Override
    public InterfaceLogicPhysicsMapping getInterfaceNameMapping(String resource) {
        return interfaceMappings.get(resource);
    }

    @Override
    public TableLogicPhysicsMapping getTableLogicPhysicsMappingByPhysicalName(String physicalName) {
        return tableLogicPhysicsMappings.get(physicalName);
    }

    @Override
    public void loadName() {
        // 表
        List<TableLogicPhysicsMapping> tableLogicPhysicsMappings = tableLogicPhysicsMappingRepository.findAll();
        tableLogicPhysicsMappings.forEach(tableLogicPhysicalMapping -> {
            this.tableMappings.put(tableLogicPhysicalMapping.getPhysicalName(), tableLogicPhysicalMapping.getLogicName());
            this.tableLogicPhysicsMappings.put(tableLogicPhysicalMapping.getPhysicalName(), tableLogicPhysicalMapping);
        });
        // 接口
        List<InterfaceLogicPhysicsMapping> interfaceLogicPhysicsMappings = interfaceLogicPhysicsMappingRepository.findAll();
        interfaceLogicPhysicsMappings.forEach(interfaceLogicPhysicsMapping -> {
            this.interfaceMappings.put(interfaceLogicPhysicsMapping.getResource(), interfaceLogicPhysicsMapping);
            this.interfaceMappings.put(interfaceLogicPhysicsMapping.getLogicName(), interfaceLogicPhysicsMapping);
        });
    }

    @Override
    public void tableNameInit() {
        Resource resource = applicationContext.getResource("classpath:tableLogicPhsicsMapping.xls");
        try {
            Workbook workBook = new XSSFWorkbook(resource.getInputStream());
            Sheet sheet = workBook.getSheetAt(0);
            int rowNumbers = sheet.getLastRowNum();
            for (int i = 1; i <= rowNumbers; i++) {
                Row row = sheet.getRow(i);
                TableLogicPhysicsMapping tableLogicPhysicsMapping = new TableLogicPhysicsMapping();
                String logicName = StringUtils.trim(row.getCell(0).getStringCellValue());
                String phsicsName = StringUtils.trim(row.getCell(1).getStringCellValue());
                String primaryKeyPhsicsName = StringUtils.trim(row.getCell(2).getStringCellValue());
                String primaryKeyLogicName = StringUtils.trim(row.getCell(3).getStringCellValue());
                tableLogicPhysicsMapping.setLogicName(logicName);
                tableLogicPhysicsMapping.setPhysicalName(phsicsName);
                tableLogicPhysicsMapping.setLogicPrimaryKeyName(primaryKeyLogicName);
                tableLogicPhysicsMapping.setPhysicalPrimaryKeyName(primaryKeyPhsicsName);
                tableLogicPhysicsMappingRepository.save(tableLogicPhysicsMapping);
            }
        } catch (IOException e) {
            log.error(e.getMessage(), e);
        }

    }

    @Override
    public void interfaceNameInit() {
        Resource resource = applicationContext.getResource("classpath:interfaceLogicPhsicsMapping.xls");
        try {
            Workbook workBook = new XSSFWorkbook(resource.getInputStream());
            Sheet sheet = workBook.getSheetAt(0);
            int rowNumbers = sheet.getLastRowNum();
            for (int i = 1; i <= rowNumbers; i++) {
                Row row = sheet.getRow(i);
                InterfaceLogicPhysicsMapping interfaceLogicPhysicsMapping = new InterfaceLogicPhysicsMapping();
                String logicName = StringUtils.trim(row.getCell(0).getStringCellValue());
                String phsicsName = StringUtils.trim(row.getCell(1).getStringCellValue());
                String resourceName = StringUtils.trim(row.getCell(2).getStringCellValue());
                interfaceLogicPhysicsMapping.setLogicName(logicName);
                interfaceLogicPhysicsMapping.setPhysicalName(phsicsName);
                interfaceLogicPhysicsMapping.setResource(resourceName);
                interfaceLogicPhysicsMappingRepository.save(interfaceLogicPhysicsMapping);
            }
        } catch (IOException e) {
            log.error(e.getMessage(), e);
        }

    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }

    @Override
    public void systemValueToNameInit() {
        Resource resource = applicationContext.getResource("classpath:SystemValueToDeployName.xls");
        try {
            Workbook workBook = new XSSFWorkbook(resource.getInputStream());
            Sheet sheet = workBook.getSheetAt(0);
            int rowNumbers = sheet.getLastRowNum();
            for (int i = 1; i <= rowNumbers; i++) {
                Row row = sheet.getRow(i);
                String systemValue = StringUtils.trim(row.getCell(0).getStringCellValue());
                String name = StringUtils.trim(row.getCell(1).getStringCellValue());
                systemValueToNameMap.put(systemValue, name);
            }
        } catch (IOException e) {
            log.error(e.getMessage(), e);

        }
    }

    @Override
    public String getNameBySystemValue(String systemValue) {
        return systemValueToNameMap.get(systemValue);
    }

    @Override
    public Boolean assertResourceExist(String resource) {
        return resources.contains(resource);
    }

    @Override
    public void specicalResourceInit() {
        Resource resource = applicationContext.getResource("classpath:resourceSpecical.xlsx");
        try {
            Workbook workBook = new XSSFWorkbook(resource.getInputStream());
            Sheet sheet = workBook.getSheetAt(0);
            int rowNumbers = sheet.getLastRowNum();
            for (int i = 0; i <= rowNumbers; i++) {
                Row row = sheet.getRow(i);
                String name = StringUtils.trim(row.getCell(0).getStringCellValue());
                resources.add(name);
            }
        } catch (IOException e) {
            log.error(e.getMessage(), e);
        }
    }

    @Override
    public void interactionResourceToName() {
        Resource resource = applicationContext.getResource("classpath:InteractionMapping.xls");
        try {
            Workbook workBook = new XSSFWorkbook(resource.getInputStream());
            Sheet sheet = workBook.getSheetAt(0);
            int rowNumbers = sheet.getLastRowNum();
            for (int i = 1; i <= rowNumbers; i++) {
                Row row = sheet.getRow(i);
                String resourceName = StringUtils.trim(row.getCell(0).getStringCellValue());
                String name = StringUtils.trim(row.getCell(1).getStringCellValue());
                interactionMapping.put(resourceName, name);
            }
        } catch (IOException e) {
            log.error(e.getMessage(), e);
        }

    }

    @Override
    public String getInteractionNameByResource(String resource) {
        return interactionMapping.get(resource);
    }

}
