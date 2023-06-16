package aula20.formaGeometrica;

public class Quadrado extends Retangulo{




    public Quadrado(float lado, float altura) {
        super(lado, altura);
    }

    public Quadrado() {
    }

    @Override
    public float caucularArea() {
        float area = (getLado() * getLado());
        return area;
    }

    @Override
    public float caucularPerimetro() {
        float perimetro = 4 * (getLado());
        return perimetro;
    }

    @Override
    public String toString() {
        return "Lado do quadrado: " + getLado() + " A área do quadrado é: " + caucularArea() + " e o perímetro do quadrado é: " + caucularPerimetro();
    }
}
