import java.util.Stack;

public class Stack {
    public static void main(String[] args) {
        Stack<String> books = new Stack<>();

        books.push("The Alchemist");
        books.push("1984");
        books.push("Brave New World");
        books.push("Moby Dick");
        books.push("To Kill a Mockingbird");

        System.out.println("Popped books:");
        System.out.println(books.pop());
        System.out.println(books.pop());

        System.out.println("Remaining books in stack:");
        for (String book : books) {
            System.out.println(book);
        }
    }
}
