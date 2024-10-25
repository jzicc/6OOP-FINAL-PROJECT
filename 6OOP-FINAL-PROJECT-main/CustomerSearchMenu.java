import java.util.Scanner;

class CustomerSearchMenu {
    private CustomerSearch customerSearch;
    private Scanner scanner;

    public CustomerSearchMenu(CustomerSearch customerSearch, Scanner scanner) {
        this.customerSearch = customerSearch;
        this.scanner = scanner;
    }

    public void showSearchMenu() {
        System.out.print("Do you want to search by \n(1) Name \n(2) Contact Info? \n");
        int choice = scanner.nextInt();
        scanner.nextLine();

        if (choice == 1) {
            System.out.print("Enter customer name: ");
            String name = scanner.nextLine();
            customerSearch.searchCustomer(name, true);
        } else if (choice == 2) {
            System.out.print("Enter contact info: ");
            String contactInfo = scanner.nextLine();
            customerSearch.searchCustomer(contactInfo, false);
        } else {
            System.out.println("Invalid choice.");
        }
    }
}
