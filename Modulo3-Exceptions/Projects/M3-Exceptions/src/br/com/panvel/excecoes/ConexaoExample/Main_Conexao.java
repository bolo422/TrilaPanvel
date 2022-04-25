package br.com.panvel.excecoes.ConexaoExample;

public class Main_Conexao {

    public static void main(String[] args) {
        System.out.println("Inicio do Main");
        try (Conexao conexao = new Conexao())
        {
            System.out.println("Inicio do Try");
            conexao.enviarMensagem();
            System.out.println("Fim do Try");
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
        finally {
            System.out.println("Finally");
        }
        System.out.println("Fim do Main");
    }
}
