package br.com.panvel.modulo8.slides.strategy.keys;

import br.com.panvel.modulo8.slides.strategy.Character;

public class Left implements MovementKey{
    @Override
    public void move() {
        Character.x -= 1;
    }
}
