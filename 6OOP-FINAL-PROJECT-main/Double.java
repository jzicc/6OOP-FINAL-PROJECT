public class Double extends Room implements IRoom {
    public Double(String accommodates, int beds, String bedType) {
        super("Double Room", accommodates, beds, bedType);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " (Double Room)";
    }

    @Override
    public String getAmenities() {
        return "Basic amenities like Wi-Fi, TV";
    }
}