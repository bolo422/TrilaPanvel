public class Conta{

    private double saldo;
    private int agencia; //em um cenario real, seria String?
    private int conta; // em um cenario real, seria String?
    private Cliente titular;
    private static int totalDeContas;


    Conta(Cliente titular, int agencia, int conta)
    {
        totalDeContas++;
        this.titular = titular;
        setAgencia(agencia);
        setConta(conta);
    }

    Conta(String nomeDoTitular, String cpfDoTitular, int agencia, int conta)
    {
        this(new Cliente(nomeDoTitular,cpfDoTitular),
        agencia, conta);
    }

    Conta(Conta conta)
    {
        this(conta.titular, conta.agencia, conta.conta);
    }




    public void depositar(double valor)
    {
        saldo += valor;
    }

    public boolean sacar(double valor)
    {
        if(saldo >= valor) {
            saldo -= valor;
            return true;
        }

        return false;
    }

    public boolean transferir(double valor, Conta destino)
    {
        if(saldo>=valor && destino!=null) //separar para tratar erros? ou separar na tratativa?
        {
            saldo-=valor;
            destino.depositar(valor); //usar método novo de "Receber transferência?"
            return true;
        }

        return false;
    }



    public double getSaldo() {
        return saldo;
    }



    public int getConta() {
        return conta;
    }

    public void setConta(int conta) {
        if(conta <= 0)
        {
            System.out.println("A conta não pode ser negativa!");
            return;
        }
        this.conta = conta;
    }



    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public void setTitular(String nomeDoTitular, String cpfDoTitular) {
        this.titular = new Cliente(nomeDoTitular, cpfDoTitular);
    }



    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        if(agencia <= 0)
        {
            System.out.println("A agencia não pode ser negativa!");
            return;
        }
        this.agencia = agencia;
    }

    public static int getTotalDeContas() {
        return Conta.totalDeContas;
    }
}
