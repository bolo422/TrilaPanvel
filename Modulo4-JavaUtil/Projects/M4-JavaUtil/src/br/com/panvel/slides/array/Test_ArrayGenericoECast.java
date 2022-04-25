package br.com.panvel.slides.array;

public class Test_ArrayGenericoECast {

    public static void main(String[] args) {

        Object[] array = new Object[20];
        array[0] = new Cliente("Erick");
        array[1] = new Carro(5);

        // array[0].getNome();
        // array[1].getVelocidade();

        Cliente refCliente = (Cliente)array[0];
        System.out.println(refCliente.getNome());

        try {
            Carro refCarro = (Carro)array[0];
            System.out.println(refCarro.getVelocidade());
        }
        catch (Exception ex)
        {
            System.out.println("CATCH: " + ex);
        }


        array[0] = new Carro(2);

        Carro refCarro = (Carro)array[0];
        System.out.println(refCarro.getVelocidade());


    }
}
