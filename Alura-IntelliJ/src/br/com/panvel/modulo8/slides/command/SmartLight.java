package br.com.panvel.modulo8.slides.command;

import br.com.panvel.modulo8.slides.command.commands.Command;

import java.util.ArrayList;
import java.util.List;

public class SmartLight {
    private boolean power;
    private int intensity;
    private String name;

    public SmartLight(String name) {
        this.power = false;
        this.intensity = 50;
        this.name = name;
    }

    public void execute(Command command)
    {
        command.execute(this);
    }

    public String getName() {
        return name;
    }

    public int getIntensity() {
        return intensity;
    }

    public boolean getPower(){
        return power;
    }

    public void setPower(boolean power) {
        this.power = power;
    }

    public void setIntensity(int intensity) {
        this.intensity = intensity;
    }
}

