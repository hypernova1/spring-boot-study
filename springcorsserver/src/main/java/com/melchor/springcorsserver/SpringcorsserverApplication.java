package com.melchor.springcorsserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringcorsserverApplication {

    @GetMapping("/hello")
    //@CrossOrigin(origins = "http://localhost:18080")
    public String hello() {
        return "hello";
    }


    public static void main(String[] args) {
        SpringApplication.run(SpringcorsserverApplication.class, args);
    }


}

