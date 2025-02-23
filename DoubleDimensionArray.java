import java.util.*;
public class DoubleDimensionArray {
    public static void main(String[] args){
        int arr[][] = {
            {1,2,3,4,5},
            {6,7,8,9,10},   
            {11,12,13,14,15}
        };
        for(int j[] : arr){
            for(int i : j){
                System.out.print(i+" ");
            }
        }
    }
}
