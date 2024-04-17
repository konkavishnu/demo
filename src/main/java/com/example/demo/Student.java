package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component  // ---> We are defining to spring that this class is a bean or defining that from this class
            // ---> I want the object.   
public class Student {

    private String name;
    private int aid ;
    private String tech;
    @Autowired // --> This the keyword that connects the class -laptop with the class -student.
    @Qualifier("LAP1")  //--> by using the @Qualifier we can specify the name of the bean or class that we want to use.
    private Laptop laptop;
    
    public Laptop getLaptop() {
        return laptop;
    }
    public void setLaptop(Laptop laptop) {
        this.laptop = laptop;
    }
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
        System.out.println("running the display method");
        laptop.Compiler();
    }

    
}
