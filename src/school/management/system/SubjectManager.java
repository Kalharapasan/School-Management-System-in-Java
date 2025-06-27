import java.util.ArrayList;
import java.util.Scanner;

public class SubjectManager {
    private static final ArrayList<Subject> subjects = new ArrayList<>();
    private static final Scanner scanner = new Scanner(System.in);

    public static void subjectMenu() {
        int choice;
        do {
            System.out.println("\n===== SUBJECT MANAGEMENT =====");
            System.out.println("1. Add Subject");
            System.out.println("2. View All Subjects");
            System.out.println("0. Back to Main Menu");
            System.out.print("Enter choice: ");
            choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1 -> addSubject();
                case 2 -> viewAllSubjects();
            }
        } while (choice != 0);
    }

    private static void addSubject() {
        System.out.print("Enter Subject Code: ");
        String code = scanner.nextLine();
        System.out.print("Enter Subject Name: ");
        String name = scanner.nextLine();

        subjects.add(new Subject(code, name));
        System.out.println("Subject added successfully.");
    }

    private static void viewAllSubjects() {
        if (subjects.isEmpty()) {
            System.out.println("No subjects found.");
            return;
        }
        for (Subject s : subjects) {
            System.out.println(s);
        }
    }
}