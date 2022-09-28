package br.com.panvel.modulo8.slides.command.commands;

import br.com.panvel.modulo8.slides.command.SmartLight;

public class OnCommand implements Command{
    @Override
    public void execute(SmartLight light) {
        light.setPower(true);
    }
}
