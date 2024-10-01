class PaymentDisplay {
    private PaymentInput paymentInput;

    public PaymentDisplay(PaymentInput paymentInput) {
        this.paymentInput = paymentInput;
    }

    public void listPayments() {
        if (paymentInput.getPayments().isEmpty()) {
            System.out.println("No payments found.");
        } else {
            for (Payment payment : paymentInput.getPayments()) {
                System.out.println("Amount: " + payment.getAmount() +
                                   ", Date: " + payment.getPaymentDate() +
                                   ", Method: " + payment.getMethod());
            }
        }
    }
}
