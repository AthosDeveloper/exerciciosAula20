package aula20.fabricaLampada;

public class Encandescente  extends FabricaLampada implements Lampada {
  String encandescente = "encandescente";
    @Override
    public void ligarLampada() {
        System.out.println("a lâmpada " + encandescente + " está ligada.");
    }

    @Override
    public void desligarLampada() {
        System.out.println("a lâmpada " + encandescente + " está desligada.");
    }

    @Override
    public String toString() {
        return "A lâmpada encandescente foi construída...";
    }
}
