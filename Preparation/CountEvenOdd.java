public class CountEvenOdd{
    public static void main(String... args){
        int[] arr = {1,2,3,4,5,6,7,8,9,12};
        int even = 0;
        int odd = 0;
        for(int i = 0;i<10;i++){
            if(arr[i]%2==0){
                even++;
            }else{
                odd++;
            }
        }
        System.out.println("Even number in array is : "+even);
        System.out.println("Odd number in array is : "+odd);
    }
}