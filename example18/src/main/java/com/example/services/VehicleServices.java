package com.example.services;

import com.example.implementation.SonySpeakers;
import com.example.interfaces.Tyres;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class VehicleServices {
    @Autowired
    private SonySpeakers speakers;
    private Tyres tyres;

    public void playMusic(){
        String music = speakers.makeSound();
        System.out.println(music);
    }

    public void moveVehicle(){
        String status = tyres.rotate();
        System.out.println(status);
    }

    public SonySpeakers getSpeakers(){
        return speakers;
    }

    public void getSpeakers(SonySpeakers speakers){
        this.speakers =  speakers;
    }

    public Tyres getTyres() {
        return tyres;
    }

    @Autowired
    public void setTyres(Tyres tyres) {
        this.tyres = tyres;
    }
}
