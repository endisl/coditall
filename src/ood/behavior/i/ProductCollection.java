package ood.behavior.i;

import java.util.ArrayList;
import java.util.List;

public class ProductCollection {
    private List<Product> products = new ArrayList<>();

    public void add(Product product) {
        products.add(product);
    }

    /*public void remove() {
        products.remove(products.size() - 1);
    }*/

    public Iterator createIterator() {
        return new ListIterator(this);
    }

    public class ListIterator implements Iterator {
        private ProductCollection collection;
        private int index;

        public ListIterator(ProductCollection collection) {
            this.collection = collection;
        }

        @Override
        public Product current() {
            return collection.products.get(index);
        }

        @Override
        public boolean hasNext() {
            return index < collection.products.size();
        }

        @Override
        public void next() {
            index++;
        }
    }
}
