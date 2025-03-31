public class DigitalRoot {
    public static int root(int num) {
        while (num >= 10) {
            int sum = 0;
            while (num > 0) {
                sum += num % 10;
                num /= 10;
            }
            num = sum;
        }
        return num;
    }

    public static void main(String[] args) {
        
        int number = 987;
        System.out.println("Digital Root of " + number + " is: " + root(number));
    }
}
