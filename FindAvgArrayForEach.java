import java.util.*;
public class FindAvgArrayForEach {
    public static void main(String[] args){
        int[] arr = {1, 2, 3, 4, 5};
        int sum = 0;
        for(int i : arr){
            sum+=i;
        }
        sum = sum / 5;
        System.out.println("Average of array is: "+sum);
    }
}
