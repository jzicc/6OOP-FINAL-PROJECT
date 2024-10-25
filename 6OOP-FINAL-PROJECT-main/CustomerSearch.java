import java.util.ArrayList;

class CustomerSearch {
    private CustomerSandF customerSandF;

    public CustomerSearch(CustomerSandF customerSandF) {
        this.customerSandF = customerSandF;
    }

    public void searchCustomer(String searchTerm, boolean isName) {
        if (isName) {
            searchByName(searchTerm);
        } else {
            searchByContactInfo(searchTerm);
        }
    }

    private void searchByName(String name) {
        if (name.isEmpty()) {
            System.out.println("Name cannot be empty.");
            return;
        }

        ArrayList<Customer> customers = customerSandF.getCustomers();
        boolean found = false;

        for (Customer customer : customers) {
            if (customer.getName().equalsIgnoreCase(name)) {
                System.out.println("Found Customer: Name: " + customer.getName() + ", Contact Info: " + customer.getContactInfo());
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Customer not found with the name: " + name);
        }
    }

    private void searchByContactInfo(String contactInfo) {
        ArrayList<Customer> customers = customerSandF.getCustomers();
        boolean found = false;

        for (Customer customer : customers) {
            if (customer.getContactInfo().equals(contactInfo)) {
                System.out.println("Found Customer: Name: " + customer.getName() + ", Contact Info: " + customer.getContactInfo());
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("No customers found with the contact info: " + contactInfo);
        }
    }
}
