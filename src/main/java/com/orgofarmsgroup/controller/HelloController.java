package com.orgofarmsgroup.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/hello")
@Slf4j
public class HelloController {
    @GetMapping
    public String sayHello() {
        log.info("GET /hello accessed");
        return "Hello World from EC2 Instance Docker Container";
    }

    @GetMapping("/{user}")
    public String sayHelloToUser(@PathVariable String user) {
        log.info("GET /hello/user accessed");
        return "Hello "+ user + " from EC2 Instance Docker Container";
    }
}
