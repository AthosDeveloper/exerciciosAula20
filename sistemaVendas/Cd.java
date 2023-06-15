package aula20.sistemaVendas;

public class Cd extends ShellService{
private int trackNumber;
    @Override
    public void setPrice(double price) {
        super.setPrice(price);
    }

    @Override
    public void setName(String name) {
        super.setName(name);
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
    public String showDetails() {
        return "Cd name: " + getName() + " price: " + getPrice() + "Track number: " + getTrackNumber();
    }

    public void setTrackNumber(int trackNumber) {
        this.trackNumber = trackNumber;
    }

    public int getTrackNumber() {
        return trackNumber;
    }
}
