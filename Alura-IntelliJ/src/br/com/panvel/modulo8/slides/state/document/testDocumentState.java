package br.com.panvel.modulo8.slides.state.document;

public class testDocumentState {
    public static void main(String[] args) {
        User erick = new User("default");
        User admin = new User("admin");
        User rafael = new User("default");

        Document document = new Document(erick, erick);

        document.publish();

        //document.setCurrentUser(rafael);
        //document.render();

        document.setCurrentUser(admin);

        document.publish();

        document.setCurrentUser(erick);
        document.render();

    }
}


