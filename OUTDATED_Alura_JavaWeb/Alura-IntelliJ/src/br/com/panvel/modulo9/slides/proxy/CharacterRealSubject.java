package br.com.panvel.modulo9.slides.proxy;

public class CharacterRealSubject implements CharacterSubject{
    private String name;
    CharacterRealSubject(String name){this.name = name;}

    @Override
    public String getName() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return name;
    }
}
