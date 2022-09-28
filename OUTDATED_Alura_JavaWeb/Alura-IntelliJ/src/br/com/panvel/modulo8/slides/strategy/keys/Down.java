package br.com.panvel.modulo8.slides.strategy.keys;

import br.com.panvel.modulo8.slides.strategy.Character;

public class Down implements MovementKey{
    @Override
    public void move() {
        Character.y -= 1;
    }
}
