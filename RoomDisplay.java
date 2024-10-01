class RoomDisplay {
    private RoomInput roomInput;

    public RoomDisplay(RoomInput roomInput) {
        this.roomInput = roomInput;
    }

    public void listRooms() {
        if (roomInput.getRooms().isEmpty()) {
            System.out.println("No rooms found.");
        } else {
            for (Room room : roomInput.getRooms()) {
                System.out.println("Room Type: " + room.getRoomType() +
                                   ", Amenities: " + room.getAmenities() +
                                   ", Accommodates: " + room.getAccommodates() +
                                   ", Beds: " + room.getBeds() +
                                   ", Bed Type: " + room.getBedType());
            }
        }
    }
}
