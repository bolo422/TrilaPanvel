package br.com.panvel.modulo8.slides.strategy;

import br.com.panvel.modulo8.slides.strategy.keys.Up;

public class testStrategy {
    public static void main(String[] args) {

        Movement movement = new Movement();
        movement.move(new Up());
    }
}


