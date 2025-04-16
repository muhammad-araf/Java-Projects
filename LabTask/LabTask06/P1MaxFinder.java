import java.util.Scanner;
public class P1MaxFinder {
    public static void main(String[] args){
        int a,b,c;
        Scanner scan = new Scanner(System.in);
        a = scan.nextInt();
        b = scan.nextInt();
        c = scan.nextInt();
        int max = Math.max(a, Math.max(b, c));
        System.out.println("The max number is" + max);
    }
}
