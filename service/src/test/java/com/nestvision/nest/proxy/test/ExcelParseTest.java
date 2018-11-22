package com.nestvision.nest.proxy.test;

import java.io.File;
import java.io.FileInputStream;

import org.apache.commons.lang3.StringUtils;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.nestvision.nest.proxy.nest.dao.InterfaceLogicPhysicsMappingRepository;
import com.nestvision.nest.proxy.nest.entity.InterfaceLogicPhysicsMapping;
import com.nestvision.nest.proxy.nest.entity.TableLogicPhysicsMapping;
import com.nestvision.nest.proxy.nest.service.TableLogicPhysicsMappingService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
public class ExcelParseTest {
    @Autowired
    private TableLogicPhysicsMappingService tableLogicPhysicsMappingService;

    @Autowired
    private InterfaceLogicPhysicsMappingRepository interfaceLogicPhysicsMappingRepository;

    @Test
    public void test() throws Exception {
        File workDir = new File(System.getProperty("user.dir"));
        String basePath = workDir.getParentFile().getAbsolutePath();
        File file = new File(basePath + "\\nest-proxy-service\\src\\main\\resources\\tableLogicPhsicsMapping.xlsx");
        FileInputStream input = new FileInputStream(file);
        Workbook workBook = new XSSFWorkbook(input);
        Sheet sheet = workBook.getSheetAt(0);
        int rowNumbers = sheet.getLastRowNum();
        for (int i = 1; i <= rowNumbers; i++) {
            Row row = sheet.getRow(i);
            TableLogicPhysicsMapping tableLogicPhysicsMapping = new TableLogicPhysicsMapping();
            String logicName = StringUtils.trim(row.getCell(0).getStringCellValue());
            String phsicsName = StringUtils.trim(row.getCell(1).getStringCellValue());
            tableLogicPhysicsMapping.setLogicName(logicName);
            tableLogicPhysicsMapping.setPhysicalName(phsicsName);
            tableLogicPhysicsMappingService.save(tableLogicPhysicsMapping);
        }
    }

    @Test
    public void test1() throws Exception {
        File workDir = new File(System.getProperty("user.dir"));
        String basePath = workDir.getParentFile().getAbsolutePath();
        File file = new File(basePath + "\\nest-proxy-service\\src\\main\\resources\\interfaceLogicPhsicsMapping.xlsx");
        FileInputStream input = new FileInputStream(file);
        Workbook workBook = new XSSFWorkbook(input);
        Sheet sheet = workBook.getSheetAt(0);
        int rowNumbers = sheet.getLastRowNum();
        for (int i = 1; i < rowNumbers; i++) {
            Row row = sheet.getRow(i);
            InterfaceLogicPhysicsMapping interfaceLogicPhysicsMapping = new InterfaceLogicPhysicsMapping();
            String logicName = StringUtils.trim(row.getCell(0).getStringCellValue());
            String phsicsName = StringUtils.trim(row.getCell(1).getStringCellValue());
            String resource = StringUtils.trim(row.getCell(2).getStringCellValue());
            interfaceLogicPhysicsMapping.setLogicName(logicName);
            interfaceLogicPhysicsMapping.setPhysicalName(phsicsName);
            interfaceLogicPhysicsMapping.setResource(resource);
            interfaceLogicPhysicsMappingRepository.save(interfaceLogicPhysicsMapping);
        }
    }

    @Test
    public void test2() {
        String name = tableLogicPhysicsMappingService.getTableLogicName("T_MEDICATIO");
        String name1 = tableLogicPhysicsMappingService.getInterfaceNameMapping("MedicalRecordOutline").getLogicName();
    }

}
