package br.com.panvel.modulo8.slides.state.vendingmachine;

public class VendingMachine {
    private int inventory;
    private double price;
    private String state;

    public VendingMachine(int inventory, double price){
        this.inventory = inventory;
        this.price = price;
        state = "aw";
    }

    public void deposit(double value){

    }


}
