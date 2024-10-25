import java.util.Scanner;
import java.util.ArrayList;

class PaymentSearchMenu {
    private PaymentInput paymentInput;

    public PaymentSearchMenu(PaymentInput paymentInput) {
        this.paymentInput = paymentInput;
    }

    public void showSearchMenu() {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nPayment Search Menu");
            System.out.println("1. Search Payments by Amount");
            System.out.println("2. Search Payments by Method");
            System.out.println("0. Back to Main Menu");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter payment amount to search: ");
                    int amount = scanner.nextInt();
                    PaymentSearch paymentSearch = new PaymentSearch(new PaymentSandF(paymentInput.getPayments()));
                    paymentSearch.searchPaymentByAmount(amount);
                    break;
                case 2:
                    System.out.print("Enter payment method to search: ");
                    String method = scanner.nextLine();
                    PaymentSearch paymentSearchMethod = new PaymentSearch(new PaymentSandF(paymentInput.getPayments()));
                    ArrayList<Payment> filteredByMethod = paymentSearchMethod.getPaymentsByMethod(method);
                    if (filteredByMethod.isEmpty()) {
                        System.out.println("No payments found with method: " + method);
                    } else {
                        for (Payment payment : filteredByMethod) {
                            System.out.println("Filtered Payment - Amount: " + payment.getAmount() + 
                                               ", Date: " + payment.getPaymentDate() + 
                                               ", Method: " + payment.getMethod());
                        }
                    }
                    break;
                case 0:
                    System.out.println("Returning to Main Menu...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 0);
        scanner.close();
    }
}
