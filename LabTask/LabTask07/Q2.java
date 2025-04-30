// Q2. Printable Interface
// Define an interface Printable with a method print().
// Create two classes Book and Magazine that implement Printable.
// Each class should have attributes like title, author (for Book), and issue number (for Magazine).
// Call the print() method using an interface reference.



interface Printable {
    void print();
}

class Book implements Printable {
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public void print() {
        System.out.println("Book Title: " + title);
        System.out.println("Author: " + author);
    }
}

class Magazine implements Printable {
    private String title;
    private int issueNumber;

    public Magazine(String title, int issueNumber) {
        this.title = title;
        this.issueNumber = issueNumber;
    }

    public void print() {
        System.out.println("Magazine Title: " + title);
        System.out.println("Issue Number: " + issueNumber);
    }
}

public class Q2 {
    public static void main(String[] args) {
        Printable book = new Book("The Great Gatsby", "F. Scott Fitzgerald");
        Printable magazine = new Magazine("National Geographic", 202);

        book.print();
        magazine.print();
    }
}
