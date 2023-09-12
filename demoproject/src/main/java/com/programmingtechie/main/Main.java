package com.programmingtechie.main;

import com.programmingtechie.beans.Vehicle;
import com.programmingtechie.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.setName("Honda City");
        System.out.println("Vehicle name from non-string context is : "+ vehicle.getName());

        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Vehicle veh = context.getBean(Vehicle.class);
        System.out.println("Vehicle name from Spring context is : "+veh.getName());

        String hello = context.getBean(String.class);
        System.out.println("String value from spring context is : "+ hello);

        Integer num = context.getBean(Integer.class);
        System.out.println("Integer value from Spring context is : "+num);
    }
}