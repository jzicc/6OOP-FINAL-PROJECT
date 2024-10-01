import java.util.ArrayList;
import java.util.Scanner;

class RoomInput {
    private ArrayList<Room> rooms;
    private Scanner scanner;

    public RoomInput(Scanner scanner) {
        this.rooms = new ArrayList<>();
        this.scanner = scanner;
    }

    public void addRoom() {
        System.out.print("Enter room type: ");
        String roomType = scanner.nextLine();
        System.out.print("Enter amenities: ");
        String amenities = scanner.nextLine();
        System.out.print("Enter accommodates: ");
        String accommodates = scanner.nextLine();
        System.out.print("Enter number of beds: ");
        int beds = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter bed type: ");
        String bedType = scanner.nextLine();

        rooms.add(new Room(roomType, amenities, accommodates, beds, bedType));
        System.out.println("Room added: " + roomType);
    }

    public ArrayList<Room> getRooms() {
        return rooms;
    }
}
