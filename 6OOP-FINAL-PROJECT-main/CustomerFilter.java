import java.util.ArrayList;

class CustomerFilter {
    private CustomerSandF customerSandF;

    public CustomerFilter(CustomerSandF customerSandF) {
        this.customerSandF = customerSandF;
    }

    public void filterCustomersByName(String name) {
        ArrayList<Customer> customers = customerSandF.getCustomers();
        boolean found = false;

        for (Customer customer : customers) {
            if (customer.getName().equalsIgnoreCase(name)) {
                System.out.println("Filtered Customer: Name: " + customer.getName() + ", Contact Info: " + customer.getContactInfo());
                found = true;
            }
        }

        if (!found) {
            System.out.println("No customers found with the name: " + name);
        }
    }
}
