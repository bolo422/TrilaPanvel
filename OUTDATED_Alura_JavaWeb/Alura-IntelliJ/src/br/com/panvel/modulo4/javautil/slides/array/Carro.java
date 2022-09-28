package br.com.panvel.modulo4.javautil.slides.array;

public class Carro implements Comparable<Carro>{

    //region Implementação da classe omitida
    private double velocidade;
    public Carro(double velocidade)
    {this.velocidade = velocidade;}

    public double getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }
    //endregion

    @Override
    public int compareTo(Carro o) {

        return Double.compare(this.velocidade, o.velocidade);
    }
}
