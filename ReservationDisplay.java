import java.util.Scanner;

class ReservationDisplay {
    private ReservationInput reservationInput;

    public ReservationDisplay(ReservationInput reservationInput) {
        this.reservationInput = reservationInput;
    }

    public void listReservations() {
        for (Reservation reservation : reservationInput.getReservations()) {
            System.out.println("Reservation for: " + reservation.getCustomer() +
                               ", Room: " + reservation.getRoom() +
                               ", Check-in: " + reservation.getCheckInDate() +
                               ", Check-out: " + reservation.getCheckOutDate());
        }
    }

    public void updateReservation() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter reservation index to update: ");
        int index = scanner.nextInt();
        scanner.nextLine();
        if (index >= 0 && index < reservationInput.getReservations().size()) {
            System.out.print("Enter new room type: ");
            String newRoom = scanner.nextLine();
            System.out.print("Enter new check-in date: ");
            String newCheckInDate = scanner.nextLine();
            System.out.print("Enter new check-out date: ");
            String newCheckOutDate = scanner.nextLine();

            reservationInput.getReservations().set(index, new Reservation(reservationInput.getReservations().get(index).getCustomer(), newRoom, newCheckInDate, newCheckOutDate));
            System.out.println("Reservation updated.");
        } else {
            System.out.println("Invalid reservation index.");
        }scanner.close();
    }

    public void deleteReservation() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter reservation index to delete: ");
        int index = scanner.nextInt();
        scanner.nextLine();
        if (index >= 0 && index < reservationInput.getReservations().size()) {
            reservationInput.getReservations().remove(index);
            System.out.println("Reservation removed.");
        } else {
            System.out.println("Invalid reservation index.");
        }scanner.close();
    }
}