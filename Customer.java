class Customer {
    private String name;
    private int contactInfo;

    public Customer(String name, int contactInfo) {
        this.name = name;
        this.contactInfo = contactInfo;
    }

    public String getName() {
        return name;
    }

    public int getContactInfo() {
        return contactInfo;
    }
}