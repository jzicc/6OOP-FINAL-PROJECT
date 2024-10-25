import java.util.ArrayList;
import java.util.Scanner;

class RoomSearch extends RoomInput {
    public RoomSearch(Scanner scanner) {
        super(scanner);
    }

    public void filterRoomsByBedCount(int bedCount) {
        ArrayList<Room> rooms = getRooms();
        boolean found = false;

        for (Room room : rooms) {
            if (room.getBeds() == bedCount) {
                System.out.println("Found Room: " + room.getDescription());
                found = true;
            }
        }

        if (!found) {
            System.out.println("No rooms found with the specified bed count.");
        }
    }
}
