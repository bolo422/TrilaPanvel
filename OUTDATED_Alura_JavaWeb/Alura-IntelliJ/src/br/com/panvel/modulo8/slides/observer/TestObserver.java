package br.com.panvel.modulo8.slides.observer;

import br.com.panvel.modulo8.slides.observer.observers.Ghost;
import br.com.panvel.modulo8.slides.observer.observers.Dot;

import java.util.HashSet;
import java.util.Set;

public class TestObserver {
    public static void main(String[] args) {
        Set<Ghost> ghosts = new HashSet<>();
        Set<Dot> dots = new HashSet<>();

        for (int i = 0; i < 3; i++) {
            ghosts.add(new Ghost());
            dots.add(new Dot());
        }

        Pacman pacman = new Pacman();


        ghosts.forEach(pacman::subscribe);
        dots.forEach(pacman::subscribe);
        System.out.println("------\n>>> Ghosts and Dots subscribed!");

        pacman.powerPellet();

        dots.forEach(pacman::unsubscribe);
        System.out.println("------\n>>> Dots unsubscribed!");

        pacman.powerPellet();
    }
}
