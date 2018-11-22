package com.nestvision.nest.proxy.freemarker;

import java.util.Iterator;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.ContextStartedEvent;
import org.springframework.stereotype.Component;

import com.nestvision.nest.proxy.freemarker.method.FreeMarkerCustomMethod;

import freemarker.template.Configuration;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class FreemarkerConfiguration implements ApplicationListener<ContextRefreshedEvent> {

    @Autowired
    private Configuration configuration;

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        ApplicationContext applicationContext = event.getApplicationContext();
        Map<String, FreeMarkerCustomMethod> map = applicationContext.getBeansOfType(FreeMarkerCustomMethod.class);
        Iterator<String> it = map.keySet().iterator();
        while (it.hasNext()) {
            FreeMarkerCustomMethod freeMarkerCustomMethod = map.get(it.next());
            String className = freeMarkerCustomMethod.getClass().getSimpleName();
            String sharedVariable = StringUtils.removeEnd(className, "Method");
            sharedVariable = StringUtils.uncapitalize(sharedVariable);
            configuration.setSharedVariable(sharedVariable, freeMarkerCustomMethod);
            log.info("初始化Freemarker的自定义方法:\"{}\"==>\"{}\"", sharedVariable, freeMarkerCustomMethod.getClass().getName());
        }
    }

}
