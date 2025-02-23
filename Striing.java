import java.util.*;
public class Striing{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your name : ");
        String name = scan.nextLine();
        System.out.print("Enter Your Last Name : ");
        String last = scan.nextLine();
        String Full = name+" "+last;
        System.out.print("Your Full Name is : "+Full);
    }

}