package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MyView {
    @RequestMapping(value = "/demo",method = RequestMethod.GET)
    public String demo(){
        return "demo";
    }
}
