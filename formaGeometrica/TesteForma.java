package aula20.formaGeometrica;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TesteForma {
    public static void main(String[] args) {
        Forma q = new Quadrado(4.0f, 5.9f);
        Forma c = new Circulo(5.5f);
        Forma r = new Retangulo(5.0f, 8.5f);
        List<Forma> formatos = new ArrayList<>();
        formatos.add(r);
        formatos.add(q);
        formatos.add(c);
        formatos.add(q);
        formatos.add(c);
        Collections.shuffle(formatos);
        for (Forma formato: formatos){
            System.out.println(formato);
        }
    }
}
