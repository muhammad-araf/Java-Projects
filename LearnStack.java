import java.util.Stack;
public class LearnStack{
    public static void main(String[] args){
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);

        for(int i = 0; i < 4;i++)
        {
            System.out.println(s.peek());
            s.pop();
        }
        
    }
}