import java.util.ArrayList;
import java.util.Scanner;

public class AdminManager {
    private static final ArrayList<Admin> admins = new ArrayList<>();
    private static final Scanner scanner = new Scanner(System.in);
    private static int adminCounter = 1;

    public static void adminMenu() {
        int choice;
        do {
            System.out.println("\n===== ADMIN MANAGEMENT =====");
            System.out.println("1. Add Admin");
            System.out.println("2. View All Admins");
            System.out.println("0. Back to Main Menu");
            System.out.print("Enter choice: ");
            choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1 -> addAdmin();
                case 2 -> viewAllAdmins();
            }
        } while (choice != 0);
    }

    private static void addAdmin() {
        System.out.println("\n===== ADD NEW ADMIN =====");
        int id = adminCounter++;

        System.out.print("Enter Username: ");
        String username = scanner.nextLine();
        System.out.print("Enter Password: ");
        String password = scanner.nextLine();

        admins.add(new Admin(id, username, password));
        System.out.println("Admin added successfully.");
    }

    private static void viewAllAdmins() {
        if (admins.isEmpty()) {
            System.out.println("No admins found.");
            return;
        }
        for (Admin a : admins) {
            System.out.println(a);
        }
    }
}