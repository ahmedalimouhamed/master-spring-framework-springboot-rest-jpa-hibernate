package com.example.beans;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class Vehicle {
    private String name;

    @PostConstruct
    public void initialize(){
        this.name="Honda";
    }

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
