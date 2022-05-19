package br.com.panvel.modulo1;

import java.util.Scanner;

public class Tests {


    static void Menu()
    {
        boolean running = true;

        while(running) {
            System.out.println(
                    "Selecione o teste:\n" +
                    "1: Clases\n" +
                    "2: Referencias\n" +
                    "3: Null\n" +
                    "4: Sair"
            );

            Scanner input = new Scanner(System.in);

            try {
                int option = Integer.parseInt(input.nextLine());

                switch (option) {
                    case 1:
                        ;
                        break;

                    case 2:

                        break;

                    case 3:

                        break;

                    case 4:
                        running = false;
                        break;

                    default:
                        System.out.println("Opcao invalida!");
                        break;
                }
            }
            catch (final Exception e)
            {
                System.out.println("Opcao invalida!");
            }
            CLS();
        }
    }

    public static void CLS()
    {
        PAUSE();
        for (int i = 0; i < 20; i++) {
            System.out.print("\n");
        }
    }

    public static void PAUSE()
    {
        System.out.println("\n\nPressione ENTER para continuar.");
        Scanner input = new Scanner(System.in);
        input.nextLine();
    }
}



class PetShop{
    Pet[] pets;

    PetShop()
    {
        pets = new Pet[10];
        for (int i = 0; i < pets.length; i++)
            pets[i] = new Pet("pet " + i, Type.fish, 2);
    }

    public String[] getPetsNames() {
        String[] petsNames = new String[pets.length];
        for (int i = 0; i < pets.length; i++)
        {
            petsNames[i] = pets[i].getName();
        }
        return petsNames;
    }

    public Pet[] getPets() {
        return pets;
    }

    public void RenamePets(String newName)
    {
        for (int i = 0; i < pets.length; i++) {
            pets[i].setName(newName + "-" + i);
        }
    }
}