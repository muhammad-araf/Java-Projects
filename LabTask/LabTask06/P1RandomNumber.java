package LabTask06;
import java.util.Random;
public class P1RandomNumber {
    public static void main(String[] args) {
         Random rand = new Random();
        System.out.println("5 random numbers between 1 and 100 **");
        for (int i = 0; i < 5; i++) {
            int randomNum = rand.nextInt(100) + 1;// 100 bcz this generate random between 99 so i added 1 
            System.out.println(randomNum);
        }
    }
}
