class Deluxe extends Room implements IRoom {
    public Deluxe(String accommodates, int beds, String bedType) {
        super("Deluxe Room", accommodates, beds, bedType);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " (Deluxe Room)";
    }

    @Override
    public String getAmenities() {
        return "Luxury amenities like Wi-Fi, TV, and mini-bar";
    }
}