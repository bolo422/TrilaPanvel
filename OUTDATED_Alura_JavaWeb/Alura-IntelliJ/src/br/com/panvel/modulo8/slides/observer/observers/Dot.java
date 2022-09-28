package br.com.panvel.modulo8.slides.observer.observers;

public class Dot implements Observer{
    int value = 50;

    @Override
    public void update() {
        value *= 2;
        System.out.println("Dot: now I worth double!");
    }
}
