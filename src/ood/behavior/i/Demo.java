package ood.behavior.i;

public class Demo {
    public static void main(String[] args) {
        var collection = new ProductCollection();
        collection.add(new Product(1, "abc"));
        collection.add(new Product(2, "def"));
        collection.add(new Product(3, "ghi"));

        var iterator = collection.createIterator();
        while (iterator.hasNext()) {
            var product = iterator.current();
            System.out.println(product);
            iterator.next();
        }
    }
}
