import java.util.*;
public class FindLargestNumber {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        if(a>b){
            if(a>c){
                System.out.println(a+" Is Largest");
            }
        }
        else if(b>c){
            System.out.println(b+" Is largest");
        }
        else{
            System.out.println(c+" Is largest");
        }
    }
}
