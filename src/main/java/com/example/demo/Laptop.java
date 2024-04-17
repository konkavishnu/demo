package com.example.demo;

import org.springframework.stereotype.Component;

@Component("LAP1") // the name we can give so that the spring container will create a bean or class
public class Laptop {
    private int ID ;
    private String brand;
    public int getID() {
        return ID;
    }
    public void setID(int iD) {
        ID = iD;
    }
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    @Override
    public String toString() {
        return "Laptop [ID=" + ID + ", brand=" + brand + "]";
    }

    public void Compiler() {
        System.out.println("Compiling");
    }
    
}
