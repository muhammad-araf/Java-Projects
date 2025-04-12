import java.util.Scanner;
public class StrongPasswordChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your password: ");
        String password = sc.nextLine();

        int score = 0;
        if (password.length() >= 8) score++;
        if (hasUppercase(password)) score++;
        if (hasLowercase(password)) score++;
        if (hasDigit(password)) score++;
        if (hasSpecialChar(password)) score++;

        System.out.print("Password Strength: ");
        switch (score) {
            case 5 -> System.out.println("Very Strong");
            case 4 -> System.out.println("Strong");
            case 3 -> System.out.println("Medium");
            case 2 -> System.out.println("Weak");
            default -> System.out.println("Very Weak");
        }

        if (score < 5) {
            System.out.println("Suggestions to improve:");
            if (password.length() < 8)
                System.out.println("** Use at least 8 characters");
            if (!hasUppercase(password))
                System.out.println("** Add an uppercase letter (A-Z)");
            if (!hasLowercase(password))
                System.out.println("** Add a lowercase letter (a-z)");
            if (!hasDigit(password))
                System.out.println("** Add a number (0-9).");
            if (!hasSpecialChar(password))
                System.out.println("** Add a special character (!@#$%^&*)");
        }
    }

    static boolean hasUppercase(String s) {
        for (char c : s.toCharArray()) {
            if (Character.isUpperCase(c)) return true;
        }
        return false;
    }

    static boolean hasLowercase(String s) {
        for (char c : s.toCharArray()) {
            if (Character.isLowerCase(c)) return true;
        }
        return false;
    }

    static boolean hasDigit(String s) {
        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) return true;
        }
        return false;
    }

    static boolean hasSpecialChar(String s) {
        return s.matches(".*[!@#$%^&*()-+=].*");
    }
}
