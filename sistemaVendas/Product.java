package aula20.sistemaVendas;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Product {
    private String productCode;
    public Product(String productCode) {
        this.productCode = productCode;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Product product = (Product) o;

        return Objects.equals(productCode, product.productCode);
    }

    public String getProductCode() {
        return productCode;
    }

    @Override
    public String toString() {
        return this.getProductCode();
    }

    @Override
    public int hashCode() {
        return Objects.hash(productCode);
    }
}
