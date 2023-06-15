package aula20.sistemaVendas;

public class Book extends ShellService{

    private String autor;

    public void setAutor(String autor) {
        this.autor = autor;
    }


    public String getAutor() {
        return autor;
    }

    @Override
    public double getPrice() {
        return super.getPrice();
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public void setPrice(double price) {
        super.setPrice(price);
    }

    @Override
    public String showDetails() {
        return "Book name:: " + getName() + "Price: " + getPrice() + " autor: " + getAutor();
    }

}
