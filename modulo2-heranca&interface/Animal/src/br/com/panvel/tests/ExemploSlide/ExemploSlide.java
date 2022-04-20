package br.com.panvel.tests.ExemploSlide;


abstract class Funcionario
{
    private double salario;

    protected String identificacao = "funcionario";

    Funcionario(double salario)
    {
        this.salario = salario;
    }

    public double getSalario()
    {
        return salario;
    }

    public void Aumento(int aumento)
    {
        salario+=aumento;
    }
}

class Gerente extends Funcionario
{
    Gerente(double salario)
    {
        super(salario);
    }

    @Override
    public void Aumento(int aumento)
    {
        aumento*=2;
        super.Aumento(aumento);
    }
}

class Vendedor extends Funcionario
{
    private String identificacao = "vendedor";

    Vendedor(double salario)
    {
        super(salario);
    }

    public String getIdentificacaoV() {
        return identificacao;
    }

    public String getIdentificacaoF() {
        return super.identificacao;
    }
}






/*class Gerente
{
    private double salario;
    Gerente(double salario)
    {
        this.salario = salario;
    }

    public double getSalario()
    {
        return salario;
    }
}

class Vendedor
{
    private double salario;
    Vendedor(double salario)
    {
        this.salario = salario;
    }

    public double getSalario()
    {
        return salario;
    }
}*/





/*
abstract class Funcionario
{
    public abstract double getSalario();

    public void Identificar()
    {
        System.out.println("Sou um funcionario!");
    }
}

class Gerente extends Funcionario
{

    @Override
    public void Identificar()
    {
        System.out.println("Sou um gerente!");
    }

    //Overload
    public void Identificar(String nome)
    {
        System.out.println("Meu nome é " + nome);
    }



    @Override
    public double getSalario()
    {
        return 5000;
    }

}*/



class ExemploSlide {

    public static void main(String[] args) {

        Vendedor v = new Vendedor(1);

        System.out.println(v.getIdentificacaoF());
        System.out.println(v.getIdentificacaoV());


/*        Funcionario func = new Vendedor();
        func.Salario();

        func = new Gerente();
        func.Salario();

        Funcionario f = new Gerente();
        System.out.println("R$ " + f.getSalario());
        f.Identificar();*/





    }
}




