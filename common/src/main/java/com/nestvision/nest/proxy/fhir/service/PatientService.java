package com.nestvision.nest.proxy.fhir.service;

import com.nestvision.nest.proxy.base.service.BaseService;
import com.nestvision.nest.proxy.fhir.entity.FhirResourceEntity;
import com.nestvision.nest.proxy.fhir.entity.Patient;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface PatientService extends BaseService<Patient, String> {

    /**
     * 手动添加的偌
     *
     * @param bizId         业务主键
     * @param processResult 处理结果
     * @param timeBegin     起始时间
     * @param timeEnd       结束时间
     * @param pageable      分页
     * @return 数据列表
     */
    Page<Patient> findAll(String bizId, FhirResourceEntity.ProcessResult processResult, long timeBegin, long timeEnd, Pageable pageable);
}