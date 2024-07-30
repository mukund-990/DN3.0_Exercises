public class Main {
    public static void main(String[] args) {
        Product[] products = new Product[] {
            new Product("P001", "Product 1", "Category 1"),
            new Product("P002", "Product 2", "Category 2"),
            new Product("P003", "Product 3", "Category 3"),
            new Product("P004", "Product 4", "Category 4"),
            new Product("P005", "Product 5", "Category 5"),
        };

        java.util.Arrays.sort(products, (a, b) -> a.getProductId().compareTo(b.getProductId()));

        String targetProductId = "P003";
        int linearSearchResult = LinearSearch.search(products, targetProductId);
        if (linearSearchResult != -1) {
            System.out.println("Linear Search: Product found at index " + linearSearchResult);
        } else {
            System.out.println("Linear Search: Product not found");
        }

        int binarySearchResult = BinarySearch.search(products, targetProductId);
        if (binarySearchResult != -1) {
            System.out.println("Binary Search: Product found at index " + binarySearchResult);
        } else {
            System.out.println("Binary Search: Product not found");
        }
    }
}