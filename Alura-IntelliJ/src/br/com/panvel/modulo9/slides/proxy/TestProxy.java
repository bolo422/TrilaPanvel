package br.com.panvel.modulo9.slides.proxy;

public class TestProxy {
    public static void main(String[] args) {
        CharacterProxy character = new CharacterProxy("Erick");

        System.out.println(character.getName());
        System.out.println(character.getName());
        System.out.println(character.getName());
        System.out.println(character.getName());
    }
}
