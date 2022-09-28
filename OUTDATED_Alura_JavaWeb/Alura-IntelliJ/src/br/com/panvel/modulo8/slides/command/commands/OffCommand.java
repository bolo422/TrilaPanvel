package br.com.panvel.modulo8.slides.command.commands;

import br.com.panvel.modulo8.slides.command.SmartLight;

public class OffCommand implements Command{
    @Override
    public void execute(SmartLight light) {
        light.setPower(false);
    }
}
