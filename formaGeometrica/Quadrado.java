package aula20.formaGeometrica;

public class Quadrado extends Retangulo{
    @Override
    public float caucularArea() {
        float area = (getLado() * getLado());
        return area;
    }

    @Override
    public float caucularPerimetro() {
        float perimetro = 4 * (getLado();
        return perimetro;
    }
}
