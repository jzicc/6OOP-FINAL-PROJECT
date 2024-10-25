class Suite extends Room implements IRoom {
    public Suite(String accommodates, int beds, String bedType) {
        super("Suite Room", accommodates, beds, bedType);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " (Suite Room)";
    }

    @Override
    public String getAmenities() {
        return "Luxury amenities plus additional living space";
    }
}