class Room {
    private String roomType;
    private String amenities;
    private String accommodates;
    private int beds;
    private String bedType;

    public Room(String roomType, String amenities, String accommodates, int beds, String bedType) {
        this.roomType = roomType;
        this.amenities = amenities;
        this.accommodates = accommodates;
        this.beds = beds;
        this.bedType = bedType;
    }

    public String getRoomType() {
        return roomType;
    }

    public String getAmenities() {
        return amenities;
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
}