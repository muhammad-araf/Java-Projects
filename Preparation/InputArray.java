import java.util.Scanner;
public class InputArray{
    public static void main(String... args){
        Scanner scan = new Scanner(System.in);
        int[] arr = new int[5];
        for(int i = 0;i<5;i++){
            System.out.print("Input Element "+(i+1)+" : ");
            arr[i] = scan.nextInt();
        }
    }
}