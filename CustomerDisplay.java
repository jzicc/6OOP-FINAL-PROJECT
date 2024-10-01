class CustomerDisplay {
    private CustomerInput customerInput;

    public CustomerDisplay(CustomerInput customerInput) {
        this.customerInput = customerInput;
    }

    public void listCustomers() {
        if (customerInput.getCustomers().isEmpty()) {
            System.out.println("No customers found.");
        } else {
            for (Customer customer : customerInput.getCustomers()) {
                System.out.println("Customer: " + customer.getName() + ", Contact: " + customer.getContactInfo());
            }
        }
    }
}
