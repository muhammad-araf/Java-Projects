import java.util.ArrayList;
import java.util.Collections;
public class LearnArrayList{
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        System.out.println(list);

        list.add(1,2);
        System.out.println(list);

        list.set(0,-1);
        System.out.println(list);
        
        list.remove(3);
        System.out.println(list);

        int size = list.size();
        System.out.println(size);

        for(int i = 0;i<list.size();i++){
            System.out.print(list.get(i));
        }
        list.set(0,5);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
    }
}