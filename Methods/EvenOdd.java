import java.util.*;
class check{
    boolean open(int num1){
        if(num1%2==0){
            return true;
        }else{
            return false;
        }
    }

}
public class EvenOdd {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = scan.nextInt();
        check check = new check();
        if(check.open(num)){
            System.out.println(num + " is even.");
        }else{
            System.out.println(num + " is odd.");
        }
    }
}
