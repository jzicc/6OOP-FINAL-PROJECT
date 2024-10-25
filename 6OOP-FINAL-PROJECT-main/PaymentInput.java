import java.util.ArrayList;
import java.util.Scanner;

class PaymentInput {
    private ArrayList<Payment> payments;
    private Scanner scanner;

    public PaymentInput(Scanner scanner) {
        this.payments = new ArrayList<>();
        this.scanner = scanner;
    }

    public void addPayment() {
        int amount;
        String paymentDate;
        String method;

        while (true) {
            System.out.print("Enter payment amount: ");
            if (scanner.hasNextInt()) {
                amount = scanner.nextInt();
                if (amount > 0) {
                    scanner.nextLine();
                    break;
                } else {
                    System.out.println("Amount must be greater than 0.");
                }
            } else {
                System.out.println("Invalid input. Please enter a valid integer.");
                scanner.nextLine();
            }
        }

        while (true) {
            System.out.print("Enter payment date (YYYY-MM-DD): ");
            paymentDate = scanner.nextLine().trim();
            if (!paymentDate.isEmpty()) {
                break;
            } else {
                System.out.println("Payment date cannot be empty. Please try again.");
            }
        }
        while (true) {
            System.out.print("Enter payment method: ");
            method = scanner.nextLine().trim();
            if (!method.isEmpty()) {
                break;
            } else {
                System.out.println("Payment method cannot be empty. Please try again.");
            }
        }

        payments.add(new Payment(amount, paymentDate, method));
        System.out.println("Payment added.");
    }

    public ArrayList<Payment> getPayments() {
        return payments;
    }
}
