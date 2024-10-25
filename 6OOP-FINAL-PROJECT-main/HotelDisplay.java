class HotelDisplay {
    private HotelInput hotelInput;

    public HotelDisplay(HotelInput hotelInput) {
        this.hotelInput = hotelInput;
    }

    public void listHotels() {
        if (hotelInput.getHotels().isEmpty()) {
            System.out.println("No hotels found.");
        } else {
            for (Hotel hotel : hotelInput.getHotels()) {
                System.out.println("Hotel with rooms: " + hotel.getRooms() +
                                   ", Reservations available: " + hotel.isReservations());
            }
        }
    }
}
