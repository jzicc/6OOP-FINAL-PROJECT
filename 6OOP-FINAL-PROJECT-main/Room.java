class Room {
    protected String roomType;
    protected String accommodates;
    protected int beds;
    protected String bedType;

    public Room(String roomType, String accommodates, int beds, String bedType) {
        this.roomType = roomType;
        this.accommodates = accommodates;
        this.beds = beds;
        this.bedType = bedType;
    }

    public String getRoomType() {
        return roomType;
    }

    public String getAccommodates() {
        return accommodates;
    }

    public int getBeds() {
        return beds;
    }

    public String getBedType() {
        return bedType;
    }

    public String getDescription() {
        return "Room Type: " + roomType + ", Accommodates: " + accommodates +
               ", Beds: " + beds + ", Bed Type: " + bedType + ", Amenities: " + getAmenities();
    }

    public String getAmenities() {
        return "No amenities listed.";
    }
}