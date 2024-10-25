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
        int rooms;
        boolean reservations;

        while (true) {
            System.out.print("Enter number of room: ");
            if (scanner.hasNextInt()) {
                rooms = scanner.nextInt();
                if (rooms > 0) {
                    scanner.nextLine();
                    break;
                } else {
                    System.out.println("Number of room must be greater than 0.");
                }
            } else {
                System.out.println("Invalid input. Please enter a valid integer.");
                scanner.nextLine();
            }
        }

        while (true) {
            System.out.print("Is reservation available? ");
            if (scanner.hasNextBoolean()) {
                reservations = scanner.nextBoolean();
                scanner.nextLine();
                break;
            } else {
                System.out.println("Invalid input.");
                scanner.nextLine();
            }
        }

        hotels.add(new Hotel(rooms, reservations));
        System.out.println("Hotel added.");
    }

    public ArrayList<Hotel> getHotels() {
        return hotels;
    }
}
