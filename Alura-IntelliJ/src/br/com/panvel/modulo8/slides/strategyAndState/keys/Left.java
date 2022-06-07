package br.com.panvel.modulo8.slides.strategyAndState.keys;

import br.com.panvel.modulo8.slides.strategyAndState.Character;

public class Left implements MovementKey{
    @Override
    public void move() {
        Character.x -= 1;
    }
}
