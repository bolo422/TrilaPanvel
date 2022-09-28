package br.com.panvel.modulo10.solid.i;

public interface BasicVehicle {
    void startEngine();
    void turnTheWheel();
}

interface VehicleWithDoors extends BasicVehicle{
    void openDoor();
}

class Car implements VehicleWithDoors{
    public void startEngine() {
        System.out.println("Ligando o motor");}

    public void openDoor() {
        System.out.println("Abrindo a porta");}

    public void turnTheWheel() {
        System.out.println("Virando o volante");}
}

class Motorcycle implements BasicVehicle{
    public void startEngine() {
        System.out.println("Ligando o motor");}

    public void turnTheWheel() {
        System.out.println("Virando o volante");}
}