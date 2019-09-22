package com.melchor.springbootapplication.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Profile("sam")
@Configuration
public class SamConfiguration {

    @Bean
    public String hello() {
        return "hello sam";
    }

}
