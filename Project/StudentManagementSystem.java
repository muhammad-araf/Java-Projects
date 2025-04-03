import java.util.Scanner;

class Student {
    private String name;
    private int id;
    private double grade;

    public Student(String name, int id, double grade) {
        this.name = name;
        this.id = id;
        this.grade = grade;
    }

    public void displayInfo() {
        System.out.println("Student ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Grade: " + grade);
        System.out.println("------------------------");
    }
}

public class StudentManagementSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int MAX_STUDENTS = 5;
        Student[] students = new Student[MAX_STUDENTS];
        int count = 0;

        while (true) {
            System.out.println("\nStudent Management System");
            System.out.println("1. Add Student");
            System.out.println("2. Display Students");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    if (count < MAX_STUDENTS) {
                        System.out.print("Enter Student Name: ");
                        scanner.nextLine();
                        String name = scanner.nextLine();
                        System.out.print("Enter Student ID: ");
                        int id = scanner.nextInt();
                        System.out.print("Enter Student Grade: ");
                        double grade = scanner.nextDouble();

                        students[count] = new Student(name, id, grade);
                        count++;
                        System.out.println("Student added successfully!");
                    } else {
                        System.out.println("Cannot add more students (Limit reached)!");
                    }
                    break;

                case 2: 
                    if (count == 0) {
                        System.out.println("No students available.");
                    } else {
                        System.out.println("\nStudent List:");
                        for (int i = 0; i < count; i++) {
                            students[i].displayInfo();
                        }
                    }
                    break;

                case 3:
                    System.out.println("Exiting the system...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}
