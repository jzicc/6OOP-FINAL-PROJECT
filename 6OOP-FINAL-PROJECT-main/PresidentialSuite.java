class PresidentialSuite extends Room implements IRoom {
    public PresidentialSuite(String accommodates, int beds, String bedType) {
        super("Presidential Suite Room", accommodates, beds, bedType);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " (Presidential Suite Room)";
    }

    @Override
    public String getAmenities() {
        return "Exclusive amenities like personal concierge and spa access";
    }
}