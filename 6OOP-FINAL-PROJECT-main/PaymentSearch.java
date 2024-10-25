import java.util.ArrayList;

class PaymentSearch {
    private PaymentSandF paymentSandF;

    public PaymentSearch(PaymentSandF paymentSandF) {
        this.paymentSandF = paymentSandF;
    }

    public void searchPaymentByAmount(int amount) {
        ArrayList<Payment> payments = paymentSandF.getPayments();
        boolean found = false;

        for (Payment payment : payments) {
            if (payment.getAmount() == amount) {
                System.out.println("Found Payment of Amount: " + payment.getAmount() + 
                                   ", Date: " + payment.getPaymentDate() + 
                                   ", Method: " + payment.getMethod());
                found = true;
            }
        }

        if (!found) {
            System.out.println("No payments found with the specified amount.");
        }
    }

    public ArrayList<Payment> getPaymentsByMethod(String method) {
        ArrayList<Payment> filteredPayments = new ArrayList<>();
        for (Payment payment : paymentSandF.getPayments()) {
            if (payment.getMethod().equalsIgnoreCase(method)) {
                filteredPayments.add(payment);
            }
        }
        return filteredPayments;
    }
}
