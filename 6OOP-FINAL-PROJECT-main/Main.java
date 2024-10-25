import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        CustomerSandF customerSandF = new CustomerSandF(); 
        CustomerInput customerInput = new CustomerInput(scanner, customerSandF); 
        HotelInput hotelInput = new HotelInput(scanner);
        PaymentInput paymentInput = new PaymentInput(scanner);
        RoomInput roomInput = new RoomInput(scanner);
        ReservationInput reservationInput = new ReservationInput(scanner);
        CustomerSearch customerSearch = new CustomerSearch(customerSandF);
        CustomerFilter customerFilter = new CustomerFilter(customerSandF);
        PaymentSearchMenu paymentSearchMenu = new PaymentSearchMenu(paymentInput);
        PaymentFilterMenu paymentFilterMenu = new PaymentFilterMenu(paymentInput);
        CustomerSearchMenu customerSearchMenu = new CustomerSearchMenu(customerSearch, scanner);
        CustomerFilterMenu customerFilterMenu = new CustomerFilterMenu(customerFilter, scanner);
        CustomerDisplay customerDisplay = new CustomerDisplay(customerSandF); 
        HotelDisplay hotelDisplay = new HotelDisplay(hotelInput);
        PaymentDisplay paymentDisplay = new PaymentDisplay(paymentInput);
        RoomDisplay roomDisplay = new RoomDisplay(roomInput);
        ReservationDisplay reservationDisplay = new ReservationDisplay(reservationInput);


        int choice;

        do {
            DisplayCaptions.showMainMenu();  

            choice = -1;
            boolean validChoice = false;

            do {
                System.out.print("Enter your choice: ");
                try {
                    choice = scanner.nextInt();
                    scanner.nextLine();

                    if (choice >= 0 && choice <= 14) {
                        validChoice = true;
                    } else {
                        DisplayCaptions.invalidChoice();  
                    }
                } catch (InputMismatchException e) {
                    DisplayCaptions.invalidInput();  
                    scanner.nextLine(); 
                }
            } while (!validChoice);

            switch (choice) {
                case 1:
                    customerInput.addCustomer();
                    break;
                case 2:
                    customerDisplay.listCustomers(); 
                    break;
                case 3:
                    hotelInput.addHotel();
                    break;
                case 4:
                    hotelDisplay.listHotels();
                    break;
                case 5:
                    paymentInput.addPayment();
                    break;
                case 6:
                    paymentDisplay.listPayments();
                    break;
                case 7:
                    roomInput.addRoom();
                    break;
                case 8:
                    roomDisplay.listRooms();
                    break;
                case 9:
                    reservationInput.addReservation();
                    break;
                case 10:
                    reservationDisplay.listReservations();
                    break;
                case 11:
                    customerSearchMenu.showSearchMenu();
                    break;
                case 12:
                    customerFilterMenu.showFilterMenu();
                    break;
                case 13:
                    paymentSearchMenu.showSearchMenu();
                    break;
                case 14:
                    paymentFilterMenu.showFilterMenu();
                    break;
                case 0:
                    DisplayCaptions.exitMessage();  
                    break;
                default:
                    DisplayCaptions.invalidChoice();  
                    break;
            }
        } while (choice != 0);

        scanner.close();
    }
}
