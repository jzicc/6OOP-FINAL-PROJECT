import java.util.ArrayList;

class CustomerDisplay {
    private CustomerSandF customerSandF;

    public CustomerDisplay(CustomerSandF customerSandF) {
        this.customerSandF = customerSandF;
    }

    public void listCustomers() {
        ArrayList<Customer> customers = customerSandF.getCustomers();

        if (customers.isEmpty()) {
            System.out.println("No customers found.");
            return;
        }

        System.out.println("List of Customers:");
        for (Customer customer : customers) {
            System.out.println("Name: " + customer.getName() + ", Contact Info: " + customer.getContactInfo());
        }
    }
}
