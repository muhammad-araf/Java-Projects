import java.util.*;
class Manager{
    private String passwords[] = new String[15];
    public int count = 0;
    void show(){
        Scanner scan = new Scanner(System.in);
        if(count == 0){
            System.out.println("No password has been saved.\n");
        }
        else{
            System.out.println("\nYour Saved Passwords:");
        
        for(int i = 0;i<count;i++){
            System.out.println(i+". "+passwords[i]);
        }
        System.out.println("\nWant to see a specific password? (1: Yes, 0: No)");
        int choice = scan.nextInt();
        if(choice == 1){
            System.out.println("Enter the Serial number of the password you want to see");
            int serial = scan.nextInt();
            if(serial > count || serial < -1){
                System.out.println("Invalid Serial Number");
            }
            System.out.println("Enter the key for the password " + passwords[serial]);
            int key = scan.nextInt();
            StringBuilder decryptedText = new StringBuilder();
            for (int i = 0; i < passwords[serial].length(); i++) {
                char a = (char) (passwords[serial].charAt(i) - key);
                decryptedText.append(a);
            }
            System.out.println("Decrypted Password: "+decryptedText.toString());
        }
    }
    }
    void decryption(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the password u want to decrypt");
        String subpassword = scan.nextLine();
        System.out.println("Enter the key for the password");
        int key = scan.nextInt();
        StringBuilder decryptedText = new StringBuilder();
        for (int i = 0; i < subpassword.length(); i++) {
            char a = (char) (subpassword.charAt(i) - key);
            decryptedText.append(a);
        }
        System.out.println("According to your key Decrypted Password: " + decryptedText.toString());
    }
    void save(){
        StringBuilder encryptedText = new StringBuilder();
        String password;
        System.out.println("Encrypted: " + encryptedText);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your password");
        password = sc.nextLine();
        int key = (int) (Math.random() * 8)+1;
        for (int i = 0; i < password.length(); i++) {
            char a = (char) (password.charAt(i) + key);
            encryptedText.append(a);
        }
        passwords[count] = encryptedText.toString();
        System.out.println("\nYour password has been saved securely.");
        System.out.println("Remember the key for decryption: " + key);
        count++;
    }
}

public class PasswordManager {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Manager manager = new Manager();
        manager.count = 0;
do{
        char choice;
        System.out.println("----- Password Management System -----");
        System.out.println("Menu");
        System.out.println("1. Show Saved Password");
        System.out.println("2. Save Password");
        System.out.println("3. Decryption");
        System.out.println("4. Exit");
        choice = scan.next().charAt(0);
        switch(choice){
            case '1':
                manager.show();
            break;
            case '2':
                manager.save();
            break;
            case '3':
                manager.decryption();
            break;
            case '4':
                System.out.println("Thanks for using Password Manager");
                System.exit(0);
            break;
            default:
                System.out.println("Invalid choice");
            break;
        }
        }while(true);
    }
}
