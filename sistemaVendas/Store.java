package aula20.sistemaVendas;

import java.util.ArrayList;
import java.util.List;

public class Store {
    public static void main(String[] args) {
        Book book = new Book();
book.setName("o auquimista");
        book.setAutor("Paulo Coelho");
        book.setPrice(39.563);
        System.out.println(book.showDetails());
Book book2 = new Book();

        book2.setAutor("J.k Rowling");
        book2.setName("Harry Potter e a ordem da fênix");
        book2.setPrice(57.44);
        System.out.println(book2.showDetails());
Book book3 = new Book();

    book3.setName("O senhor dos anéis");
    book3.setPrice(42.563);
    book3.setAutor("j.r.r Touquien");
Cd cd = new Cd();
cd.setName("Renato Russo");
cd.setPrice(13.563);
cd.setTrackNumber(15);
        System.out.println(cd.showDetails());
        Dvds dvd = new Dvds();
dvd.setName("Duro de matar");
dvd.setPrice(56.343);
dvd.setDvdLenght(1.30);
        System.out.println(dvd.showDetails());
    }
}
