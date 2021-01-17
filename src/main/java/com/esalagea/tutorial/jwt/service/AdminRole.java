package com.esalagea.tutorial.jwt.service;

import org.springframework.security.core.GrantedAuthority;

public class AdminRole implements GrantedAuthority {
    @Override
    public String getAuthority() {
        return "ROLE_admin";
    }

    @Override
    public String toString() {
        return getAuthority();
    }
}
