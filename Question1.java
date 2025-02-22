import java.util.*;
public class Question1 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int n = scan.nextInt();
        int sum = 1;
        for(int i = 0; i<n;i++){
            sum *= x;
        }
        System.out.print(sum);
    }
}
