import java.util.ArrayList;
public class ReverseArrayList{
    public static void main(String[] args){
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        System.out.println("The Original List is : "+list1);
        for(int i = list1.size()-1;i>=0;i--){
            list2.add(list1.get(i));
        }
        System.out.println(list2);
    }
}