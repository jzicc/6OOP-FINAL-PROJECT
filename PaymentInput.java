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
        System.out.print("Enter payment amount: ");
        int amount = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter payment date: ");
        String paymentDate = scanner.nextLine();
        System.out.print("Enter payment method: ");
        String method = scanner.nextLine();

        payments.add(new Payment(amount, paymentDate, method));
        System.out.println("Payment added.");
    }

    public ArrayList<Payment> getPayments() {
        return payments;
    }
}
