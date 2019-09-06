package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.security.PublicKey;

@Configuration
public class UserConfigWyb {
    @Bean(name = "userWyb")
    public User initUser(){
        User user = new User();
        user.setName("王跃波");
        return user;
    }
}
