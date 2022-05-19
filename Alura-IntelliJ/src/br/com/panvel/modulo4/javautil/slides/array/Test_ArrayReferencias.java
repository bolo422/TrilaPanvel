package br.com.panvel.modulo4.javautil.slides.array;

public class Test_ArrayReferencias {

    public static void main(String[] args) {

        // array de referências

        //region Exemplo simples
        Cliente[] arrayR;
        arrayR = new Cliente[3];
        arrayR[0] = new Cliente("Erick");
        Cliente c1 = arrayR[0];
        //endregion


        //region Excpetion IndexOutOfBounds
        try {
            System.out.println(arrayR[20].getNome());
        }
        catch (Exception ex)
        {
            System.out.println("CATCH: " + ex);
        }
        //endregion


        //region Demonstração: For com array de referências
        for (int i = 0; i < arrayR.length; i++) {
            arrayR[i] = new Cliente("Cliente " + i);
            System.out.println(arrayR[i].getNome());
        }
        //endregion


        //region Demonstração: diversas referências para 1 objeto
        Cliente[] arrayClientes = new Cliente[7];
        Cliente cliente = new Cliente("Rafael");
        Cliente ref = cliente;
        arrayClientes[4] = cliente;
        arrayClientes[5] = ref;
        arrayClientes[6] = arrayClientes[4];

        System.out.println("O cliente Rafael tem 5 referências, mas apenas 1 instância");

        System.out.println( cliente.getNome() + ", " +
                            ref.getNome() + ", " +
                        arrayClientes[4].getNome() + ", " +
                        arrayClientes[5].getNome()  + ", " +
                        arrayClientes[6].getNome()
                           );

        arrayClientes[4].setNome("Pedro");

        System.out.println( cliente.getNome() + ", " +
                            ref.getNome() + ", " +
                        arrayClientes[4].getNome() + ", " +
                        arrayClientes[5].getNome()  + ", " +
                        arrayClientes[6].getNome()
                          );
        //endregion


        // EXTRA: Declaração Literal
        // Usamos {} e já preenchemos o valor, o tamanho do array é a qtd de elementos
        int[] intArray = {1,2,3};
        Cliente[] clienteArray = {new Cliente("c1"), new Cliente("c2"), cliente};



        //region Testes
        Cliente l = new Cliente("Lucas");
        Cliente[] cls = new Cliente[2];
        cls[0] = l;
        cls[1] = new Cliente("Alb");

        l = new Cliente("XXXXX");
        Cliente ppp = cls[1];
        cls[1] = new Cliente("ZZZZZZZZ");

        System.out.println("Testes:");
        System.out.println("l: " + l.getNome());
        System.out.println("ppp: " + ppp.getNome());
        System.out.println("[0]: " + cls[0].getNome());
        System.out.println("[1]: " + cls[1].getNome());
        //endregion



    }
}
