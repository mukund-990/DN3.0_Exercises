public class Main {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();

        Product product1 = new Product("P001", "Product 1", 100, 10.99);
        Product product2 = new Product("P002", "Product 2", 50, 5.99);

        inventory.addProduct(product1);
        inventory.addProduct(product2);

        Product updatedProduct1 = new Product("P001", "Updated Product 1", 150, 11.99);
        inventory.updateProduct("P001", updatedProduct1);

        inventory.deleteProduct("P002");

        Product retrievedProduct = inventory.getProduct("P001");
        System.out.println("Product ID: " + retrievedProduct.getProductId());
        System.out.println("Product Name: " + retrievedProduct.getProductName());
        System.out.println("Quantity: " + retrievedProduct.getQuantity());
        System.out.println("Price: " + retrievedProduct.getPrice());
    }
}