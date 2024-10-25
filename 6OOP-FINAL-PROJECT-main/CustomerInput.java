import java.util.Scanner;

class CustomerInput {
    private Scanner scanner;
    private CustomerSandF customerSandF;

    public CustomerInput(Scanner scanner, CustomerSandF customerSandF) {
        this.scanner = scanner;
        this.customerSandF = customerSandF;
    }

    public void addCustomer() {
        System.out.print("Enter customer name: ");
        String name = scanner.nextLine();
        System.out.print("Enter customer contact info: ");
        String contactInfo = scanner.nextLine();

 
        Customer newCustomer = new Customer(name, contactInfo);
        
  
        customerSandF.getCustomers().add(newCustomer);
        
        System.out.println("Customer added successfully.");
    }
}
