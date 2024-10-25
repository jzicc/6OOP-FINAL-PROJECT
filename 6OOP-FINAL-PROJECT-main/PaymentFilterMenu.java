import java.util.Scanner;
import java.util.ArrayList;

class PaymentFilterMenu {
    private PaymentInput paymentInput;

    public PaymentFilterMenu(PaymentInput paymentInput) {
        this.paymentInput = paymentInput;
    }

    public void showFilterMenu() {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nPayment Filter Menu");
            System.out.println("1. Filter Payments by Date");
            System.out.println("0. Back to Main Menu");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter payment date to filter (YYYY-MM-DD): ");
                    String date = scanner.nextLine();
                    PaymentFilter paymentFilter = new PaymentFilter(new PaymentSandF(paymentInput.getPayments()));
                    ArrayList<Payment> filteredByDate = paymentFilter.filterPaymentsByDate(date);
                    if (filteredByDate.isEmpty()) {
                        System.out.println("No payments found on date: " + date);
                    } else {
                        for (Payment payment : filteredByDate) {
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
