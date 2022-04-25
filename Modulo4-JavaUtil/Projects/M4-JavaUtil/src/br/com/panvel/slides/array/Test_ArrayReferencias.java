package br.com.panvel.slides.array;

public class Test_ArrayReferencias {

    public static void main(String[] args) {

        // array de referências
        Cliente c = new Cliente("Erick");

        Cliente[] arrayR;
        arrayR = new Cliente[10];

        try {
            System.out.println(arrayR[0].getNome());
        }
        catch (Exception ex)
        {
            System.out.println("CATCH: " + ex.getMessage());
        }

        arrayR[0] = c;
        System.out.println(arrayR[0].getNome());

        for (int i = 0; i < arrayR.length; i++) {
            arrayR[i] = new Cliente("Cliente " + i);
            System.out.println(arrayR[i].getNome());
        }



        Cliente cliente = new Cliente("Rafael");
        Cliente ref = cliente;
        arrayR[4] = cliente;
        arrayR[5] = ref;
        arrayR[6] = arrayR[4];

        System.out.println("O cliente Rafael tem 5 referências, mas apenas 1 instância");

        System.out.println( cliente.getNome() + ", " +
                            ref.getNome() + ", " +
                            arrayR[4].getNome() + ", " +
                            arrayR[5].getNome()  + ", " +
                            arrayR[6].getNome()
                           );

        cliente.setNome("Pedro");
        System.out.println( cliente.getNome() + ", " +
                            ref.getNome() + ", " +
                            arrayR[4].getNome() + ", " +
                            arrayR[5].getNome()  + ", " +
                            arrayR[6].getNome()
                          );


        // EXTRA: Declaração Literal
        // Usamos {} e já preenchemos o valor, o tamanho do array é a qtd de elementos
        int[] intArray = {1,2,3};
        Cliente[] clienteArray = {new Cliente("c1"), new Cliente("c2"), cliente, c};
    }
}
