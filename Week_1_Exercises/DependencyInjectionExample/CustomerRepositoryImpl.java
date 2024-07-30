import java.util.*;
public class CustomerRepositoryImpl implements CustomerRepository {
    private Map<Integer, Customer> customers = new HashMap<>();

    public CustomerRepositoryImpl() {
        customers.put(1, new Customer(1, "Mukund kumar jha"));
        customers.put(2, new Customer(2, "Mukund kumar jha"));
    }

    @Override
    public Customer findCustomerById(int id) {
        return customers.get(id);
    }
}