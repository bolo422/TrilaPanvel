class ContaExemplo{

    double saldo;

    public static int ComparaSaldos(ContaExemplo conta1, ContaExemplo conta2)
    {
        if(conta1.saldo == conta2.saldo)
            return 0;

        if(conta1.saldo > conta2.saldo)
            return 1;
        return 2;
    }


    static int contContas = 0;

    ContaExemplo(int saldo){
        contContas++;
        this.saldo = saldo;
    }

    public static int getContContas() {
        return ContaExemplo.contContas;
    }




    /* Atributos e métodos ocultados */











}
