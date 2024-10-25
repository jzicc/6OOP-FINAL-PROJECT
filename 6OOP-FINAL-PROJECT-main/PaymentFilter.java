import java.util.ArrayList;

class PaymentFilter {
    private PaymentSandF paymentSandF;

    public PaymentFilter(PaymentSandF paymentSandF) {
        this.paymentSandF = paymentSandF;
    }

    public ArrayList<Payment> filterPaymentsByDate(String date) {
        ArrayList<Payment> filteredPayments = new ArrayList<>();
        for (Payment payment : paymentSandF.getPayments()) {
            if (payment.getPaymentDate().equals(date)) {
                filteredPayments.add(payment);
            }
        }
        return filteredPayments;
    }
}
