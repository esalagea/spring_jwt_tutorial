package com.esalagea.tutorial.jwt.controller;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @RequestMapping({"/hello"})
    public String firstPage() {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        return String.format("<h1>Hello. Your authorities are %s ",  auth.getAuthorities()  );
    }
}
