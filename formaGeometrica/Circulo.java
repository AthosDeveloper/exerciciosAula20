package aula20.formaGeometrica;

public class Circulo extends Forma {
   private  float raio;
private float pi = 3.14159265358979323846f;

    public Circulo(float raio) {
        this.raio = raio;
    }

    public float getRaio() {
        return raio;
    }

    public float getPi() {
        return pi;

    }

    @Override
    public float caucularArea() {
     float area = this.getPi() * (this.getRaio() * this.getRaio());
        return area;
    }

    @Override
    public float caucularPerimetro() {
        float perimetro = 2 * this.getPi() * this.getRaio();
        return perimetro;
    }

    @Override
    public String toString() {
        return  "raio: " + getRaio() + "A área do círculo é: " + caucularArea() + " e o perímetro do círculo é: " + caucularPerimetro();

    }
}
