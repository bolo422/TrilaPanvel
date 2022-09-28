package br.com.panvel.modulo8.slides.command.commands;

import br.com.panvel.modulo8.slides.command.SmartLight;

public class DecreaseIntensityCommand implements Command{
    @Override
    public void execute(SmartLight light) {
        if(light.getIntensity() > 0)
            light.setIntensity(light.getIntensity()-1);
    }
}
