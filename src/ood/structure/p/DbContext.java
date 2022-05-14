package ood.structure.p;

import java.util.HashMap;
import java.util.Map;

public class DbContext {
    private Map<Integer, Product> updatetdObjects = new HashMap<>();

    public Product getProduct(int id) {
        System.out.printf("SELECT * FROM products WHERE product_id = %d \n", id);

        //simulate reading from db
        var product = new ProductProxy(id, this);
        product.setName("Product 1");

        return product;
    }

    public void saveChanges() {
        for (var updatedObject: updatetdObjects.values())
            System.out.printf("UPDATE products SET name = '%s' WHERE product_id = %d \n", updatedObject.getName(), updatedObject.getId());
        updatetdObjects.clear();
    }

    public void markAsChanged(Product product) {
        updatetdObjects.put(product.getId(), product);
    }
}
