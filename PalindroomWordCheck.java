import java.util.Stack;
import java.util.Scanner;
public class PalindroomWordCheck{
    public static void main(String[] args){
        Stack<Character> stack = new Stack<>();
        Scanner scan = new Scanner(System.in);
        do{System.out.print("Enter a Word to check : ");
        String word = scan.nextLine();
        if(word==""){
            System.out.println("Invalid Input");
            continue;
        }
        for(char c : word.toCharArray()){
            stack.push(c);
        }
        String Reverse = "";
        for(int i = 0; !(stack.isEmpty()); i++){
            Reverse += stack.pop();
        }
        if(Reverse.equals(word)){
            System.out.println("The word is palindroom");
        }else if(!(Reverse.equals(word))){
            System.out.println("The word is not palindroom");
        }
        else{
            System.out.println("Incorrect word");
        }
        System.out.println("");
    }while(true);
        

    }
}