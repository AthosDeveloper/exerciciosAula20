package aula20.banco;

public class TesteBanco {
    public static void main(String[] args) {
SeguroDeVida s = new SeguroDeVida();
s.depositarConta(1515.33);
        System.out.println(s.getSaldo());
        s.sacarConta(15.0);
        System.out.println(s.getSaldo());
        System.out.println(s.cauculaTributo());
        ContaCorrente cc = new ContaCorrente();
    cc.depositarConta((151.93);
        System.out.println(cc.getSaldo());
        cc.sacarConta(33);
        System.out.println(cc.getSaldo());
        System.out.println(cc.cauculaTributo());
    }
}

