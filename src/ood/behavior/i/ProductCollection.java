package ood.behavior.i;

import java.util.ArrayList;
import java.util.List;

public class ProductCollection {
    private List<Product> products = new ArrayList<>();

    public void add(Product product) {
        products.add(product);
    }

    public void remove(Product product) {
        products.remove(product);
    }

    public class ListIterator implements Iterator {

        @Override
        public Product current() {
            return null;
        }

        @Override
        public boolean hasNext() {
            return false;
        }

        @Override
        public void next() {

        }
    }
}
