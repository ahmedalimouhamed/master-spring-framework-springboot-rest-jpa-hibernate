package com.programmingtechie.config;

import com.programmingtechie.beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {
    @Bean
    Vehicle vehicle(){
        var veh = new Vehicle();
        veh.setName("audi 8");
        return veh;
    }

    @Bean
    String hello(){
        return "Hello world";
    }

    @Bean
    Integer number(){
        return 16;
    }
}
