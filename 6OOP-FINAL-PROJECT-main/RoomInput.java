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
        int choice;
        String accommodates;
        int beds;
        String bedType;

        System.out.println("Select room type to add:");
        System.out.println("1. Single Room");
        System.out.println("2. Double Room");
        System.out.println("3. Deluxe Room");
        System.out.println("4. Suite Room");
        System.out.println("5. Presidential Suite Room");

        while (true) {
            System.out.print("Enter your choice: ");
            if (scanner.hasNextInt()) {
                choice = scanner.nextInt();
                scanner.nextLine();
                if (choice >= 1 && choice <= 5) {
                    break;
                } else {
                    System.out.println("Invalid choice. Please select a number between 1 and 5.");
                }
            } else {
                System.out.println("Invalid input. Please enter a valid integer.");
                scanner.nextLine();
            }
        }

        while (true) {
            System.out.print("Enter accommodates: ");
            accommodates = scanner.nextLine().trim();
            if (!accommodates.isEmpty()) {
                break;
            } else {
                System.out.println("Accommodates cannot be empty. Please try again.");
            }
        }

        while (true) {
            System.out.print("Enter number of beds: ");
            if (scanner.hasNextInt()) {
                beds = scanner.nextInt();
                if (beds > 0) {
                    scanner.nextLine();
                    break;
                } else {
                    System.out.println("Number of beds must be greater than 0.");
                }
            } else {
                System.out.println("Invalid input. Please enter a valid integer.");
                scanner.nextLine();
            }
        }

        while (true) {
            System.out.print("Enter bed type: ");
            bedType = scanner.nextLine().trim();
            if (!bedType.isEmpty()) {
                break;
            } else {
                System.out.println("Bed type cannot be empty. Please try again.");
            }
        }

        Room room = null;

        switch (choice) {
            case 1:
                room = new Standard(accommodates, beds, bedType);
                break;
            case 2:
                room = new Double(accommodates, beds, bedType);
                break;
            case 3:
                room = new Deluxe(accommodates, beds, bedType);
                break;
            case 4:
                room = new Suite(accommodates, beds, bedType);
                break;
            case 5:
                room = new PresidentialSuite(accommodates, beds, bedType);
                break;
            default:
                System.out.println("Invalid choice. Room not added.");
                return;
        }

        rooms.add(room);
        System.out.println("Room added: " + room.getDescription());
    }

    public ArrayList<Room> getRooms() {
        return rooms;
    }
}