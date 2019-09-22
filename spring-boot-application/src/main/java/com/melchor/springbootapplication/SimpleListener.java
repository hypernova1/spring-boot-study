package com.melchor.springbootapplication;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class SimpleListener implements ApplicationRunner {

    private Logger logger = LoggerFactory.getLogger(SimpleListener.class);

    @Value("${sam.name}")
    private String name;
    private String hello;
    private SamProperties properties;

    public SimpleListener(SamProperties properties, String hello){
        this.properties = properties;
        this.hello = hello;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        logger.debug("===================");
        logger.debug("log test");
        logger.debug("===================");
        System.out.println(properties.getName());
        System.out.println(properties.getSessionTimeout());

        System.out.println(hello);

    }
}
