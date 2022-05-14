package ood.structure.p;

public class Demo {
    public static void main(String[] args) {
        var dbContext = new DbContext();
        var product = dbContext.getProduct(1);
        product.setName("Updated Name");
        dbContext.markAsChanged(product);
        dbContext.saveChanges();
        product.setName("Another name");
        dbContext.markAsChanged(product);
        dbContext.saveChanges();
    }
}
