package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class H0meController {


    @RequestMapping("Home")
    public String home() {

        System.out.println("Welcome to Home Page");
        return "Home.jsp";
    }
    
}
