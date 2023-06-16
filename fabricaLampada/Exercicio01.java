package aula20.fabricaLampada;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Fluorescente f = new Fluorescente();
        Encandescente e  = new Encandescente();
        System.out.println("informe o tipo de lâmpada que você deseja construir: ");
        String resposta = sc.nextLine();
        if (resposta.equals("fluorescente")){
            f.construirLampada(f);
            f.ligarLampada();
            f.desligarLampada();
        } else  if (resposta.equals("encandescente")){
            e.construirLampada(e);
            e.ligarLampada();
            e.desligarLampada();
        }
    }
}
