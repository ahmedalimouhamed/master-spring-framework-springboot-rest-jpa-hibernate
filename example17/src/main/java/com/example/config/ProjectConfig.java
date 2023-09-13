package com.example.config;

import com.example.beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan(basePackages = {"com.example.implementation", "com.example.services"})
@ComponentScan(basePackageClasses = {com.example.beans.Vehicle.class, com.example.beans.Person.class})
public class ProjectConfig {

}
