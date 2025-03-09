class num{
public int findMax(int[] nums) {
    int max = nums[0];
    for (int num : nums) {
        if (num > max) {
            max = num;  // Update max if a larger number is found
        }
    }
    return max;
}
}
public class MaxArray {
    public static void main(String[] args) {
        num n = new num();
        int[] input = {3, 7, 1, 9, 4};
        System.out.println(n.findMax(input));
    }
}
