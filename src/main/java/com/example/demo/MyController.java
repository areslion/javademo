package com.example.demo;

import com.example.cx3.Animal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/home")
public class MyController {
//    @Autowired
//    Animal dog;


    @RequestMapping(value = "first",method = RequestMethod.GET)
    public String getData(HttpServletRequest request){
//        dog.use();

        return"hello,world!";
    }
}
