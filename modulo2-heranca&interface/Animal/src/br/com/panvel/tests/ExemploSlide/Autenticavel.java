package br.com.panvel.tests.ExemploSlide;

interface Autenticavel {

    default boolean Autenticar(String senha)
    {
        if(senha == "adm123")
            return true;
        else
            return false;
    }

    static void MensagemBoasVindas(String nome)
    {
        System.out.println("Bem vindo " + nome);
    }
}


class Gerente implements Autenticavel{

}

class Diretor implements Autenticavel{

    @Override
    public boolean Autenticar(String senha)
    {
        if(senha == "dir123")
            return true;
        else
            return false;
    }
}


class InterfaceTest {

    public static void main(String[] args) {

        Gerente g = new Gerente();

        boolean bool = g.Autenticar("adm123");
        System.out.println(bool);

        Autenticavel.MensagemBoasVindas("Erick");


    }
}


