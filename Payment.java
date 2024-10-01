class Payment {
    private int amount;
    private String paymentDate;
    private String method;

    public Payment(int amount, String paymentDate, String method) {
        this.amount = amount;
        this.paymentDate = paymentDate;
        this.method = method;
    }

    public int getAmount() {
        return amount;
    }

    public String getPaymentDate() {
        return paymentDate;
    }

    public String getMethod() {
        return method;
    }
}