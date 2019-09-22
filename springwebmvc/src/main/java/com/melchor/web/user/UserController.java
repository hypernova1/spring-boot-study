package com.melchor.web.user;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }

    @PostMapping("/users/create")
    public User create(@RequestBody User user) {
        return user;
    }

    @GetMapping("")
    public void error() {
        throw new SampleException();
    }

    @ExceptionHandler(SampleException.class)
    public AppError sampleError(SampleException e) {
        AppError appError = new AppError();
        appError.setMessage("error.app.key");
        appError.setReason("몰라");

        return appError;
    }


}
