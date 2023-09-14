package com.example.main;

import com.example.beans.Person;
import com.example.config.ProjectConfig;
import com.example.services.VehicleServices;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        System.out.println("Before retriving the person bean from spring context");
        Person person = context.getBean(Person.class);
        System.out.println("After retrieving the person bean from the spring context");

    }
}