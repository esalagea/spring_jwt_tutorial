package com.esalagea.tutorial.jwt.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WriteOperationsController {

    @RequestMapping({"/write"})
    public String sayHiToAdmin() {
        return "<h1>Hello. This is a write operation protected by write authority. ";
    }

}
