package br.com.panvel.modulo8.slides.command.commands;

import br.com.panvel.modulo8.slides.command.SmartLight;

public class IncreaseIntensityCommand implements Command{
    @Override
    public void execute(SmartLight light) {
        if(light.getIntensity() < 100)
            light.setIntensity(light.getIntensity()+1);
    }
}
