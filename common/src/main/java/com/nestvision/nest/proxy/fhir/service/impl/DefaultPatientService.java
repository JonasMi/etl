package com.nestvision.nest.proxy.fhir.service.impl;

import com.nestvision.nest.proxy.base.dao.BaseRepository;
import com.nestvision.nest.proxy.base.service.AbstractBaseService;
import com.nestvision.nest.proxy.fhir.dao.PatientRepository;
import com.nestvision.nest.proxy.fhir.entity.FhirResourceEntity;
import com.nestvision.nest.proxy.fhir.entity.Patient;
import com.nestvision.nest.proxy.fhir.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import javax.persistence.criteria.Predicate;
import java.util.ArrayList;
import java.util.List;

@Service
public class DefaultPatientService extends AbstractBaseService<Patient, String> implements PatientService {

    @Autowired
    private PatientRepository patientRepository;

    @Override
    protected BaseRepository<Patient, String> getBaseRepository() {

        return patientRepository;
    }

    // 手动添加的代码
    @Override
    public Page<Patient> findAll(String bizId, FhirResourceEntity.ProcessResult processResult, long timeBegin, long timeEnd, Pageable pageable) {
        return patientRepository.findAll((Specification<Patient>) (root, criteriaQuery, criteriaBuilder) -> {
            List<Predicate> predicateList = new ArrayList<>();

            if (StringUtils.hasLength(bizId)) {
                predicateList.add(criteriaBuilder.like(root.get("patientId").as(String.class), bizId + "%"));
            }

            if (timeBegin != 0) {
                predicateList.add(criteriaBuilder.greaterThan(root.get("upTime").as(Long.class), timeBegin));
            }

            if (timeEnd != 0) {
                predicateList.add(criteriaBuilder.lessThan(root.get("upTime").as(Long.class), timeEnd));
            }

            if (processResult != null) {
                predicateList.add(criteriaBuilder.equal(root.get("processResult").as(FhirResourceEntity.ProcessResult.class), processResult));
            }

            Predicate[] p = new Predicate[predicateList.size()];
            return criteriaBuilder.and(predicateList.toArray(p));
        }, pageable);
    }
}
