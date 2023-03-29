package com.orgofarmsgroup.controller;

import jakarta.servlet.http.HttpServletRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/hello")
@Slf4j
public class HelloController {
    @GetMapping
    public String sayHello(HttpServletRequest request) {
        log.info("GET /hello accessed");
        log.info("Client IP: " + request.getRemoteAddr());
        return "Hello World from EC2 Instance Docker Container";
    }

    @GetMapping("/{user}")
    public String sayHelloToUser(@PathVariable String user, HttpServletRequest request) {
        log.info("GET /hello/user accessed");
        log.info("Client IP: " + request.getRemoteAddr());
        return "Hello "+ user + " from EC2 Instance Docker Container";
    }
}
