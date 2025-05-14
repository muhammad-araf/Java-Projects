import java.util.*;
public class SignlyLinkedList{
    public static void main(String[] args) {
        
        LinkedList<Integer> list = new LinkedList<>();

        list.addFirst(0);
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        System.out.println("Original List: " + list);
        list.remove(1);
        System.out.println("After deleting node at position 1: " + list);

        //2
        list.removeFirst();
        System.out.println("After deleting first node: " + list);

        list.removeLast();
        System.out.println("After deleting last node: " + list);
        
        //3
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        System.out.println("List before reversal: " + list);

        java.util.Collections.reverse(list);
        System.out.println("List after reversal: " + list);
    }
}