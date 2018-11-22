package com.nestvision.nest.proxy.base.service;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.nestvision.nest.proxy.base.dao.BaseRepository;
import com.nestvision.nest.proxy.fhir.entity.FhirResourceEntity;
import com.nestvision.nest.proxy.nest.service.NestRequestService;

@Service
public abstract class AbstractBaseService<T, P extends Serializable> implements BaseService<T, P> {

    @Autowired
    private NestRequestService nestRequestService;

    private Class<? extends FhirResourceEntity> entityClass;

    public AbstractBaseService() {
        ParameterizedType type = (ParameterizedType) getClass().getGenericSuperclass();
        Type[] actualTypes = type.getActualTypeArguments();
        this.entityClass = (Class) actualTypes[0];

    }

    @Override
    @Transactional
    public void save(T entity) {
        getBaseRepository().save(entity);
    }

    @Override
    @Transactional
    public void saveAll(Iterable<T> entities) {
        getBaseRepository().save(entities);

    }

    @Override
    @Transactional(readOnly = true)
    public T findOne(P id) {

        return getBaseRepository().findOne(id);
    }

    @Override
    @Transactional(readOnly = true)
    public boolean exists(P id) {
        return getBaseRepository().exists(id);
    }

    @Override
    @Transactional(readOnly = true)
    public List<T> findAll() {

        return getBaseRepository().findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Page<T> findAll(Pageable pageable) {

        return getBaseRepository().findAll(pageable);
    }

    @Override
    @Transactional(readOnly = true)
    public long count() {
        return getBaseRepository().count();
    }

    @Override
    @Transactional(readOnly = true)
    public Page<T> findAll(Specification<T> specification, Pageable pageable) {
        return getBaseRepository().findAll(specification, pageable);
    }

    @Override
    @Transactional
    public void delete(P id) {

        if (id instanceof String) {
            String stringId = (String) id;
            if (this.entityClass.isAssignableFrom(FhirResourceEntity.class)) {
                nestRequestService.deleteNestRequests(this.entityClass, stringId);
            }
        }
        getBaseRepository().delete(id);

    }

    @Override
    @Transactional
    public void deleteAll(P[] ids) {
        BaseRepository<T, P> resp = getBaseRepository();
        for (P id : ids) {
            resp.delete(id);
        }

    }

    @Override
    @Transactional
    public void delete(T entity) {
        getBaseRepository().delete(entity);

    }

    @Override
    @Transactional
    public void deleteAll() {
        getBaseRepository().deleteAllInBatch();

    }

    protected abstract BaseRepository<T, P> getBaseRepository();
}
