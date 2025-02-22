import java.util.*;
public class UDF {
    public static int sum(int a , int b){
        return a + b;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int sum = sum(a,b);
        System.out.print(sum);
    }
}
    