package com.nestvision.nest.proxy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.system.ApplicationPidFileWriter;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;


@SpringBootApplication
@ImportResource({ "classpath*:spring/*-context.xml" })
@ComponentScan(basePackages = { "com.nestvision.nest.proxy", "com.nestvision.nest.managment" })
public class NestMedicalServiceApplication {
    public static void main(String[] args) {
    	SpringApplication application = new SpringApplication(NestMedicalServiceApplication.class);
        application.addListeners(new ApplicationPidFileWriter());
        application.run(args);
        /*String identifier = ServiceTrackUtil.parseStartIdentifier(args);

        try {
            SpringApplication.run(NestMedicalServiceApplication.class, args);
            System.out.println(ServiceTrackUtil.buildStartSign(identifier, ServiceTrackUtil.SUCCESS_SIGN));
        } catch (Exception e) {
            System.out.println(ServiceTrackUtil.buildStartSign(identifier, ServiceTrackUtil.FAIL_SIGN));
            throw e;
        } finally {
            System.out.println(ServiceTrackUtil.buildStartSign(identifier, ServiceTrackUtil.COMPLETE_SIGN));
        }*/

    }
}
