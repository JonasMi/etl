package com.nestvision.nest.proxy.base.service;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;

public interface BaseService<T, P extends Serializable> {

    public long count();

    public void save(T entity);

    public void saveAll(Iterable<T> entities);

    public T findOne(P id);

    public boolean exists(P id);

    public List<T> findAll();

    public Page<T> findAll(Pageable pageable);

    public Page<T> findAll(Specification<T> specification, Pageable pageable);

    public void delete(P id);

    public void deleteAll(P[] ids);

    public void delete(T entity);

    public void deleteAll();
}
