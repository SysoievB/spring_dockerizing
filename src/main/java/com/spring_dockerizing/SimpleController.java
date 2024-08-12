package com.spring_dockerizing;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class SimpleController {

    @GetMapping
    String hello() {
        return "<h1>Hello from Docker!!!</h1>";
    }
}
