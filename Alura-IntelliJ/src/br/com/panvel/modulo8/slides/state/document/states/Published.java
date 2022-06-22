package br.com.panvel.modulo8.slides.state.document.states;

import br.com.panvel.modulo8.slides.state.document.Document;

public class Published implements DocumentState{
    @Override
    public void publish(Document doc) {
        throw new RuntimeException("Este documento já foi publicado!");
    }

    @Override
    public void render(Document doc) {
            System.out.println("Documento.txt");
    }
}
