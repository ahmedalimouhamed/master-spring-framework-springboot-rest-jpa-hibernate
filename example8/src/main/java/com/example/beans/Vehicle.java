package com.example.beans;

import org.springframework.stereotype.Component;


public class Vehicle {
    private String name;

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public void printHello(){
        System.out.println("Printing from component vehicle bean");
    }
}
