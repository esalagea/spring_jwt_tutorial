package com.esalagea.tutorial.jwt.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class JwtUserDetailsService implements UserDetailsService {

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        if ("basic_user".equals(username)) {
            return new User("basic_user", "$2a$10$Euvk2Nw.Oc0F0gNWxOyDe.uEXwvwiwFDSBYwsRLAIQlrxI9XaxF6G",
                    getAuthorities("basic"));
        } else if ("admin_user".equals(username)) {
            return new User("admin_user", "$2a$10$Euvk2Nw.Oc0F0gNWxOyDe.uEXwvwiwFDSBYwsRLAIQlrxI9XaxF6G",
                    getAuthorities("admin"));
        }  else if ("write_user".equals(username)) {
            // write_user is not admin but has write authority
            return new User("write_user", "$2a$10$Euvk2Nw.Oc0F0gNWxOyDe.uEXwvwiwFDSBYwsRLAIQlrxI9XaxF6G",
                    Arrays.asList(new WriteAuthority()));
        }
        else {
            throw new UsernameNotFoundException("User not found with username: " + username);
        }
    }

    private Collection<? extends GrantedAuthority> getAuthorities(String role){
        if ("admin".equals(role)){
            return Arrays.asList(new WriteAuthority(), new AdminRole());
        }
        return Arrays.asList();
    }


}
