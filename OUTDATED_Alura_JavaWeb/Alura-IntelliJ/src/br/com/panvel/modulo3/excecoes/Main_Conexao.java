package br.com.panvel.modulo3.excecoes;

public class Main_Conexao {

    public static void main(String[] args) {
        System.out.println("Inicio do Main");
        try (Conexao conexao = new Conexao()) {
            System.out.println("Inicio do Try");
            conexao.enviarMensagem();
            int a = 5/0; // conexao.close()
            System.out.println("Fim do Try");
        } // conexao.close()
        catch (Exception ex) {
            System.out.println(ex);
        } finally {
            System.out.println("Finally");
        }

        System.out.println("Fim do Main");

    }
}
