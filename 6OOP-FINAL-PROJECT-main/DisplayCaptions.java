public class DisplayCaptions {
    public static void showMainMenu() {
        System.out.println("\nHotel Management System");
        System.out.println("1. Manage Customers");
        System.out.println("2. View Customers");
        System.out.println("3. Manage Hotels");
        System.out.println("4. View Hotels");
        System.out.println("5. Manage Payments");
        System.out.println("6. View Payments");
        System.out.println("7. Manage Rooms");
        System.out.println("8. View Rooms");
        System.out.println("9. Manage Reservations");
        System.out.println("10. View Reservations");
        System.out.println("11. Search Customers");
        System.out.println("12. Filter Customers");
        System.out.println("13. Search Payments");
        System.out.println("14. Filter Payments");
        System.out.println("0. Exit");
    }

    public static void invalidChoice() {
        System.out.println("Invalid choice. Please enter a number between 0 and 14.");
    }

    public static void invalidInput() {
        System.out.println("Invalid input. Please enter a number.");
    }

    public static void exitMessage() {
        System.out.println("Exiting...");
    }
}
