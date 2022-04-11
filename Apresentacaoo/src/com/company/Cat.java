package com.company;

public class Cat extends Pet {

    // Herança
    //
   /* que classe mãe é chamada de super ou base class
    que a classe filha também é chamada de sub class
    como aumentar a visibilidade de um membro (atributo, método) através do protected
    como acessar ou chamar um membro (atributo, método) através do super
    como redefinir um método através da sobrescrita*/

    public double getSpeed() {
        return super.getSpeed() * 2;
    }
}
