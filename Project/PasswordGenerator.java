import java.util.Scanner;
class Generator{
    public static String generatePassword(int length){
        String password = "";
        for(int i = 0; i < length; i++){
            password += (char)((int)(Math.random() * 94) + 33);
        }
        return password;
    }
}
public class PasswordGenerator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("***** Password Generator *****");
        System.out.print("Enter length of the password: (4 - 20): ");
        int length = scan.nextInt();
        if (length < 4 || length > 20) {
            System.out.println("Invalid length.... 3RR0R: password length should be between 4 and 20.");
            return;
        }
        System.out.println("Your password is: " +"'"+ Generator.generatePassword(length)+"'");        
    }
}