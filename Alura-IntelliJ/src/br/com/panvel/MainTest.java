package br.com.panvel;

public class MainTest {
    public static void main(String[] args) {
        Pessoa p = new Pessoa("jade");
        Pessoa ref = p;

        ref.nome = "xx";

        System.out.println(p.nome);


        /*String nome = "Jade";
        addSobrenome(nome);
        System.out.println(nome);

        Inteiro i = new Inteiro(5);
        add(i);
        System.out.println(i.i);*/
    }



    static void addSobrenome(String nome){
        nome = nome + " Santos";
    }

    static void add(Inteiro inteiro)
    {
        inteiro.i = inteiro.i+1;
    }
}

class Inteiro{
    int i;
    Inteiro(int _i){i = _i;}
}

class Pessoa{
    String nome;
    Pessoa(String n){nome = n;}
}

