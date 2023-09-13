package com.example.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Person {

    private String name = "Lucy";
    private Vehicle vehicle;

    @Autowired
    public Person(@Qualifier("vehicle2") Vehicle vehicle1) {
        System.out.println("Person bean created by spring");
        this.vehicle = vehicle1;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    //@Autowired
    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
}
