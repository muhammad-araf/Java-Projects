import java.util.*;
public class UDF_Table {
    public static void table (int num){
        for(int i = 1;i<=10;i++){
            System.out.println(num+" x "+i+" = "+num*i);
        }
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        table(num);
    }
}
