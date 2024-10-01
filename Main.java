import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        CustomerInput customerInput = new CustomerInput(scanner);
        CustomerDisplay customerDisplay = new CustomerDisplay(customerInput);
        ReservationInput reservationInput = new ReservationInput(scanner);
        ReservationDisplay reservationDisplay = new ReservationDisplay(reservationInput);
        RoomInput roomInput = new RoomInput(scanner);
        RoomDisplay roomDisplay = new RoomDisplay(roomInput);
        PaymentInput paymentInput = new PaymentInput(scanner);
        PaymentDisplay paymentDisplay = new PaymentDisplay(paymentInput);
        HotelInput hotelInput = new HotelInput(scanner);
        HotelDisplay hotelDisplay = new HotelDisplay(hotelInput);

        int choice;

        do {
            System.out.println("\nHotel Management System");
            System.out.println("1. Manage Customers");
            System.out.println("2. Manage Reservations");
            System.out.println("3. Manage Rooms");
            System.out.println("4. Manage Payments");
            System.out.println("5. Manage Hotels");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    customerInput.addCustomer();
                    customerDisplay.listCustomers();
                    break;
                case 2:
                    reservationInput.addReservation();
                    reservationDisplay.listReservations();
                    break;
                case 3:
                    roomInput.addRoom();
                    roomDisplay.listRooms();
                    break;
                case 4:
                    paymentInput.addPayment();
                    paymentDisplay.listPayments();
                    break;
                case 5:
                    hotelInput.addHotel();
                    hotelDisplay.listHotels();
                    break;
                case 0:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
                    break;
            }
        } while (choice != 0);

        scanner.close();
    }
}
