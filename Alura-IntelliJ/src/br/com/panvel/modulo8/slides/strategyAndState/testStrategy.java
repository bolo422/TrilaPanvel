package br.com.panvel.modulo8.slides.strategyAndState;

import br.com.panvel.modulo8.slides.strategyAndState.keys.Up;

public class testStrategy {
    public static void main(String[] args) {

        Movement movement = new Movement();
        movement.move(new Up());
    }
}


