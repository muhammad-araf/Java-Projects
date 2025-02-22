import java.util.*;
public class FindNumIn2DArray{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int[][] arr = new int[a][b];
        for(int i = 0; i < a; i++){
            for(int j = 0; j < b; j++){
                System.out.print(i+" , "+j);
            arr[i][j] = scan.nextInt();
            }
        }
        for(int i = 0;i<a;i++){
            for(int j = 0;j<b;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

    }
}