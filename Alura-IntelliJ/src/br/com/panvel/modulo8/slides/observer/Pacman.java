package br.com.panvel.modulo8.slides.observer;

import br.com.panvel.modulo8.slides.observer.observers.Observer;

import java.util.HashSet;
import java.util.Set;

public class Pacman {

    Set<Observer> observers;
    private boolean invencible = false;

    Pacman(){ observers = new HashSet<>(); }

    public void powerPellet() {
        invencible = true;
        notifyObservers();
    }

    public void subscribe(Observer observer) { observers.add(observer); }
    public void unsubscribe(Observer observer) { observers.remove(observer); }
    public void notifyObservers(){ observers.forEach(Observer::update);}
}
