package aula20.formaGeometrica;

public class Retangulo extends Forma{
    private float lado;
    private float altura;

    @Override
    public float caucularArea() {
        float area = this.getLado() * this.getAltura();
        return area;
    }

    @Override
    public float caucularPerimetro() {
        float perimetro = 2 * (this.getLado()) + this.getAltura();
        return perimetro;
    }

    public float getAltura() {
        return altura;
    }

    public float getLado() {
        return lado;
    }
}
