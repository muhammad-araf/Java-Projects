public class AverageOfArray{
    public static void main(String[] args) {
        int[] arr = {90,80,60,85,91};
        int sum = 0;
        for(int i = 0;i<arr.length;i++){
            sum+=arr[i];
        }
        double avg = sum/5;
        System.out.println("The average of array is :"+avg);
    }
}