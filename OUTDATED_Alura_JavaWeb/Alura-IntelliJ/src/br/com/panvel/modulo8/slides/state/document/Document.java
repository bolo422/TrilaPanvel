package br.com.panvel.modulo8.slides.state.document;

import br.com.panvel.modulo8.slides.state.document.states.DocumentState;
import br.com.panvel.modulo8.slides.state.document.states.Draft;

public class Document {
    private DocumentState state;
    private User currentUser;
    private User author;

    Document(User currentUser, User author)
    {
        this.currentUser = currentUser;
        this.author = author;
        state = new Draft();
    }

    public void publish()
    {
        state.publish(this);
    }

    public void render()
    {
        state.render(this);
    }

    //Getter e Setters ocultados









    public void setCurrentUser(User currentUser) {
        this.currentUser = currentUser;
    }
    public User getCurrentUser() {
        return currentUser;
    }
    public DocumentState getState() {
        return state;
    }
    public void setState(DocumentState state) {
        this.state = state;
    }
    public User getAuthor() {
        return author;
    }
}
