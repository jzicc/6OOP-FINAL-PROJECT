class Hotel {
    private int rooms;
    private boolean reservations;

    public Hotel(int rooms, boolean reservations) {
        this.rooms = rooms;
        this.reservations = reservations;
    }

    public int getRooms() {
        return rooms;
    }

    public boolean isReservations() {
        return reservations;
    }
}