package com.tongia.controller;

import com.tongia.services.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    private HelloService service;

    @RequestMapping(method = RequestMethod.GET, path = "/hello")
    public String sayHello() {
        return service.greetingService();
    }
}
