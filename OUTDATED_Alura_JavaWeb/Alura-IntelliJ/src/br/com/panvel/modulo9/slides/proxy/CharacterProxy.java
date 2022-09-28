package br.com.panvel.modulo9.slides.proxy;

public class CharacterProxy implements CharacterSubject{

    private CharacterRealSubject realSubject;
    private String name;

    CharacterProxy(String name){
        realSubject = new CharacterRealSubject(name);
    }

    @Override
    public String getName() {
        if(name == null)
        {
            name = realSubject.getName();
            new Thread(() -> {
                try {
                    Thread.sleep(60000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                name = null;
            }).start();
        }

        return name;
    }
}
