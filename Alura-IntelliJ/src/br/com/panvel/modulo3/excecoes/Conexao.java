package br.com.panvel.modulo3.excecoes;

public class Conexao implements AutoCloseable {

    Conexao(){
        System.out.println("Abrindo conexão");
    }

    public void enviarMensagem()
    {
        System.out.println("Enviando mensagem!");
    }

    @Override
    public void close()
    {
        System.out.println("Fechando conexão");
    }
}
