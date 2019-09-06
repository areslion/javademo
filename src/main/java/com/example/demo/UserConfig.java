package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UserConfig {
    @Bean(name= "user")
    public User initUser(){
        User user = new User();
        user.setAge("37");
        user.setName("肖正龙");
        user.setTel("13888327795");

        return user;
    }
}
