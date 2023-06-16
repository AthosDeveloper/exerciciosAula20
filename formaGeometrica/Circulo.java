package aula20.formaGeometrica;

public class Circulo extends Forma {
   private  float raio;
private float pi = Math.PI;

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
}
