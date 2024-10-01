class Reservation {
    private String customer;
    private String room;
    private String checkInDate;
    private String checkOutDate;

    public Reservation(String customer, String room, String checkInDate, String checkOutDate) {
        this.customer = customer;
        this.room = room;
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
    }

    public String getCustomer() {
        return customer;
    }

    public String getRoom() {
        return room;
    }

    public String getCheckInDate() {
        return checkInDate;
    }

    public String getCheckOutDate() {
        return checkOutDate;
    }
}
