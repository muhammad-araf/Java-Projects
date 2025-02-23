import java.util.*;
public class EvenOdd {
    public static void main(String[] args){
     Scanner scan = new Scanner(System.in);
     int num = scan.nextInt();
     if(num%2==0){
        System.out.println("The number is Even");
     }else{
        System.out.println("The number is Odd");
     }
    }
}
