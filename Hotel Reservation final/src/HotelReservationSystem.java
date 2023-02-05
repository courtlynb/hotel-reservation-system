import api.ReservationResource;
import java.util.Scanner;

public class HotelReservationSystem {
    static final ReservationResource reserve = ReservationResource.getInstance();
    public static void printHeader() {
        System.out.println("*----------------------------------*");
        System.out.println("        Welcome to our Hotel");
    }

    private static void exitMenu() {
        System.out.println("*----------------------------------*");
        System.out.println("Hope to see you soon!");
        System.out.println("*----------------------------------*");
    }

    private static void createAccount() {
        Scanner create = new Scanner(System.in);
        System.out.println("Enter first name: ");
        String firstName = create.nextLine();

        System.out.println("Enter last name: ");
        String lastName = create.nextLine();

        System.out.println("Enter email: ");
        String email = create.nextLine();

        ReservationResource.createACustomer(email, firstName, lastName);
        System.out.println("Account created!");
        create.close();
    }
    public static void main(String[] args) {
        HotelReservationSystem menu = new HotelReservationSystem();
        printHeader();
        printMenu();
    }
    public static void printMenu() {
        Scanner scanner = new Scanner(System.in);

            System.out.println("*----------------------------------*\n" +
                "1. Create an account\n" +
                "2. Find and Reserve a room\n" +
                "3. See My Reservations\n" +
                "4. Admin\n" +
                "5. Exit\n" +
                "*----------------------------------*\n");
    }
}

