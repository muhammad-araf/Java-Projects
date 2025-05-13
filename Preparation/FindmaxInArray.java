public class FindmaxInArray{
    public static void main(String[] args) {
        int arr[] = {1,3,6,9,3,2,6,8};
        int max = arr[0];
        for(int i = 0;i<arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }
        System.out.println("Mx in array is "+max);
    }
}