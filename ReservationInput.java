import java.util.ArrayList;
import java.util.Scanner;

class ReservationInput {
    private ArrayList<Reservation> reservations;
    private Scanner scanner;

    public ReservationInput(Scanner scanner) {
        this.reservations = new ArrayList<>();
        this.scanner = scanner;
    }

    public void addReservation() {
        System.out.print("Enter customer name: ");
        String customer = scanner.nextLine();
        System.out.print("Enter room type: ");
        String room = scanner.nextLine();
        System.out.print("Enter check-in date: ");
        String checkInDate = scanner.nextLine();
        System.out.print("Enter check-out date: ");
        String checkOutDate = scanner.nextLine();

        reservations.add(new Reservation(customer, room, checkInDate, checkOutDate));
        System.out.println("Reservation added.");
    }

    public ArrayList<Reservation> getReservations() {
        return reservations;
    }
}
