package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.security.PermitAll;

@RestController
@PermitAll
public class TestController {

    @GetMapping(path = "/hello500")
    public String hello500() {
        throw new IllegalStateException();
    }

}
