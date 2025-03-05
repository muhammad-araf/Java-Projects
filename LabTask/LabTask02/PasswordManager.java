package LabTask02;
import java.util.*;
class PM{
    private String password;
    PM(String password){
        this.password = password;
    }
    void change(String old, String newpass){
        if(old == password){
            password = newpass;
        }else{
            System.out.println("The password don't change");
        }
    }
    void validatePass(String input){
        if(password == input){
            System.out.println("The password has been change");
        }else{
            System.out.println("The password did not change");
        }
    }
}
public class PasswordManager {
    public static void main(String[] args){
        PM pm = new PM("123");
        int choice;
        System.out.println("1. change Pass");
        System.out.println("2. Validate Pass");
        Scanner scan = new Scanner(System.in);
        choice = scan.nextInt();
        if(choice == 1){
            pm.change("123","321");
        }else if(choice == 2){
            pm.validatePass("123");
        }else{
            System.out.println("Invalid");
        }
    }
}
