import java.util.ArrayList;
import java.util.Scanner;

class CustomerInput {
    private ArrayList<Customer> customers;
    private Scanner scanner;

    public CustomerInput(Scanner scanner) {
        this.customers = new ArrayList<>();
        this.scanner = scanner;
    }

    public void addCustomer() {
        System.out.print("Enter customer name: ");
        String name = scanner.nextLine();
        System.out.print("Enter contact info (integer): ");
        int contactInfo = scanner.nextInt();
        scanner.nextLine();

        customers.add(new Customer(name, contactInfo));
        System.out.println("Customer added.");
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }
}