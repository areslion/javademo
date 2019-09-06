package com.example.cx3;

import org.springframework.stereotype.Component;

@Component
public class Dog implements Animal {
    @Override
    public void use(){
        System.out.println("Thiis is a dog");
    }
}
