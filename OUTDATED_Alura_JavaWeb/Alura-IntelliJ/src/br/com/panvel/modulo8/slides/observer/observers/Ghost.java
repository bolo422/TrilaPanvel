package br.com.panvel.modulo8.slides.observer.observers;

public class Ghost implements Observer{

    private boolean canBeDestroyed = false;

    @Override
    public void update() {
        canBeDestroyed = true;
        System.out.println("Ghost: now I can be destroyed!");
    }
}
