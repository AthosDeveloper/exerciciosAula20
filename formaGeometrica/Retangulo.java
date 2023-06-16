package aula20.formaGeometrica;

public class Retangulo extends Forma{
    private float lado;
    private float altura;
public Retangulo(float lado, float altura){
    this.lado = lado;
    this.altura = altura;
}
public  Retangulo(){
    super();
}
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

    @Override
    public String toString() {
        return " Lado do retângulo: " + getLado() + " Altura do Retângulo é: " + getAltura() + " A área do retângulo é: " + caucularArea() + " e o perímetro do Retângulo é: " + caucularPerimetro();
}

    public float getAltura() {
        return altura;
    }

    public float getLado() {
        return lado;
    }
}
