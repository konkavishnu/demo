package com.example.demo;

import org.springframework.stereotype.Component;

@Component  // ---> We are defining to spring that this class is a bean or defining that from this class
            // ---> I want the object.   
public class Student {

    private String name;
    private int aid ;
    private String tech;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAid() {
        return aid;
    }
    public void setAid(int aid) {
        this.aid = aid;
    }
    public String getTech() {
        return tech;
    }
    public void setTech(String tech) {
        this.tech = tech;
    }

    public void display() {
        System.out.println("Name: " + name);
    }

    
}
