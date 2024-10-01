import java.util.ArrayList;
import java.util.Scanner;

class HotelInput {
    private ArrayList<Hotel> hotels;
    private Scanner scanner;

    public HotelInput(Scanner scanner) {
        this.hotels = new ArrayList<>();
        this.scanner = scanner;
    }

    public void addHotel() {
        System.out.print("Enter number of rooms: ");
        int rooms = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Is reservation available (true/false): ");
        boolean reservations = scanner.nextBoolean();
        scanner.nextLine();

        hotels.add(new Hotel(rooms, reservations));
        System.out.println("Hotel added.");
    }

    public ArrayList<Hotel> getHotels() {
        return hotels;
    }
}
