package com.nestvision.nest.proxy.nest.dao;

import java.util.List;

import com.nestvision.nest.proxy.base.dao.BaseRepository;
import com.nestvision.nest.proxy.nest.entity.InterfaceDataQualityReport;

public interface InterfaceDataQualityReportRepository extends BaseRepository<InterfaceDataQualityReport, String> {
    InterfaceDataQualityReport findById(Long id);

    List<InterfaceDataQualityReport> findByIdentifier(String identifier);
}
