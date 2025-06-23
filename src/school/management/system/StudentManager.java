import java.util.ArrayList;
import java.util.Scanner;

public class StudentManager {
    private static final ArrayList<Student> students = new ArrayList<>();
    private static final Scanner scanner = new Scanner(System.in);

    public static void studentMenu() {
        int choice;
        do {
            System.out.println("\n===== STUDENT MANAGEMENT =====");
            System.out.println("1. Register New Student");
            System.out.println("2. View All Students");
            System.out.println("3. Search Student");
            System.out.println("4. Update Student");
            System.out.println("5. Delete Student");
            System.out.println("6. Student Attendance (Coming Soon)");
            System.out.println("0. Back to Main Menu");
            System.out.print("Enter choice: ");
            choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1 -> registerStudent();
                case 2 -> viewAllStudents();
                case 3 -> searchStudent();
                case 4 -> updateStudent();
                case 5 -> deleteStudent();
                case 6 -> System.out.println("Attendance feature is not implemented yet.");
            }
        } while (choice != 0);
    }

    private static void registerStudent() {
        System.out.print("Enter ID: ");
        String id = scanner.nextLine();
        System.out.print("Enter Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Age: ");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter Grade: ");
        String grade = scanner.nextLine();

        students.add(new Student(id, name, age, grade));
        System.out.println("Student registered successfully.");
    }

    private static void viewAllStudents() {
        if (students.isEmpty()) {
            System.out.println("No students found.");
            return;
        }
        for (Student s : students) {
            System.out.println(s);
        }
    }

    private static void searchStudent() {
        System.out.print("Enter ID to search: ");
        String id = scanner.nextLine();
        for (Student s : students) {
            if (s.toString().contains(id)) {
                System.out.println(s);
                return;
            }
        }
        System.out.println("Student not found.");
    }

    private static void updateStudent() {
        System.out.print("Enter ID to update: ");
        String id = scanner.nextLine();
        for (Student s : students) {
            if (s.toString().contains(id)) {
                System.out.print("Enter new Name: ");
                String name = scanner.nextLine();
                System.out.print("Enter new Age: ");
                int age = Integer.parseInt(scanner.nextLine());
                System.out.print("Enter new Grade: ");
                String grade = scanner.nextLine();

                students.remove(s);
                students.add(new Student(id, name, age, grade));
                System.out.println("Student updated successfully.");
                return;
            }
        }
        System.out.println("Student not found.");
    }

    private static void deleteStudent() {
        System.out.print("Enter ID to delete: ");
        String id = scanner.nextLine();
        students.removeIf(s -> s.toString().contains(id));
        System.out.println("If student existed, they have been deleted.");
    }
}