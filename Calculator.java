import java.util.*;
public class Calculator {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int choice;
        do{
        System.out.println("*** Calculator ***");
        System.out.println("1. Addition");
        System.out.println("2. Substract");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.print("Enter Your Choice: ");
        choice = scan.nextInt();
        System.out.print("Enter 1st Number : ");
        int num1 = scan.nextInt();
         System.out.print("Enter 2nd Number : ");
        int num2 = scan.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Your Answer is : "+(num1+num2));
                break;
            case 2:
                System.out.println("Your Answer is : "+(num1-num2));
            case 3:
                System.out.println("Your Answer is : "+(num1*num2));
            case 4:
                if(num2!=0){
                    System.out.println("Your Answer is : "+(num1/num2));
                }else{
                    System.out.println("Error: Infinity");
                }
            default:
                System.out.println("Enter Correct choice");
                break;
        }
    }while(choice!=0);
    }
}
