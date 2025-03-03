import java.io.IOException;
import java.util.*;
class Manager{
    private String passwords[] = new String[15];
    private String username;
    private String name;
    private String pin;
    private String PersonalQuestion = null;
    private String PersonalAnswer = null;
    private boolean create = false;
    public int count = 0;

    Scanner scan = new Scanner(System.in);
    void reset (){
        try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
   int startMenu() {
        System.out.println("Welcome to Password Management System");
        System.out.println("We Securely Save Your Password");
        System.out.println("-----------------------");
        System.out.println("| 1. Create an Account |");
        System.out.println("| 2. Sign in           |");
        System.out.println("| 3. Exit              |");
        System.out.println("------------------------");
        System.out.print("Enter your choice: ");
        
        String choice1 = scan.nextLine();
        
        if (choice1.equals("1")) {
            if (create()) {
                startMenu();
            }
        } else if (choice1.equals("2")) {
            if (authentication()) {
                return 0;
            }
        } else if (choice1.equals("3")) {
            System.out.println("Byee Byee TATA good bye gaya");
            System.exit(0);
        } else {
            System.out.println("invalid option  please enter from 1 to 2.");
        }
    return 0;
}

    boolean authentication(){
        System.out.println("Enter Your Username: ");
        String inpUsername = scan.nextLine();
        System.out.println("Enter Pin :");
        String inpPin = scan.nextLine();
        if (inpUsername.equals(username) && inpPin.equals(pin)){
            System.out.println("Access Granted..!");
            return true;
        }else{
            System.out.println("Invalid Username or Pin");
            startMenu();
        }
        return false;
    }
    boolean create(){
        
        if(create == true){
            System.out.println("In Free Trial You Can Create Only One Account");
            return true;
        }
        System.out.println("");
        System.out.print("-> Enter Yout Full Name :");
        String subname = scan.nextLine();
        System.out.println("");
        System.out.print("-----> Enter Username :");
        String subusername = scan.nextLine();
        String subpin;
    while(true){
        System.out.println("");
        System.out.print("----------> Enter Pin :");
        subpin = scan.nextLine();
        System.out.print("----------> Confirm Pin :");
        String subpin2 = scan.nextLine();
        if(subpin.equals(subpin2)){
            break;
        }else{
            System.out.println("[Error]: Pin Does Not Match");
            continue;
        }
    }
        int age;
        System.out.println("");
        System.out.print("-------------------> Enter Your Age :");
        age = scan.nextInt();
        scan.nextLine();
        if(age<16){
            System.out.println("Access Denied! [ΣЯRØR]: You must be 16 or older to use this application.");
            System.exit(0);
        }else{
        System.out.println("To help you securely recover your account in case you forget your password, please set up a security question and provide an answer.");
        System.out.println("Enter Your Question With '?'");
        PersonalQuestion = scan.nextLine();
        System.out.println("Enter Your Answer :");
        PersonalAnswer = scan.nextLine();
        
            name = subname;
            username = subusername;
            pin = subpin;
            System.out.println("Your account has been successfully created. You may now Sign in and explore our services");
            create = true;
            scan.nextLine();
            startMenu();
        }

        return false;
    }
    void show(){
        reset();
        System.out.println("Enter Pin To See Saved Passwords: ");
        String subpin = scan.nextLine();
        if(subpin.equals(pin)){

        
        Scanner scan = new Scanner(System.in);
        if(count == 0){
            System.out.println("No password has been saved.\n");
        }
        else{
            System.out.println("\nYour Saved Passwords:");
        
        for(int i = 0;i<count;i++){
            System.out.println(i+". "+passwords[i]);
        }
        System.out.println("\nWant to Decrypt a specific password? (1: Yes, 0: No)");
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
    }else{
        System.out.println("Invalid Pin");
    }
}

    void decryption(){
        reset();
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
        reset();
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
    void forget(){
        System.out.println("To Forget Your Pin Please Answer to this Question: ");
        System.out.println("Q :"+PersonalQuestion);
        String subAnswer = scan.nextLine();
    if(subAnswer.equals(PersonalAnswer)){
        while(true){
            System.out.println("Enter New Pin: ");
            String subpin = scan.nextLine();
            System.out.println("Confirm Pin: ");
            String subpin2 = scan.nextLine();
            if(subpin.equals(subpin2)){
                pin = subpin;
                System.out.println("Your Pin Has Been Changed");
                return;
                
            }else{
                System.out.println("Pin Does Not Match");
            }
        }
    }else{
        System.out.println("You Are Not The Owner");
        System.out.println("Signing Out...........");
        startMenu();
    }
}
}
public class PasswordManager {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Manager manager = new Manager();
        manager.count = 0;
        manager.startMenu();
do{
        String choice;
        System.out.println("---------------------------------------------");
        System.out.println("|        PASSWORD Management System         |");
        System.out.println("---------------------------------------------");
        System.out.println("-------------------------");
        System.out.println("| 1. Show Saved Password |");
        System.out.println("| 2. Save Password       |");
        System.out.println("| 3. Decryption          |");
        System.out.println("| 4. Forget Password     |");
        System.out.println("| 5. Exit                |");
        System.out.println("--------------------------");
        System.out.println("Enter your choice: ");
        choice = scan.nextLine();
        if(choice != "1" || choice != "2" || choice != "3" || choice != "4"){
            System.out.println("Invalid option");
    }
        switch(choice){
            case "1":
                manager.show();
                scan.nextLine();
            break;
            case "2":
                manager.save();
            
            break;
            case "3":
                manager.decryption();
            break;
            case "4":
                manager.forget();
            break;
            case "5":
                System.out.println("Thanks for using Password Manager");
                System.exit(0);
            break; 
        
    }
}while(true);
}
}