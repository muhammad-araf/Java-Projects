import java.util.*;
public class if_else {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int age = scan.nextInt();
        if(age>18){
            System.out.println("Adult");
        }else{
            System.out.println("Not an Adult");
        }
    }
}
