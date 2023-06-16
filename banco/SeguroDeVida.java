package aula20.banco;

public class SeguroDeVida implements Tributo{
    double taxa = 42.0;
    private double saldo;

    public double getSaldo() {
        return saldo;
    }

    public void depositarConta(double saldo) {
        this.saldo = saldo;
    }
    public void sacarConta(double saldo){
        this.saldo -= saldo;
    }

    @Override
    public double cauculaTributo() {
        double tributo = taxa / 100;
        double valorTributado = saldo - (tributo * saldo);
        return valorTributado;
    }
}
