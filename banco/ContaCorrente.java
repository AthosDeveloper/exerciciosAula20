package aula20.banco;

public class ContaCorrente implements Tributo{
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
        double tributo = 1.0 / 100;
        double valorTributado = saldo - (tributo * saldo);
        return valorTributado;

    }
}
