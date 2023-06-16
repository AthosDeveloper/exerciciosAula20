package aula20.banco;

public class ContaPoupanca {
    private double saldo;

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double saldo) {
        this.saldo = saldo;
    }
    public  void  sacar(double saldo){
        this.saldo -= saldo;
    }

}
