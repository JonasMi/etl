package com.nestvision.nest.proxy.nest.service.impl;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.nestvision.nest.proxy.base.dao.BaseRepository;
import com.nestvision.nest.proxy.base.service.AbstractBaseService;
import com.nestvision.nest.proxy.fhir.entity.FhirResourceEntity.OperationState;
import com.nestvision.nest.proxy.nest.api.request.DataQualityRequest;
import com.nestvision.nest.proxy.nest.api.response.ColumnDetailSummary;
import com.nestvision.nest.proxy.nest.api.response.ColumnSummary;
import com.nestvision.nest.proxy.nest.api.response.TableSummary;
import com.nestvision.nest.proxy.nest.dao.DataQualityReportRepository;
import com.nestvision.nest.proxy.nest.entity.DataQualityReport;
import com.nestvision.nest.proxy.nest.service.DataQualityReportService;
import com.nestvision.nest.proxy.nest.service.TableLogicPhysicsMappingService;

@Service
@Transactional
public class DefaultDataQualityReportService extends AbstractBaseService<DataQualityReport, String> implements DataQualityReportService {
    @Autowired
    private DataQualityReportRepository dataQualityReportRepository;

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Autowired
    private TableLogicPhysicsMappingService tableLogicPhysicsMappingService;

    @Override
    protected BaseRepository<DataQualityReport, String> getBaseRepository() {
        return dataQualityReportRepository;
    }

    @Override
    public Page<TableSummary> dynamicQuery(DataQualityRequest dataQualityRequest, Pageable pageable, QueryType queryType) {
        // 以表名聚合，查表名次，记录数以及错误率
        StringBuilder querySql = new StringBuilder();
        StringBuilder queryCountSql = new StringBuilder();
        List<Object> parameters = new ArrayList<>();
        querySql.append("select physical_table_name as physicalTableName,");
        querySql.append("count(physical_table_name) as recordNumber," + "logic_table_name as logicTableName,");
        querySql.append("round(sum(case when invalid_columns_total!=0 then 1 else 0 end)/count(physical_table_name)*100,2) as errorRate ");
        querySql.append(" from t_data_quality_report " + "where 1 = 1 ");
        if (dataQualityRequest.getStart() != null) {
            querySql.append(" and up_time >= ?");
            parameters.add(dataQualityRequest.getStart());
        }
        if (dataQualityRequest.getEnd() != null) {
            querySql.append(" and up_time <= ?");
            parameters.add(dataQualityRequest.getEnd());
        }
        if (dataQualityRequest.getTableName() != null) {
            querySql.append(" and (physical_table_name like ? or logic_table_name like ?)");
            parameters.add("%" + dataQualityRequest.getTableName() + "%");
            parameters.add("%" + dataQualityRequest.getTableName() + "%");
        }
        querySql.append(" GROUP BY physical_table_name");
        /*querySql.append(" having errorRate > 0");*/
        queryCountSql.append("select count(*) from (");
        queryCountSql.append(querySql.toString());
        queryCountSql.append(") as table_name");
        querySql.append(" order by errorRate desc");
        if (queryType.equals(QueryType.page)) {
            querySql.append(" limit " + (pageable.getPageNumber()) * pageable.getPageSize() + "," + pageable.getPageSize());
        }
        List<Map<String, Object>> resultList = jdbcTemplate.queryForList(querySql.toString(), parameters.toArray());
        int count = jdbcTemplate.queryForObject(queryCountSql.toString(), Integer.class, parameters.toArray());
        List<TableSummary> tableSummaries = new ArrayList<>();
        resultList.forEach(result -> {
            TableSummary tableSummary = new TableSummary();
            tableSummary.setErrorRate(Float.parseFloat(result.get("errorRate").toString()));
            tableSummary.setPhysicalTableName(result.get("physicalTableName").toString());
            tableSummary.setLogicTableName(tableLogicPhysicsMappingService.getTableLogicName(result.get("physicalTableName").toString()));
            tableSummary.setRecordNumber(Integer.parseInt(result.get("recordNumber").toString()));
            tableSummaries.add(tableSummary);
        });
        return new PageImpl<>(tableSummaries, pageable, count);
    }

    @Override
    public Page<ColumnSummary> findByPhysicalTableName(String physicalTableName, Pageable pageable, QueryType queryType) {
        // 以表名为必要条件，数据记录主表关联错误字段表，外键关联。以字段名为分组条件，查询表中错误字段的错误数。
        StringBuilder querySql = new StringBuilder();
        StringBuilder queryCountSql = new StringBuilder();
        querySql.append("select t2.name as physicalColumnName,t2.display_name as logicColumnName,t2.invalid_message as errorMessage,");
        querySql.append("count(name) as recordNumber");
        querySql.append(" from t_data_quality_report t1");
        querySql.append(" inner join t_data_quaity_report_invalid_column t2 on t1.id = t2.data_quality_report_id");
        querySql.append(" where t1.physical_table_name = ?");
        querySql.append(" group by t2.name");
        queryCountSql.append("select count(*) from (");
        queryCountSql.append(querySql.toString());
        queryCountSql.append(") as table_name");
        if (queryType.equals(QueryType.page)) {
            querySql.append(" limit " + (pageable.getPageNumber()) * pageable.getPageSize() + "," + pageable.getPageSize());
        }
        List<Map<String, Object>> resultList = jdbcTemplate.queryForList(querySql.toString(), new Object[] { physicalTableName });
        int count = jdbcTemplate.queryForObject(queryCountSql.toString(), Integer.class, new Object[] { physicalTableName });
        List<ColumnSummary> columnSummaries = new ArrayList<>();
        resultList.forEach(result -> {
            ColumnSummary columnSummary = new ColumnSummary();
            columnSummary.setErrorMessage(result.get("errorMessage").toString());
            columnSummary.setLogicColumnName(result.get("logicColumnName").toString());
            columnSummary.setPhysicalColumnName(result.get("physicalColumnName").toString());
            columnSummary.setRecordNumber(Integer.parseInt(result.get("recordNumber").toString()));
            columnSummaries.add(columnSummary);
        });
        return new PageImpl<>(columnSummaries, pageable, count);
    }

    @Override
    public Page<ColumnDetailSummary> findByColumnName(String columnName, Pageable pageable, QueryType queryType, String physicalTableName) {
        // 以字段名表名为必要条件，错误字段表级联数据记录表主表，外键关联。查询该字段出错的消息。
        StringBuilder querySql = new StringBuilder();
        StringBuilder queryCountSql = new StringBuilder();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        querySql.append("select t1.data_quality_report_id as id,");
        querySql.append("t2.up_time as upTime,");
        querySql.append("t2.identifier as identifier,");
        querySql.append("t2.operation_state as operationState,");
        querySql.append("t1.column_value as columnValue");
        querySql.append(" from t_data_quaity_report_invalid_column t1");
        querySql.append(" inner join t_data_quality_report t2 on t1.data_quality_report_id = t2.id");
        querySql.append(" where t1.name = ? and (t2.physical_table_name = ? or t2.logic_table_name = ?)");
        queryCountSql.append("select count(*) from (");
        queryCountSql.append(querySql.toString());
        queryCountSql.append(") as table_name");
        if (queryType.equals(QueryType.page)) {
            querySql.append(" limit " + (pageable.getPageNumber()) * pageable.getPageSize() + "," + pageable.getPageSize());
        }
        List<Map<String, Object>> resultList = jdbcTemplate.queryForList(querySql.toString(),
                                                                         new Object[] { columnName, physicalTableName, physicalTableName });
        int count = jdbcTemplate.queryForObject(queryCountSql.toString(), Integer.class, new Object[] { columnName, physicalTableName, physicalTableName });
        List<ColumnDetailSummary> columnDetailSummaries = new ArrayList<>();
        resultList.forEach(result -> {
            ColumnDetailSummary columnDetailSummary = new ColumnDetailSummary();
            if (result.get("columnValue") != null) {
                columnDetailSummary.setColumnValue(result.get("columnValue").toString());
            } else {
                columnDetailSummary.setColumnValue(" ");
            }
            columnDetailSummary.setId(result.get("id").toString());
            columnDetailSummary.setIdentifier(result.get("identifier").toString());
            columnDetailSummary.setOperationState(OperationState.valueOf(Integer.parseInt(result.get("operationState").toString())));
            try {
                columnDetailSummary.setUpTime(formatter.parse(result.get("upTime").toString()));
            } catch (ParseException e) {
                e.printStackTrace();
            }
            columnDetailSummaries.add(columnDetailSummary);
        });
        return new PageImpl<>(columnDetailSummaries, pageable, count);
    }

    @Override
    public String findLogicNameByColumnName(String columnName) {
        StringBuilder querySql = new StringBuilder();
        querySql.append("select display_name as displayName from  t_data_quaity_report_invalid_column ");
        querySql.append(" where name = ?");
        querySql.append(" group by name");
        return jdbcTemplate.queryForObject(querySql.toString(), String.class, new Object[] { columnName });
    }

    public enum QueryType {
                           page,
                           excel,
                           hospital,
                           all
    }

}
