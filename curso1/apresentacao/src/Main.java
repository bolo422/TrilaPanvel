import java.util.List;

public class Main {

    public static void main(String[] args) {

        // Basic class tests:
        // Instantiate, Constructor, Methods, Return, Static Method

        Pet blackCat = new Pet("Black Cat", Type.cat, 5 ,new Owner("Erick", "SL"));
        Pet goldLabrador = new Pet("Duque", Type.dog, 3 ,new Owner("Erick", "SL"));

        String winner = Pet.Race(blackCat, goldLabrador).getName();

        System.out.println("The winner pet is: " + winner);



        // Reference VS Object

        // Reference:
        Pet copyCat = blackCat;

        blackCat.setName("Patrick");

        System.out.println(copyCat.getName()); // Will print "Patrick", because copyCat is just a reference to blackCat

        // Object with same atributes:
        Pet differentCat = new Pet(blackCat);

        blackCat.setName("Raphael");

        System.out.println(differentCat.getName()); /* Will print "Patrick", because the last change to blackCat don't
                                                       affect differentCat, since it's a new object with just the same
                                                       atributes values. */


        // Null usage
        // Erick want to adopt every pet with no owner

        Pet petArray[] = new Pet[50];

        for (int i = 0; i < 50; i++) {
            if((double)i%2 == 0)
                petArray[i] = new Pet(Type.cat, 3);
            else
                petArray[i] = new Pet(Type.cat, 3, new Owner());
        }
        // criar owner Erick
        // printar todos os pets sem dono
        // adicionar erick ao dono dos pets
        // printar denovo
    }
}