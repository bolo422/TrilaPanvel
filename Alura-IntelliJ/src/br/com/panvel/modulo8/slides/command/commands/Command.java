package br.com.panvel.modulo8.slides.command.commands;

import br.com.panvel.modulo8.slides.command.SmartLight;

public interface Command {
    public void execute(SmartLight light);
}
