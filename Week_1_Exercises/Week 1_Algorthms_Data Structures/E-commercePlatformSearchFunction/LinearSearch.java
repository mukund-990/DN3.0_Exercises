public class LinearSearch {
    public static int search(Product[] products, String targetProductId) {
        for (int i = 0; i < products.length; i++) {
            if (products[i].getProductId().equals(targetProductId)) {
                return i; 
            }
        }
        return -1; 
    }
}