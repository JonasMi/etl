package com.nestvision.nest.proxy.fhir.query;

import com.nestvision.nest.proxy.fhir.entity.FhirResourceEntity;
import lombok.Data;
import org.springframework.data.jpa.domain.Specification;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

@Data
public class FhirResourceQuery<T extends FhirResourceEntity> implements Specification<T> {

    @Override
    public Predicate toPredicate(Root<T> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
        List<Predicate> list = new ArrayList<>();
        list.add(cb.isNull(root.get("dealState")));

        Predicate[] p = new Predicate[list.size()];
        return cb.and(list.toArray(p));
    }

}
