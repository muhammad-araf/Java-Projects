import java.util.*;
public class ReverseString {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        StringBuilder name = new StringBuilder(scan.nextLine());
        StringBuilder name2 = new StringBuilder("");
        int a = name.length()-1;
        for(int i = 0;i<name.length();i++){
            name2.append(name.charAt(a));
            a--;
        }
        System.out.println(name2);

    }
}
