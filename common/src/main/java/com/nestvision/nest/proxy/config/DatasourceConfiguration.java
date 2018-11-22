package com.nestvision.nest.proxy.config;

import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

@Configuration
public class DatasourceConfiguration {

    @Autowired
    private Environment env;

    @Bean
    public DataSource dataSource() {
        BasicDataSource dataSource = new BasicDataSource();
        dataSource.setDriverClassName(env.getProperty("spring.datasource.driver-class-name"));
        dataSource.setUrl(env.getProperty("spring.datasource.url"));
        dataSource.setUsername(env.getProperty("spring.datasource.username"));
        dataSource.setPassword(env.getProperty("spring.datasource.password"));
        dataSource.setMaxIdle(env.getProperty("spring.datasource.max-idle", Integer.class, 10));
        dataSource.setMaxActive(env.getProperty("spring.datasource.max-active", Integer.class, 100));
        dataSource.setMaxWait(env.getProperty("spring.datasource.max-wait", Long.class, 10000L));
        dataSource.setMinIdle(env.getProperty("spring.datasource.min-idle", Integer.class, 10));
        dataSource.setInitialSize(env.getProperty("spring.datasource.initial-size", Integer.class, 10));
        dataSource.setValidationQuery(env.getProperty("spring.datasource.validation-query", String.class, "SELECT 1"));
        dataSource.setTestOnBorrow(env.getProperty("spring.datasource.test-on-borrow", Boolean.class, false));
        dataSource.setTestWhileIdle(env.getProperty("spring.datasource.test-while-idle", Boolean.class, true));
        dataSource.setTimeBetweenEvictionRunsMillis(env.getProperty("spring.datasource.time-between-eviction-runs-millis", Long.class, 18800L));

        return dataSource;
    }
}
