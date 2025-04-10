import java.util.Scanner;
public class MiniAuthApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String savedUsername = "";
        String savedPassword = "";
        int choice;
        System.out.println("Welcome to the Mini Auth App.");
        do {
            System.out.println("\nPlease choose an option:");
            System.out.println("1. Signup (Create Account)");
            System.out.println("2. Signin (Login)");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();
            if (choice == 1) {
                System.out.println("\nCreate your account:");
                System.out.print("Enter username: ");
                savedUsername = sc.nextLine();

                System.out.print("Enter password: ");
                savedPassword = sc.nextLine();

                System.out.println("Signup successful.");
            } 
            else if (choice == 2) {
                if (savedUsername.equals("") || savedPassword.equals("")) {
                    System.out.println("No account found. Please signup first.");
                    continue;
                }
                System.out.println("\nLogin:");
                System.out.print("Enter username: ");
                String inputUser = sc.nextLine();

                System.out.print("Enter password: ");
                String inputPass = sc.nextLine();

                if (inputUser.equals(savedUsername) && inputPass.equals(savedPassword)) {
                    System.out.println("Login successful. Welcome " + inputUser + "!");
                } else {
                    System.out.println("Incorrect username or password.");
                }
            } 
            else if (choice == 3) {
                System.out.println("Thank you for using the system. Goodbye.");
            } 
            else {
                System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 3);
    }
}
