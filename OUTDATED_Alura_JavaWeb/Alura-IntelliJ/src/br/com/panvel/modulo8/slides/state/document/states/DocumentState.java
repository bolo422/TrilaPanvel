package br.com.panvel.modulo8.slides.state.document.states;

import br.com.panvel.modulo8.slides.state.document.Document;

public interface DocumentState {
    public void publish(Document doc);
    public void render(Document doc);
}
