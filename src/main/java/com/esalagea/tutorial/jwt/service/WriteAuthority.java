package com.esalagea.tutorial.jwt.service;

import org.springframework.security.core.GrantedAuthority;

public class WriteAuthority implements GrantedAuthority {

    @Override
    public String getAuthority() {
        return "write";
    }

    public String toString(){
        return getAuthority();
    }

}
