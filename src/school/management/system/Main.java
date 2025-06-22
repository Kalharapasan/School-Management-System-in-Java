package school.management.system;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n========================================");
            System.out.println("    SCHOOL MANAGEMENT SYSTEM v2.0");
            System.out.println("========================================");
            System.out.println("1.  Student Management");
            System.out.println("2.  Teacher Management");
            System.out.println("3.  Admin Management");
            System.out.println("4.  Subject Management");
            System.out.println("5.  Class Management (Coming Soon)");
            System.out.println("6.  Exam Management");
            System.out.println("7.  Marks & Results (Coming Soon)");
            System.out.println("8.  Reports & Analytics (Coming Soon)");
            System.out.println("9.  System Settings (Coming Soon)");
            System.out.println("0.  Exit");
            System.out.print("Enter your choice: ");

            choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1 -> StudentManager.studentMenu();
                case 2 -> TeacherManager.teacherMenu();
                case 3 -> AdminManager.adminMenu();
                case 4 -> SubjectManager.subjectMenu();
                case 6 -> ExamManager.examMenu();
                case 0 -> System.out.println("Exiting program.");
                default -> System.out.println("Feature not yet implemented.");
            }

        } while (choice != 0);
    }
}