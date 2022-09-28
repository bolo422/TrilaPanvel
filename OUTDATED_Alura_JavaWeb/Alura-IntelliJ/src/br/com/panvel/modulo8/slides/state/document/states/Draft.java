package br.com.panvel.modulo8.slides.state.document.states;

import br.com.panvel.modulo8.slides.state.document.Document;

public class Draft implements DocumentState{
    @Override
    public void publish(Document doc) {
        doc.setState(new Moderation());
    }

    @Override
    public void render(Document doc) {
        if(doc.getCurrentUser().getRole().equals("admin") ||
                doc.getCurrentUser() == doc.getAuthor())
            System.out.println("Documento.txt");
        else
            throw new RuntimeException("Sem permissão");
    }
}
