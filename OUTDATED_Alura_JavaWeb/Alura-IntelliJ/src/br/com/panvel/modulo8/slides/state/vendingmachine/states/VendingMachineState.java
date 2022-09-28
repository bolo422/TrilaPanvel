package br.com.panvel.modulo8.slides.state.vendingmachine.states;

import br.com.panvel.modulo8.slides.state.vendingmachine.VendingMachine;

public abstract class VendingMachineState {

    public abstract void buy(double deposit, VendingMachine vm);
}
