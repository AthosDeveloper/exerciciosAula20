package aula20.sistemaVendas;

public abstract class ShellService {
    private  String name;
    private double price;
    public abstract  String  showDetails();

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
