import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ContaExemplo conta1 = new ContaExemplo(100);

        ContaExemplo conta2 = new ContaExemplo(200);

        System.out.println( "A conta " +
                            ContaExemplo.ComparaSaldos(conta1,conta2) +
                            " tem o saldo maior!");


/*
        Scanner inputFormularioCadastro = new Scanner(System.in);
        String pais = inputFormularioCadastro.nextLine();


        boolean sucesso = Verificar(pais);

        if(sucesso)
            SalvarEndereço(pais);
        else
            Erro();*/


        Scanner inputCampoDePesquisa = new Scanner(System.in);
        String pais = inputCampoDePesquisa.nextLine();

        boolean sucesso = Verificar(pais);

        if(sucesso)
            PesquisarClientes(pais);
        else
            Erro();



        /*Conta[] contas;
        int nClientes = 10;

        contas = new Conta[nClientes];

        for(int i = 0; i < contas.length; i++ )
        {
            String nomeDoCLiente = "Cliente"+i;
            String cpfDoClient = (i + 100 + "." + (i + 200) + "." + (i + 300) + "-" + (i + 40));

            contas[i] = new Conta(nomeDoCLiente, cpfDoClient, i, i+50);
        }*/



        /*for(int i = 0; i < contas.length; i++ )
        {
            System.out.println("\nTitular: " + contas[i].titular.getNome()
            + "\nCPF: " + contas[i].titular.getCpf()
            + "\nConta: " + contas[i].getConta()
            + "\n|------------------------------|");
        }*/



    }

    static void SalvarEndereço(String pais)
    {}

    static boolean Verificar(String pais)
    {return true;}

    static void Erro(){}

    static void PesquisarClientes(String pais)
    {}
}



