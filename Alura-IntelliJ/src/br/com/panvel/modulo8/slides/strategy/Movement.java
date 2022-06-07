package br.com.panvel.modulo8.slides.strategy;

import br.com.panvel.modulo8.slides.strategy.keys.MovementKey;
import br.com.panvel.modulo8.slides.strategy.keys.Up;

public class Movement {
    public void move(MovementKey input) {
        input.move();
    }
}
