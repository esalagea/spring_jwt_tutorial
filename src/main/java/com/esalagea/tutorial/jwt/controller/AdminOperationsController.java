package com.esalagea.tutorial.jwt.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdminOperationsController {

    @RequestMapping({"/admin_only_operation"})
    public String sayHiToAdmin() {
        return "<h1>Hello. This is an admin operation protected by admin role. ";
    }

}
