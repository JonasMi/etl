package com.nestvision.nest.proxy.base.util;

import java.io.IOException;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFFont;
import org.apache.poi.hssf.usermodel.HSSFHyperlink;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.Hyperlink;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.util.CellRangeAddress;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;

import com.nestvision.nest.proxy.nest.api.request.DataQualityRequest;
import com.nestvision.nest.proxy.nest.api.response.ColumnSummary;
import com.nestvision.nest.proxy.nest.api.response.CoordinatorReferenceInterface;
import com.nestvision.nest.proxy.nest.api.response.CoordinatorReferenceMessage;
import com.nestvision.nest.proxy.nest.api.response.FireInterfaceDataItem;
import com.nestvision.nest.proxy.nest.api.response.FireInterfaceErrorType;
import com.nestvision.nest.proxy.nest.api.response.FireInterfaceSummary;
import com.nestvision.nest.proxy.nest.api.response.TableSummary;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ExcelUtil {
	private Date getMinate(List<FireInterfaceSummary> fireInterfaceSummaries){
		Date minDate = new Date();
		for(int i = 0; i < fireInterfaceSummaries.size();i++){
			if(minDate.getTime() > fireInterfaceSummaries.get(i).getUpTime().getTime()){
				minDate = fireInterfaceSummaries.get(i).getUpTime();
			}
		}
		System.out.println(minDate);
		return minDate;
	}
	
	public void createReferenceExcel(List<CoordinatorReferenceInterface> coordinatorReferenceInterfaces,String hospitalName,OutputStream out){
		HSSFWorkbook workBook = new HSSFWorkbook();
		HSSFSheet dataQualityStatisticsSheet = workBook.createSheet();
        HSSFFont tableFoot = workBook.createFont();
        HSSFFont titleFoot = workBook.createFont();
        HSSFFont headerFoot = workBook.createFont();
        HSSFFont contentFoot = workBook.createFont();
        HSSFFont describeFoot = workBook.createFont();
        HSSFFont linkFoot = workBook.createFont();
        CellStyle tableCellStyle = workBook.createCellStyle();
        CellStyle titleCellStyle = workBook.createCellStyle();
        CellStyle headerCellStyle = workBook.createCellStyle();
        CellStyle contentCellStyle = workBook.createCellStyle();
        CellStyle describeCellStyle = workBook.createCellStyle();
        CellStyle linkCellStyle = workBook.createCellStyle();
        dataQualityStatisticsSheet.setDefaultColumnWidth(20);
        dataQualityStatisticsSheet.setDefaultRowHeightInPoints(80);
        dataQualityStatisticsSheet.setDefaultRowHeight((short) 80);
        dataQualityStatisticsSheet.setPrintGridlines(false);
        dataQualityStatisticsSheet.setDisplayGridlines(false);
        dataQualityStatisticsSheet.setDisplayGuts(false);
        workBook.setSheetName(0, "医院接口待处理实时数据");
        dataQualityStatisticsSheet.addMergedRegion(new CellRangeAddress(0, 0, 0, 7));
        dataQualityStatisticsSheet.setSelected(true);
        HSSFRow firstRow = dataQualityStatisticsSheet.createRow(0);
        firstRow.setHeightInPoints(30);
        HSSFCell headerCell = firstRow.createCell(0);
        headerCell.setCellValue(hospitalName+"待处理数据");
        headerCell.setCellStyle(tableReportStyle(workBook, StyleType.title, titleFoot, titleCellStyle));
        int rownum = 1;
        //标题头
        HSSFRow statisticsHeaderRow = dataQualityStatisticsSheet.createRow(++rownum);
        HSSFCell statisticsHeaderCell0 = statisticsHeaderRow.createCell(0);
        statisticsHeaderCell0.setCellValue("接口中文名称");
        statisticsHeaderCell0.setCellStyle(tableReportStyle(workBook, StyleType.describe, describeFoot, describeCellStyle));
        HSSFCell statisticsHeaderCell1 = statisticsHeaderRow.createCell(1);
        statisticsHeaderCell1.setCellValue("接口英文名称");
        statisticsHeaderCell1.setCellStyle(tableReportStyle(workBook, StyleType.describe, describeFoot, describeCellStyle));
        HSSFCell statisticsHeaderCell2 = statisticsHeaderRow.createCell(2);
        statisticsHeaderCell2.setCellValue("待上传条数");
        statisticsHeaderCell2.setCellStyle(tableReportStyle(workBook, StyleType.describe, describeFoot, describeCellStyle));
        HSSFCell statisticsHeaderCell3 = statisticsHeaderRow.createCell(3);
        statisticsHeaderCell3.setCellValue("查看详情");
        statisticsHeaderCell3.setCellStyle(tableReportStyle(workBook, StyleType.describe, describeFoot, describeCellStyle));
        //接口待处理实时数据
        for (int i = 0; i < coordinatorReferenceInterfaces.size(); i++) {
        	// 创建子页面
        	if(coordinatorReferenceInterfaces.get(i).getCount() == 0){
        		continue;
        	}
            HSSFSheet childSheet = workBook.createSheet();
            workBook.setSheetName(i + 1, coordinatorReferenceInterfaces.get(i).getLogicInterfaceName());
            childSheet.setDefaultColumnWidth(20);
            childSheet.setDefaultRowHeightInPoints(80);
            childSheet.setDefaultRowHeight((short) 80);
            HSSFRow waitDealRow = dataQualityStatisticsSheet.createRow(++rownum);
            waitDealRow.setHeightInPoints(16);
            HSSFCell waitDealCell0 = waitDealRow.createCell(0);
            waitDealCell0.setCellStyle(tableReportStyle(workBook, StyleType.table, tableFoot, tableCellStyle));
            waitDealCell0.setCellValue(coordinatorReferenceInterfaces.get(i).getLogicInterfaceName());
            
            HSSFCell waitDealCell1 = waitDealRow.createCell(1);
            waitDealCell1.setCellStyle(tableReportStyle(workBook, StyleType.table, tableFoot, tableCellStyle));
            waitDealCell1.setCellValue(coordinatorReferenceInterfaces.get(i).getPhsicalInterfaceName());
            
            HSSFCell waitDealCell2 = waitDealRow.createCell(2);
            waitDealCell2.setCellStyle(tableReportStyle(workBook, StyleType.table, tableFoot, tableCellStyle));
            waitDealCell2.setCellValue(coordinatorReferenceInterfaces.get(i).getCount());
            
            HSSFCell linkCell = waitDealRow.createCell(3);
            Hyperlink hyperlink = new HSSFHyperlink(Hyperlink.LINK_DOCUMENT);
            hyperlink.setAddress("'" + coordinatorReferenceInterfaces.get(i).getLogicInterfaceName() + "'!" + "A" + "1");
            linkCell.setHyperlink(hyperlink);
            linkCell.setCellValue("点击查看");
            linkCell.setCellStyle(tableReportStyle(workBook, StyleType.link, linkFoot, linkCellStyle));
            HSSFRow childFirstRow = childSheet.createRow(0);
            HSSFCell chiledHeaderCell0 = childFirstRow.createCell(0);
            chiledHeaderCell0.setCellStyle(tableReportStyle(workBook, StyleType.describe, describeFoot, contentCellStyle));
            chiledHeaderCell0.setCellValue("主键ID");
            
            HSSFCell chiledHeaderCell1 = childFirstRow.createCell(1);
            chiledHeaderCell1.setCellStyle(tableReportStyle(workBook, StyleType.describe, describeFoot, contentCellStyle));
            chiledHeaderCell1.setCellValue("待处理紧迫度指数");
            
            
            HSSFCell chiledHeaderCell2 = childFirstRow.createCell(2);
            chiledHeaderCell2.setCellStyle(tableReportStyle(workBook, StyleType.describe, describeFoot, contentCellStyle));
            chiledHeaderCell2.setCellValue("错误类型");
            int childRowNum = 1;
            for(int j = 0; j < coordinatorReferenceInterfaces.get(i).getCoordinatorReferenceMessages().size();j++){
            	CoordinatorReferenceMessage coordinatorReferenceMessage = coordinatorReferenceInterfaces.get(i).getCoordinatorReferenceMessages().get(j);
            	HSSFRow identifierRow = childSheet.createRow(childRowNum);
            	HSSFCell identifierCell0 = identifierRow.createCell(0);
            	identifierCell0.setCellStyle(tableReportStyle(workBook, StyleType.table, tableFoot, tableCellStyle));
            	identifierCell0.setCellValue(coordinatorReferenceMessage.getIdentifier());
            	
            	HSSFCell identifierCell1 = identifierRow.createCell(1);
            	identifierCell1.setCellStyle(tableReportStyle(workBook, StyleType.table, tableFoot, tableCellStyle));
            	identifierCell1.setCellValue(coordinatorReferenceMessage.getCount());
            	
            	HSSFCell identifierCell2 = identifierRow.createCell(2);
            	identifierCell2.setCellStyle(tableReportStyle(workBook, StyleType.table, tableFoot, tableCellStyle));
            	identifierCell2.setCellValue(coordinatorReferenceMessage.getType());
            	childRowNum++;
            }
        }
        try {
            /*
             * File file = new File("D:\\etc", "test1.xlsx");
             * FileOutputStream o = new FileOutputStream(file);
             */
            workBook.write(out);
        } catch (IOException e) {
            log.error("生成excel出错!");
            throw new RuntimeException(e);
        }
		
		
	}

    public void createFireExcel(List<FireInterfaceSummary> fireInterfaceSummaries, OutputStream out, DataQualityRequest dataQualityRequest,
                                String hospitalName) {
        HSSFWorkbook workBook = new HSSFWorkbook();
        HSSFSheet dataQualityStatisticsSheet = workBook.createSheet();
        HSSFFont tableFoot = workBook.createFont();
        HSSFFont titleFoot = workBook.createFont();
        HSSFFont headerFoot = workBook.createFont();
        HSSFFont contentFoot = workBook.createFont();
        HSSFFont describeFoot = workBook.createFont();
        HSSFFont linkFoot = workBook.createFont();
        CellStyle tableCellStyle = workBook.createCellStyle();
        CellStyle titleCellStyle = workBook.createCellStyle();
        CellStyle headerCellStyle = workBook.createCellStyle();
        CellStyle contentCellStyle = workBook.createCellStyle();
        CellStyle describeCellStyle = workBook.createCellStyle();
        CellStyle linkCellStyle = workBook.createCellStyle();
        dataQualityStatisticsSheet.setDefaultColumnWidth(20);
        dataQualityStatisticsSheet.setDefaultRowHeightInPoints(80);
        dataQualityStatisticsSheet.setDefaultRowHeight((short) 80);
        dataQualityStatisticsSheet.setPrintGridlines(false);
        dataQualityStatisticsSheet.setDisplayGridlines(false);
        dataQualityStatisticsSheet.setDisplayGuts(false);
        workBook.setSheetName(0, "FHIR数据质量报告");
        dataQualityStatisticsSheet.addMergedRegion(new CellRangeAddress(0, 0, 0, 7));
        dataQualityStatisticsSheet.setSelected(true);
        HSSFRow firstRow = dataQualityStatisticsSheet.createRow(0);
        firstRow.setHeightInPoints(30);
        HSSFCell headerCell = firstRow.createCell(0);
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        headerCell.setCellValue(hospitalName + "FHIR数据质量报告实时统计");
       /* if (dataQualityRequest.getStart() != null) {
            headerCell.setCellValue(hospitalName + "FHIR数据质量报告统计" + formatter.format(dataQualityRequest.getStart()) + " 至 "
                                    + formatter.format(dataQualityRequest.getEnd()));
        } else {
        	Date minDate = getMinate(fireInterfaceSummaries);
            headerCell.setCellValue(hospitalName + "FHIR数据质量报告统计"+formatter.format(minDate)+" 至 " + formatter.format(dataQualityRequest.getEnd()));
        }*/
        headerCell.setCellStyle(tableReportStyle(workBook, StyleType.title, titleFoot, titleCellStyle));

        int rownum = 1;
        for (int i = 0; i < fireInterfaceSummaries.size(); i++) {
            // 创建子页面
            HSSFSheet childSheet = workBook.createSheet();
            workBook.setSheetName(i + 1, fireInterfaceSummaries.get(i).getLogicInterfaceName());
            childSheet.setDefaultColumnWidth(20);
            childSheet.setDefaultRowHeightInPoints(80);
            childSheet.setDefaultRowHeight((short) 80);
            HSSFRow childFirstRow = childSheet.createRow(0);
            // 构造接口信息
            HSSFRow physicalRow = dataQualityStatisticsSheet.createRow(++rownum);
            physicalRow.setHeightInPoints(16);
            HSSFCell physicalCell0 = physicalRow.createCell(0);
            physicalCell0.setCellStyle(tableReportStyle(workBook, StyleType.table, tableFoot, tableCellStyle));
            physicalCell0.setCellValue("接口服务名");
            HSSFCell physicalCell1 = physicalRow.createCell(1);
            physicalCell1.setCellStyle(tableReportStyle(workBook, StyleType.table, tableFoot, tableCellStyle));
            physicalCell1.setCellValue(fireInterfaceSummaries.get(i).getLogicInterfaceName());
            HSSFCell physicalCell2 = physicalRow.createCell(2);
            physicalCell2.setCellValue("错误率");
            physicalCell2.setCellStyle(tableReportStyle(workBook, StyleType.table, tableFoot, tableCellStyle));
            HSSFCell physicalCell3 = physicalRow.createCell(3);
            physicalCell3.setCellValue(fireInterfaceSummaries.get(i).getErrorRate() + "%");
            physicalCell3.setCellStyle(tableReportStyle(workBook, StyleType.table, tableFoot, tableCellStyle));

            HSSFRow logicRow = dataQualityStatisticsSheet.createRow(++rownum);
            HSSFCell logicCell0 = logicRow.createCell(0);
            logicCell0.setCellValue("接口资源名");
            logicCell0.setCellStyle(tableReportStyle(workBook, StyleType.table, tableFoot, tableCellStyle));
            HSSFCell logicCell1 = logicRow.createCell(1);
            logicCell1.setCellValue(fireInterfaceSummaries.get(i).getPhysicalInterfaceName());
            logicCell1.setCellStyle(tableReportStyle(workBook, StyleType.table, tableFoot, tableCellStyle));
            HSSFCell logicCell2 = logicRow.createCell(2);
            logicCell2.setCellValue("错误总量");
            logicCell2.setCellStyle(tableReportStyle(workBook, StyleType.table, tableFoot, tableCellStyle));
            HSSFCell logicCell3 = logicRow.createCell(3);
            logicCell3.setCellValue(fireInterfaceSummaries.get(i).getErrorCount());
            logicCell3.setCellStyle(tableReportStyle(workBook, StyleType.table, tableFoot, tableCellStyle));
            // 标题以及table头
            HSSFRow statisticsTitleRow = dataQualityStatisticsSheet.createRow(++rownum);
            HSSFCell statisticsTitleCell = statisticsTitleRow.createCell(0);
            dataQualityStatisticsSheet.addMergedRegion(new CellRangeAddress(rownum, rownum, 0, 7));
            statisticsTitleCell.setCellValue("错误统计");
            statisticsTitleCell.setCellStyle(tableReportStyle(workBook, StyleType.header, headerFoot, headerCellStyle));

            HSSFRow statisticsHeaderRow = dataQualityStatisticsSheet.createRow(++rownum);
            HSSFCell statisticsHeaderCell0 = statisticsHeaderRow.createCell(0);
            statisticsHeaderCell0.setCellValue("错误类型");
            statisticsHeaderCell0.setCellStyle(tableReportStyle(workBook, StyleType.describe, describeFoot, describeCellStyle));
            HSSFCell statisticsHeaderCell1 = statisticsHeaderRow.createCell(1);
            statisticsHeaderCell1.setCellValue("错误率");
            statisticsHeaderCell1.setCellStyle(tableReportStyle(workBook, StyleType.describe, describeFoot, describeCellStyle));
            HSSFCell statisticsHeaderCell2 = statisticsHeaderRow.createCell(2);
            statisticsHeaderCell2.setCellValue("数据项解释");
            statisticsHeaderCell2.setCellStyle(tableReportStyle(workBook, StyleType.describe, describeFoot, describeCellStyle));
            HSSFCell statisticsHeaderCell3 = statisticsHeaderRow.createCell(3);
            statisticsHeaderCell3.setCellValue("路径");
            statisticsHeaderCell3.setCellStyle(tableReportStyle(workBook, StyleType.describe, describeFoot, describeCellStyle));
            HSSFCell statisticsHeaderCell4 = statisticsHeaderRow.createCell(4);
            statisticsHeaderCell4.setCellValue("错误内容");
            statisticsHeaderCell4.setCellStyle(tableReportStyle(workBook, StyleType.describe, describeFoot, describeCellStyle));
            HSSFCell statisticsHeaderCell5 = statisticsHeaderRow.createCell(5);
            statisticsHeaderCell5.setCellValue("错误条数");
            statisticsHeaderCell5.setCellStyle(tableReportStyle(workBook, StyleType.describe, describeFoot, describeCellStyle));
            HSSFCell statisticsHeaderCell6 = statisticsHeaderRow.createCell(6);
            statisticsHeaderCell6.setCellValue("主键详情");
            statisticsHeaderCell6.setCellStyle(tableReportStyle(workBook, StyleType.describe, describeFoot, describeCellStyle));
            int childCellNum = 0;
            HSSFRow row = null;
            Map<Integer, HSSFRow> rowMap = new HashMap<>();
            // 错误类型表格
            for (int j = 0; j < fireInterfaceSummaries.get(i).getFireInterfaceErrorTypes().size(); j++) {
                FireInterfaceErrorType fireInterfaceErrorType = fireInterfaceSummaries.get(i).getFireInterfaceErrorTypes().get(j);
                rownum++;
                dataQualityStatisticsSheet.addMergedRegion(new CellRangeAddress(rownum, rownum + fireInterfaceErrorType.getFireInterfaceDataItems().size() - 1,
                                                                                0, 0));
                dataQualityStatisticsSheet.addMergedRegion(new CellRangeAddress(rownum, rownum + fireInterfaceErrorType.getFireInterfaceDataItems().size() - 1,
                                                                                1, 1));
                HSSFRow statisticsContentRow = dataQualityStatisticsSheet.createRow(rownum);
                // 错误类型
                HSSFCell errorTypeCell = statisticsContentRow.createCell(0);
                errorTypeCell.setCellStyle(tableReportStyle(workBook, StyleType.table, contentFoot, tableCellStyle));
                errorTypeCell.setCellValue(fireInterfaceErrorType.getErrorType());
                // 错误率
                HSSFCell errorRateCell = statisticsContentRow.createCell(1);
                errorRateCell.setCellStyle(tableReportStyle(workBook, StyleType.table, contentFoot, tableCellStyle));
                errorRateCell.setCellValue(fireInterfaceErrorType.getErrorRate() + "%");
                // 各种错误包含的错误数据项
                for (int k = 0; k < fireInterfaceErrorType.getFireInterfaceDataItems().size(); k++) {
                    FireInterfaceDataItem fireInterfaceDataItem = fireInterfaceErrorType.getFireInterfaceDataItems().get(k);
                    if (k == 0) {
                        // 数据项解释
                        HSSFCell describeCell = statisticsContentRow.createCell(2);
                        describeCell.setCellStyle(tableReportStyle(workBook, StyleType.table, contentFoot, tableCellStyle));
                        describeCell.setCellValue(fireInterfaceDataItem.getDescribe());
                        // 路径
                        HSSFCell pathCell = statisticsContentRow.createCell(3);
                        pathCell.setCellStyle(tableReportStyle(workBook, StyleType.table, contentFoot, tableCellStyle));
                        pathCell.setCellValue(fireInterfaceDataItem.getPath());
                        // 错误内容
                        HSSFCell errorMsgCell = statisticsContentRow.createCell(4);
                        errorMsgCell.setCellStyle(tableReportStyle(workBook, StyleType.table, contentFoot, tableCellStyle));
                        errorMsgCell.setCellValue(fireInterfaceDataItem.getErrorMsg());
                        // 错误条数
                        HSSFCell recordNumberCell = statisticsContentRow.createCell(5);
                        recordNumberCell.setCellStyle(tableReportStyle(workBook, StyleType.table, contentFoot, tableCellStyle));
                        recordNumberCell.setCellValue(fireInterfaceDataItem.getRecordNumber());
                        // 主键详情
                        HSSFCell linkCell = statisticsContentRow.createCell(6);
                        Hyperlink hyperlink = new HSSFHyperlink(Hyperlink.LINK_DOCUMENT);
                        hyperlink.setAddress("'" + fireInterfaceSummaries.get(i).getLogicInterfaceName() + "'!" + numberToLetter(childCellNum + 1) + "1");
                        linkCell.setHyperlink(hyperlink);
                        linkCell.setCellValue("点击查看");
                        linkCell.setCellStyle(tableReportStyle(workBook, StyleType.link, linkFoot, linkCellStyle));
                    } else {

                        HSSFRow statisticsContentRow1 = dataQualityStatisticsSheet.createRow(++rownum);
                        HSSFCell errorTypeCell1 = statisticsContentRow1.createCell(0);
                        errorTypeCell1.setCellStyle(tableReportStyle(workBook, StyleType.table, contentFoot, tableCellStyle));
                        errorTypeCell1.setCellValue("");
                        HSSFCell errorRateCell1 = statisticsContentRow1.createCell(1);
                        errorRateCell1.setCellStyle(tableReportStyle(workBook, StyleType.table, contentFoot, tableCellStyle));
                        errorRateCell1.setCellValue("");
                        // 数据项解释
                        HSSFCell describeCell1 = statisticsContentRow1.createCell(2);
                        describeCell1.setCellStyle(tableReportStyle(workBook, StyleType.table, contentFoot, tableCellStyle));
                        describeCell1.setCellValue(fireInterfaceDataItem.getDescribe());
                        // 路径
                        HSSFCell pathCell1 = statisticsContentRow1.createCell(3);
                        pathCell1.setCellStyle(tableReportStyle(workBook, StyleType.table, contentFoot, tableCellStyle));
                        pathCell1.setCellValue(fireInterfaceDataItem.getPath());
                        // 错误内容
                        HSSFCell errorMsgCell1 = statisticsContentRow1.createCell(4);
                        errorMsgCell1.setCellStyle(tableReportStyle(workBook, StyleType.table, contentFoot, tableCellStyle));
                        errorMsgCell1.setCellValue(fireInterfaceDataItem.getErrorMsg());
                        // 错误条数
                        HSSFCell recordNumberCell1 = statisticsContentRow1.createCell(5);
                        recordNumberCell1.setCellStyle(tableReportStyle(workBook, StyleType.table, contentFoot, tableCellStyle));
                        recordNumberCell1.setCellValue(fireInterfaceDataItem.getRecordNumber());
                        // 主键详情
                        HSSFCell linkCell = statisticsContentRow1.createCell(6);
                        Hyperlink hyperlink = new HSSFHyperlink(Hyperlink.LINK_DOCUMENT);
                        hyperlink.setAddress("'" + fireInterfaceSummaries.get(i).getLogicInterfaceName() + "'!" + numberToLetter(childCellNum + 1) + "1");
                        linkCell.setHyperlink(hyperlink);
                        linkCell.setCellValue("点击查看");
                        linkCell.setCellStyle(tableReportStyle(workBook, StyleType.link, linkFoot, linkCellStyle));
                    }
                    HSSFCell childHeaderCell = childFirstRow.createCell(childCellNum);
                    childHeaderCell.setCellStyle(tableReportStyle(workBook, StyleType.describe, describeFoot, contentCellStyle));
                    childHeaderCell.setCellValue(fireInterfaceDataItem.getErrorMsg());
                    for (int m = 0; m < fireInterfaceDataItem.getFireInterfacePrimaryKeys().size(); m++) {
                        if (childCellNum == 0) {
                            row = childSheet.createRow(m + 1);
                            rowMap.put(m, row);
                        }
                        if (rowMap.get(m) != null) {
                            row = rowMap.get(m);
                        } else {
                            row = childSheet.createRow(m + 1);
                        }
                        HSSFCell cell = row.createCell(childCellNum);
                        cell.setCellValue(fireInterfaceDataItem.getFireInterfacePrimaryKeys().get(m).getIdentifier());
                        cell.setCellStyle(tableReportStyle(workBook, StyleType.table, contentFoot, tableCellStyle));
                    }
                    childCellNum++;
                }
            }
            rownum++;
        }
        try {
            /*
             * File file = new File("D:\\etc", "test1.xlsx");
             * FileOutputStream o = new FileOutputStream(file);
             */
            workBook.write(out);
        } catch (IOException e) {
            log.error("生成excel出错!");
            throw new RuntimeException(e);
        }

    }

    public void createExcel(List<TableSummary> tableSummaries, OutputStream out, DataQualityRequest dataQualityRequest) {
        Workbook workBook = new HSSFWorkbook();

        Sheet dataQualityStatisticsSheet = workBook.createSheet();
        Font tableFoot = workBook.createFont();
        Font titleFoot = workBook.createFont();
        Font headerFoot = workBook.createFont();
        Font contentFoot = workBook.createFont();
        Font describeFoot = workBook.createFont();
        Font linkFoot = workBook.createFont();
        CellStyle tableCellStyle = workBook.createCellStyle();
        CellStyle titleCellStyle = workBook.createCellStyle();
        CellStyle headerCellStyle = workBook.createCellStyle();
        CellStyle contentCellStyle = workBook.createCellStyle();
        CellStyle describeCellStyle = workBook.createCellStyle();
        CellStyle linkCellStyle = workBook.createCellStyle();
        dataQualityStatisticsSheet.setDefaultColumnWidth(20);
        dataQualityStatisticsSheet.setDefaultRowHeightInPoints(80);
        dataQualityStatisticsSheet.setDefaultRowHeight((short) 80);
        dataQualityStatisticsSheet.setPrintGridlines(false);
        dataQualityStatisticsSheet.setDisplayGridlines(false);
        dataQualityStatisticsSheet.setDisplayGuts(false);
        workBook.setSheetName(0, "数据质量统计");
        dataQualityStatisticsSheet.addMergedRegion(new CellRangeAddress(0, 0, 0, 4));
        dataQualityStatisticsSheet.setSelected(true);

        Row firstRow = dataQualityStatisticsSheet.createRow(0);

        firstRow.setHeightInPoints(30);

        Cell headerCell = firstRow.createCell(0);
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        if (dataQualityRequest.getStart() != null) {
            headerCell.setCellValue("错误消息汇总统计" + formatter.format(dataQualityRequest.getStart()) + " - " + formatter.format(dataQualityRequest.getEnd()));
        } else {
            headerCell.setCellValue("错误消息汇总统计截至到" + formatter.format(dataQualityRequest.getEnd()));
        }

        headerCell.setCellStyle(tableReportStyle(workBook, StyleType.title, titleFoot, titleCellStyle));
        int rownum = 1;
        Row row = null;
        Cell cell = null;
        for (int i = 0; i < tableSummaries.size(); i++) {
            // 创建子页面
            Map<Integer, Row> rowMap = new HashMap<>();
            Sheet childSheet = workBook.createSheet();
            if (tableSummaries.get(i).getLogicTableName() != null) {
                workBook.setSheetName(i + 1, tableSummaries.get(i).getLogicTableName());
            } else {
                workBook.setSheetName(i + 1, tableSummaries.get(i).getPhysicalTableName());
            }

            childSheet.setDefaultColumnWidth(20);
            childSheet.setDefaultRowHeightInPoints(80);
            childSheet.setDefaultRowHeight((short) 80);
            Row childHeaderRow = childSheet.createRow(0);

            Row physicalRow = dataQualityStatisticsSheet.createRow(++rownum);
            physicalRow.setHeightInPoints(16);
            Cell physicalCell0 = physicalRow.createCell(0);
            physicalCell0.setCellStyle(tableReportStyle(workBook, StyleType.table, tableFoot, tableCellStyle));
            physicalCell0.setCellValue("表物理名");
            Cell physicalCell1 = physicalRow.createCell(1);
            physicalCell1.setCellStyle(tableReportStyle(workBook, StyleType.table, tableFoot, tableCellStyle));
            physicalCell1.setCellValue(tableSummaries.get(i).getPhysicalTableName());
            Cell physicalCell2 = physicalRow.createCell(2);
            physicalCell2.setCellValue("错误率");
            physicalCell2.setCellStyle(tableReportStyle(workBook, StyleType.table, tableFoot, tableCellStyle));
            Cell physicalCell3 = physicalRow.createCell(3);
            physicalCell3.setCellValue(tableSummaries.get(i).getErrorRate() + "%");
            physicalCell3.setCellStyle(tableReportStyle(workBook, StyleType.table, tableFoot, tableCellStyle));

            Row logicRow = dataQualityStatisticsSheet.createRow(++rownum);
            Cell logicCell0 = logicRow.createCell(0);
            logicCell0.setCellValue("逻辑表名");
            logicCell0.setCellStyle(tableReportStyle(workBook, StyleType.table, tableFoot, tableCellStyle));
            Cell logicCell1 = logicRow.createCell(1);
            logicCell1.setCellValue(tableSummaries.get(i).getLogicTableName());
            logicCell1.setCellStyle(tableReportStyle(workBook, StyleType.table, tableFoot, tableCellStyle));
            Cell logicCell2 = logicRow.createCell(2);
            logicCell2.setCellValue("错误总量");
            logicCell2.setCellStyle(tableReportStyle(workBook, StyleType.table, tableFoot, tableCellStyle));
            Cell logicCell3 = logicRow.createCell(3);
            logicCell3.setCellValue(tableSummaries.get(i).getRecordNumber() * tableSummaries.get(i).getErrorRate() / 100);
            logicCell3.setCellStyle(tableReportStyle(workBook, StyleType.table, tableFoot, tableCellStyle));

            Row statisticsTitleRow = dataQualityStatisticsSheet.createRow(++rownum);
            Cell statisticsTitleCell = statisticsTitleRow.createCell(0);
            dataQualityStatisticsSheet.addMergedRegion(new CellRangeAddress(rownum, rownum, 0, 4));
            statisticsTitleCell.setCellValue("错误统计");
            statisticsTitleCell.setCellStyle(tableReportStyle(workBook, StyleType.header, headerFoot, headerCellStyle));

            Row statisticsHeaderRow = dataQualityStatisticsSheet.createRow(++rownum);
            Cell statisticsHeaderCell0 = statisticsHeaderRow.createCell(0);
            statisticsHeaderCell0.setCellValue("字段物理名");
            statisticsHeaderCell0.setCellStyle(tableReportStyle(workBook, StyleType.describe, describeFoot, describeCellStyle));
            Cell statisticsHeaderCell1 = statisticsHeaderRow.createCell(1);
            statisticsHeaderCell1.setCellValue("字段逻辑名");
            statisticsHeaderCell1.setCellStyle(tableReportStyle(workBook, StyleType.describe, describeFoot, describeCellStyle));
            Cell statisticsHeaderCell2 = statisticsHeaderRow.createCell(2);
            statisticsHeaderCell2.setCellValue("错误内容");
            statisticsHeaderCell2.setCellStyle(tableReportStyle(workBook, StyleType.describe, describeFoot, describeCellStyle));
            Cell statisticsHeaderCell3 = statisticsHeaderRow.createCell(3);
            statisticsHeaderCell3.setCellValue("错误条数");
            statisticsHeaderCell3.setCellStyle(tableReportStyle(workBook, StyleType.describe, describeFoot, describeCellStyle));
            Cell statisticsHeaderCell4 = statisticsHeaderRow.createCell(4);
            statisticsHeaderCell4.setCellValue("主键详情");
            statisticsHeaderCell4.setCellStyle(tableReportStyle(workBook, StyleType.describe, describeFoot, describeCellStyle));

            // 表中错误字段
            for (int j = 0; j < tableSummaries.get(i).getColumnSummaries().size(); j++) {
                ColumnSummary columnSummary = tableSummaries.get(i).getColumnSummaries().get(j);
                Cell childHeaderCell = childHeaderRow.createCell(j);
                childHeaderCell.setCellValue(columnSummary.getErrorMessage() + "的业务主键");
                childHeaderCell.setCellStyle(tableReportStyle(workBook, StyleType.describe, describeFoot, describeCellStyle));
                // 该错误字段的消息
                for (int k = 0; k < columnSummary.getColumnDetailSummaries().size(); k++) {
                    if (j == 0) {
                        row = childSheet.createRow(k + 1);
                        rowMap.put(k, row);
                    }
                    if (rowMap.get(k) != null) {
                        row = rowMap.get(k);
                    } else {
                        row = childSheet.createRow(k + 1);
                    }
                    cell = row.createCell(j);
                    cell.setCellValue(columnSummary.getColumnDetailSummaries().get(k).getIdentifier());
                    cell.setCellStyle(tableReportStyle(workBook, StyleType.content, contentFoot, contentCellStyle));
                }

                Row statisticsContentRow = dataQualityStatisticsSheet.createRow(++rownum);
                Cell statisticsContentCell0 = statisticsContentRow.createCell(0);
                statisticsContentCell0.setCellValue(columnSummary.getPhysicalColumnName());
                statisticsContentCell0.setCellStyle(tableReportStyle(workBook, StyleType.content, contentFoot, contentCellStyle));
                Cell statisticsContentCell1 = statisticsContentRow.createCell(1);
                statisticsContentCell1.setCellValue(columnSummary.getLogicColumnName());
                statisticsContentCell1.setCellStyle(tableReportStyle(workBook, StyleType.content, contentFoot, contentCellStyle));
                Cell statisticsContentCell2 = statisticsContentRow.createCell(2);
                statisticsContentCell2.setCellValue(columnSummary.getErrorMessage());
                statisticsContentCell2.setCellStyle(tableReportStyle(workBook, StyleType.content, contentFoot, contentCellStyle));
                Cell statisticsContentCell3 = statisticsContentRow.createCell(3);
                statisticsContentCell3.setCellValue(columnSummary.getRecordNumber());
                statisticsContentCell3.setCellStyle(tableReportStyle(workBook, StyleType.content, contentFoot, contentCellStyle));
                Cell linkCell = statisticsContentRow.createCell(4);
                Hyperlink hyperlink = new HSSFHyperlink(Hyperlink.LINK_DOCUMENT);
                hyperlink.setAddress("'" + tableSummaries.get(i).getLogicTableName() + "'!" + numberToLetter(j + 1) + "1");
                linkCell.setHyperlink(hyperlink);
                linkCell.setCellValue("点击查看");
                linkCell.setCellStyle(tableReportStyle(workBook, StyleType.link, linkFoot, linkCellStyle));
            }
            rownum++;
        }
        try {
            /*
             * File file = new File("D:\\etc", "test1.xlsx");
             * FileOutputStream o = new FileOutputStream(file);
             */
            log.info("服务端数据处理完毕，开始构建输入输入流，往浏览器写入数据，开始下载.........");
            workBook.write(out);
            log.info("下载完毕!!");
        } catch (IOException e) {
            log.error("生成excel出错!");
            throw new RuntimeException(e);
        }

    }

    public String numberToLetter(int number) {
        if (number <= 26) {
            return String.valueOf((char) (number + 64));
        } else {
            return String.valueOf((char) (number / 26 + 64)) + String.valueOf((char) (number % 26 + 64));
        }
    }

    public CellStyle tableReportStyle(Workbook workBook, StyleType styleType, Font font, CellStyle cellStyle) {
        CellStyle style = cellStyle;
        Font fontStyle = font;
        fontStyle.setFontName("等线");
        if (styleType.equals(StyleType.title)) {
            style.setAlignment(XSSFCellStyle.ALIGN_CENTER);
            style.setVerticalAlignment(XSSFCellStyle.VERTICAL_CENTER);
            fontStyle.setFontHeightInPoints((short) 16);
            fontStyle.setBoldweight(Font.BOLDWEIGHT_BOLD);
        } else if (styleType.equals(StyleType.header)) {
            style.setAlignment(XSSFCellStyle.ALIGN_CENTER);
            style.setVerticalAlignment(XSSFCellStyle.VERTICAL_CENTER);
            fontStyle.setFontHeightInPoints((short) 14);
            fontStyle.setBoldweight(Font.BOLDWEIGHT_BOLD);
            fontStyle.setColor(IndexedColors.BLACK.getIndex());
            border(style);
        } else if (styleType.equals(StyleType.table)) {
            style.setAlignment(XSSFCellStyle.ALIGN_LEFT);
            style.setVerticalAlignment(XSSFCellStyle.ALIGN_LEFT);
            fontStyle.setFontHeightInPoints((short) 11);
            fontStyle.setBoldweight(Font.BOLDWEIGHT_BOLD);
            fontStyle.setColor(IndexedColors.BLACK.getIndex());
            border(style);
        } else if (styleType.equals(StyleType.content)) {
            style.setAlignment(XSSFCellStyle.ALIGN_LEFT);
            fontStyle.setFontHeightInPoints((short) 11);
            fontStyle.setBoldweight(Font.BOLDWEIGHT_BOLD);
            fontStyle.setColor(IndexedColors.BLACK.getIndex());
            border(style);
        } else if (styleType.equals(StyleType.describe)) {
            fontStyle.setFontHeightInPoints((short) 11);
            fontStyle.setBoldweight(Font.BOLDWEIGHT_BOLD);
            style.setFillForegroundColor(IndexedColors.PALE_BLUE.getIndex());
            style.setFillPattern(CellStyle.SOLID_FOREGROUND);
            fontStyle.setColor(IndexedColors.BLACK.getIndex());
            border(style);
        } else if (styleType.equals(StyleType.link)) {
            fontStyle.setFontHeightInPoints((short) 11);
            fontStyle.setBoldweight(Font.BOLDWEIGHT_BOLD);
            fontStyle.setColor(IndexedColors.PALE_BLUE.getIndex());
            border(style);
        }
        style.setFont(fontStyle);
        return style;
    }

    public void border(CellStyle style) {
        style.setBorderBottom(HSSFCellStyle.BORDER_THIN);// 下边框
        style.setBorderLeft(HSSFCellStyle.BORDER_THIN);// 左边框
        style.setBorderRight(HSSFCellStyle.BORDER_THIN);// 右边框
        style.setBorderTop(HSSFCellStyle.BORDER_THIN);// 上边框
    }

    private static int divide(int number) {
        int a = 26;
        int k = 0;
        int c = 1;
        while (number > a) {
            k++;
            a = a * 26;
        }
        int remainder = number - a / 26;
        for (int i = 0; i < k - 1; i++) {
            for (int j = 0; j < k - i; j++) {
                c = c * 26;
            }
            System.out.println((char) (remainder / c + 1 + 64));
        }
        System.out.println((char) (remainder % 26 + 64));
        return a;

    }

    private enum StyleType {
                            table,
                            title,
                            header,
                            content,
                            describe,
                            link
    }

}
