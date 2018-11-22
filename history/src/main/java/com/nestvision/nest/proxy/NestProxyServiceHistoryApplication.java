package com.nestvision.nest.proxy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.system.ApplicationPidFileWriter;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@ImportResource({ "classpath*:spring/*-context.xml" })
@ComponentScan(basePackages = { "com.nestvision.nest.proxy", "com.nestvision.nest.managment" })
@EnableScheduling
public class NestProxyServiceHistoryApplication {

    public static void main(String[] args) {
    	SpringApplication application = new SpringApplication(NestProxyServiceHistoryApplication.class);
        application.addListeners(new ApplicationPidFileWriter());
        application.run(args);
        /*String identifier = ServiceTrackUtil.parseStartIdentifier(args);
        try {
            SpringApplication.run(NestProxyServiceHistoryApplication.class, args);
            System.out.println(ServiceTrackUtil.buildStartSign(identifier, ServiceTrackUtil.SUCCESS_SIGN));
        } catch (Exception e) {
            System.out.println(ServiceTrackUtil.buildStartSign(identifier, ServiceTrackUtil.FAIL_SIGN));
            throw e;
        } finally {
            System.out.println(ServiceTrackUtil.buildStartSign(identifier, ServiceTrackUtil.COMPLETE_SIGN));
        }*/
    }
}
