package com.example.cx3;

import org.springframework.stereotype.Component;

@Component
public class Cat  implements Animal{
    @Override
    public void use(){
        System.out.println("This is a cat");
    }
}
