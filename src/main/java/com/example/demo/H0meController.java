package com.example.demo;

import org.springframework.stereotype.Controller;
// import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller // --> This is the Keyword is used to declare the class as a controller.

public class H0meController {


    @RequestMapping("/Home")
    public String home() throws Exception{

        System.out.println("Welcome to Home Page");
        return "Home.jsp";
    }
    
}
