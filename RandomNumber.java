import java.util.*;
public class RandomNumber {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        do{
            
        int randnum = (int) (Math.random() * 5);
        System.out.println("Enter a Guess number");
        int guess = scan.nextInt();
        if(randnum == guess){
            System.out.println("U guessed right ");
        }else{
            System.out.println("U guessed wrong the correcr is "+ randnum);  
        }
    }while(true);
    }
}
