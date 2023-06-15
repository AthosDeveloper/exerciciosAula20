package aula20.sistemaVendas;

public class Dvds extends ShellService{
    private int dvdLenght;
    @Override
    public double getPrice() {
        return super.getPrice();
    }

    @Override
    public String getName() {
        return super.getName();
    }

    public int getDvdLenght() {
        return dvdLenght;
    }

    public void setDvdLenght(int dvdLenght) {
        this.dvdLenght = dvdLenght;
    }

    @Override
    public String showDetails() {
        return "Dvd name: " + getName() + " Price: " + getPrice() + " Dvd lenght: " + getDvdLenght();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

}
