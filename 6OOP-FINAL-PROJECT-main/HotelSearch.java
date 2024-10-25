import java.util.ArrayList;
import java.util.Scanner;

class HotelSearch extends HotelInput {
    public HotelSearch(Scanner scanner) {
        super(scanner);
    }

    public void searchHotelByRoomCount(int roomCount) {
        ArrayList<Hotel> hotels = getHotels();
        boolean found = false;

        for (Hotel hotel : hotels) {
            if (hotel.getRooms() == roomCount) {
                System.out.println("Found Hotel with " + roomCount + " rooms.");
                found = true;
            }
        }

        if (!found) {
            System.out.println("No hotels found with the specified number of rooms.");
        }
    }

    public void filterHotelsByReservationAvailability(boolean availability) {
        ArrayList<Hotel> hotels = getHotels();
        boolean found = false;

        for (Hotel hotel : hotels) {
            if (hotel.isReservations() == availability) {
                System.out.println("Found Hotel with reservation availability: " + availability);
                found = true;
            }
        }

        if (!found) {
            System.out.println("No hotels found with the specified reservation availability.");
        }
    }
}
