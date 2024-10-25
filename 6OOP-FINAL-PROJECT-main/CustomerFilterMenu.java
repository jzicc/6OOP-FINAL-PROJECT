import java.util.Scanner;

class CustomerFilterMenu {
    private CustomerFilter customerFilter;
    private Scanner scanner;

    public CustomerFilterMenu(CustomerFilter customerFilter, Scanner scanner) {
        this.customerFilter = customerFilter;
        this.scanner = scanner;
    }

    public void showFilterMenu() {
        System.out.print("Enter name to filter customers: ");
        String name = scanner.nextLine();
        customerFilter.filterCustomersByName(name);
    }
}
