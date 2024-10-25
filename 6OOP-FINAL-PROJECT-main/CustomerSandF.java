import java.util.ArrayList;

class CustomerSandF {
    private ArrayList<Customer> customers;

    public CustomerSandF() {
        customers = new ArrayList<>();
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public void addCustomer(Customer customer) {
        customers.add(customer);
    }
}
