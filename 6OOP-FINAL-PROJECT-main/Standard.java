public class Standard extends Room implements IRoom {
    public Standard(String accommodates, int beds, String bedType) {
        super("Single Room", accommodates, beds, bedType);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " (Single Room)";
    }

    @Override
    public String getAmenities() {
        return "Basic amenities like Wi-Fi, TV";
    }
}