package com.nestvision.nest.proxy.nest.api;

import java.io.IOException;
import java.math.BigDecimal;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.nestvision.nest.proxy.base.util.ExcelUtil;
import com.nestvision.nest.proxy.nest.api.request.DataQualityRequest;
import com.nestvision.nest.proxy.nest.api.response.ColumnDetailSummary;
import com.nestvision.nest.proxy.nest.api.response.ColumnDetailSummaryResponse;
import com.nestvision.nest.proxy.nest.api.response.ColumnSummary;
import com.nestvision.nest.proxy.nest.api.response.TableSummary;
import com.nestvision.nest.proxy.nest.entity.TableLogicPhysicsMapping;
import com.nestvision.nest.proxy.nest.service.DataQualityReportService;
import com.nestvision.nest.proxy.nest.service.TableLogicPhysicsMappingService;
import com.nestvision.nest.proxy.nest.service.impl.DefaultDataQualityReportService.QueryType;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/api/dataQualityReport")
@Slf4j
public class TableQualityReportController {
	@Autowired
    DataQualityReportService dataQualityReportService;

    @Autowired
    private TableLogicPhysicsMappingService tableLogicPhysicsMappingService;
    
    List<String> flagList = new ArrayList<>();

    Map<String, Double> flagMap = new HashMap<>();
    
    @RequestMapping(method = RequestMethod.GET, value = "/")
    public Page<TableSummary> listDateQualityReport(DataQualityRequest dataQualityRequest, Pageable pageable) {
        return dataQualityReportService.dynamicQuery(dataQualityRequest, pageable, QueryType.page);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/column/{physicalTableName}/")
    public Page<ColumnSummary> listColumnReport(@PathVariable("physicalTableName") String dataQualityReportId, Pageable pageable) {
        return dataQualityReportService.findByPhysicalTableName(dataQualityReportId, pageable, QueryType.page);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/column/messages/{columnName}/")
    public ColumnDetailSummaryResponse listColumnDetailReport(@PathVariable("columnName") String columnName, Pageable pageable, String physicalTableName) {
        ColumnDetailSummaryResponse columnDetailSummaryResponse = new ColumnDetailSummaryResponse();
        TableLogicPhysicsMapping tableLogicPhysicsMapping = new TableLogicPhysicsMapping();
        columnDetailSummaryResponse.setLogicColumnName(dataQualityReportService.findLogicNameByColumnName(columnName));
        columnDetailSummaryResponse.setPhysicalColumnName(columnName);
        columnDetailSummaryResponse.setColumnDetailPage(dataQualityReportService.findByColumnName(columnName, pageable, QueryType.page, physicalTableName));
        tableLogicPhysicsMapping = tableLogicPhysicsMappingService.getTableLogicPhysicsMappingByPhysicalName(physicalTableName);
        columnDetailSummaryResponse.setLogicPrimaryKeyName(tableLogicPhysicsMapping.getLogicPrimaryKeyName());
        columnDetailSummaryResponse.setPhysicalPrimaryKeyName(tableLogicPhysicsMapping.getPhysicalPrimaryKeyName());
        return columnDetailSummaryResponse;
    }
    
    @InitBinder
    public void initBinder(WebDataBinder binder) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        dateFormat.setLenient(false);
        binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));
    }
    
    @RequestMapping(method = RequestMethod.GET, value = "/export/{flagNo}/")
    public double exportFlag(@PathVariable("flagNo") String flagNo) {
        if (flagList.contains(flagNo)) {
            flagList.remove(flagNo);
            flagMap.remove(flagNo);
            return 100.00;
        } else {
            if (flagMap.get(flagNo) != null) {
                BigDecimal bg = new BigDecimal(flagMap.get(flagNo));
                return bg.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
            } else {
                return 0;
            }
        }

    }
    
    
    @RequestMapping(value = "/excelDownLoad/",method=RequestMethod.GET)
    public void excelDownLoad(HttpServletResponse response, Pageable pageable, DataQualityRequest dataQualityRequest, String flagNo) {
    	log.info("开始构建数据.........");
        List<TableSummary> tableSummaries = new ArrayList<>();
        tableSummaries = dataQualityReportService.dynamicQuery(dataQualityRequest, pageable, QueryType.excel).getContent();
        log.info("查询初始化完成........");
        double i = 0;
        for (TableSummary tableSummary : tableSummaries) {
            List<ColumnSummary> columnSummaries = dataQualityReportService.findByPhysicalTableName(tableSummary.getPhysicalTableName(), pageable,
                                                                                                   QueryType.excel)
                                                                          .getContent();
            tableSummary.setColumnSummaries(columnSummaries);
            columnSummaries.forEach(columnSummary -> {
                List<ColumnDetailSummary> columnDetailSummaries = dataQualityReportService.findByColumnName(columnSummary.getPhysicalColumnName(), pageable,
                                                                                                            QueryType.excel, tableSummary.getLogicTableName())
                                                                                          .getContent();
                columnSummary.setColumnDetailSummaries(columnDetailSummaries);
            });
            i++;
            flagMap.put(flagNo, i / tableSummaries.size() * 100);
            if (i == tableSummaries.size()) {
                flagMap.put(flagNo, 99.99);
            }
        }
        ExcelUtil excelUtil = new ExcelUtil();
        try {
            String fileName = URLEncoder.encode("数据质量报表.xls", "UTF-8");
            response.setHeader("content-disposition", "attachment;filename=" + fileName);
            synchronized (this) {
                log.info("数据库查询完成~开始组装excel对象");
                excelUtil.createExcel(tableSummaries, response.getOutputStream(), dataQualityRequest);
                flagList.add(flagNo);
            }
        } catch (IOException e) {
            log.error("生成excel出错");
            throw new RuntimeException(e);
        }
    }
}
