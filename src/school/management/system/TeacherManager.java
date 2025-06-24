import java.util.ArrayList;
import java.util.Scanner;

public class TeacherManager {
    private static final ArrayList<Teacher> teachers = new ArrayList<>();
    private static final Scanner scanner = new Scanner(System.in);
    private static int teacherCounter = 1;

    public static void teacherMenu() {
        int choice;
        do {
            System.out.println("\n===== TEACHER MANAGEMENT =====");
            System.out.println("1. Add Teacher");
            System.out.println("2. View All Teachers");
            System.out.println("0. Back to Main Menu");
            System.out.print("Enter choice: ");
            choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1 -> addTeacher();
                case 2 -> viewAllTeachers();
            }
        } while (choice != 0);
    }

    private static void addTeacher() {
        System.out.println("\n===== ADD NEW TEACHER =====");
        int id = teacherCounter++;

        System.out.print("Enter First Name: ");
        String firstName = scanner.nextLine();
        System.out.print("Enter Last Name: ");
        String lastName = scanner.nextLine();

        teachers.add(new Teacher(id, firstName, lastName));
        System.out.println("Teacher added successfully.");
    }

    private static void viewAllTeachers() {
        if (teachers.isEmpty()) {
            System.out.println("No teachers found.");
            return;
        }
        for (Teacher t : teachers) {
            System.out.println(t);
        }
    }
}