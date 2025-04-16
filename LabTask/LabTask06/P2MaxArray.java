public class P2MaxArray{
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            max = Math.max(max, arr[i]);//check 1st element and the very next element of array
        }
        System.out.println("Th max array is" + max);
    }
}