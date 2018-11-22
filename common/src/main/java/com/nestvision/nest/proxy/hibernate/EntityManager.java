package com.nestvision.nest.proxy.hibernate;

import javax.annotation.PostConstruct;
import javax.persistence.EntityManagerFactory;

import org.hibernate.SessionFactory;
import org.hibernate.persister.entity.AbstractEntityPersister;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EntityManager {

    @Autowired
    private EntityManagerFactory entityManagerFactory;

    private SessionFactory sessionFactory;

    @PostConstruct
    protected void init() {
        sessionFactory = entityManagerFactory.unwrap(SessionFactory.class);
    }

    public String getTableName(Class<?> clazz) {
        AbstractEntityPersister classMetadata = (AbstractEntityPersister) sessionFactory.getClassMetadata(clazz);
        return classMetadata.getTableName();
    }
}
