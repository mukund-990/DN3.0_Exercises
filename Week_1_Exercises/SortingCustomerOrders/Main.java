public class Main {
    public static void main(String[] args) {
        Order[] orders = new Order[] {
            new Order("O001", "Customer 1", 100.0),
            new Order("O002", "Customer 2", 50.0),
            new Order("O003", "Customer 3", 200.0),
            new Order("O004", "Customer 4", 150.0),
            new Order("O005", "Customer 5", 300.0),
        };

        System.out.println("Unsorted Orders:");
        printOrders(orders);

        BubbleSort.sort(orders);

        System.out.println("Sorted Orders (Bubble Sort):");
        printOrders(orders);

        Order[] orders2 = new Order[] {
            new Order("O001", "Customer 1", 100.0),
            new Order("O002", "Customer 2", 50.0),
            new Order("O003", "Customer 3", 200.0),
            new Order("O004", "Customer 4", 150.0),
            new Order("O005", "Customer 5", 300.0),
        };

        QuickSort.sort(orders2);

        System.out.println("Sorted Orders (Quick Sort):");
        printOrders(orders2);
    }

    public static void printOrders(Order[] orders) {
        for (Order order : orders) {
            System.out.println("Order ID: " + order.getOrderId() + ", Customer Name: " + order.getCustomerName() + ", Total Price: " + order.getTotalPrice());
        }
    }
}