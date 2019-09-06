package com.example.demo;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UserConfigx {
    @Bean(name="userx")
    public User initUser(){
        User user = new User();

        user.setName("周凌峰");
        return user;
    }
}
