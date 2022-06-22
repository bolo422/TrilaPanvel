package br.com.panvel.modulo8.slides.command;

import br.com.panvel.modulo8.slides.command.commands.DecreaseIntensityCommand;
import br.com.panvel.modulo8.slides.command.commands.IncreaseIntensityCommand;
import br.com.panvel.modulo8.slides.command.commands.OffCommand;
import br.com.panvel.modulo8.slides.command.commands.OnCommand;

public class TestCommand {
    public static void main(String[] args) {

        SmartLight smartLight = new SmartLight("Luz do quarto");
        smartLight.execute(new OnCommand());
        smartLight.execute(new OffCommand());
        smartLight.execute(new IncreaseIntensityCommand());
        smartLight.execute(new DecreaseIntensityCommand());
    }
}
