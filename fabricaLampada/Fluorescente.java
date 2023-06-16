package aula20.fabricaLampada;

public class Fluorescente extends FabricaLampada implements Lampada {
String fluorescente = "florescente";

    @Override
    public String toString() {
return  fluorescente;
    }

    @Override
    public void ligarLampada() {
        System.out.println("a Lâmpada " + fluorescente + " está agora ligada");
    }

    @Override
    public void desligarLampada() {
        System.out.println("a lâmpada " + fluorescente + " está agora desligada.");
    }

}

