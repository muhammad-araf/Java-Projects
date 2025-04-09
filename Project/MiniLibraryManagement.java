import java.util.Scanner;
class Book {
    String title;
    String author;
    boolean isIssued;
    Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.isIssued = false;
    }
    void showDetails(int number) {
        System.out.println(number + ". " + title + " by " + author + " | Issued: " + (isIssued ? "Yes" : "No"));
    }
}
public class MiniLibraryManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Book[] books = new Book[100];
        int bookCount = 0;
        int choice;
        do {
            System.out.println("\n----- Mini Library Menu -----");
            System.out.println("1. Add Book");
            System.out.println("2. Show All Books");
            System.out.println("3. Issue Book");
            System.out.println("4. Return Book");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    if (bookCount >= 100) {
                        System.out.println("Library is full.");
                        break;
                    }
                    System.out.print("Enter book title: ");
                    String title = sc.nextLine();
                    System.out.print("Enter author name: ");
                    String author = sc.nextLine();
                    books[bookCount] = new Book(title, author);
                    bookCount++;
                    System.out.println("Book added.");
                    break;

                case 2:
                    if (bookCount == 0) {
                        System.out.println("No books in the library.");
                    } else {
                        System.out.println("\n--- Books in Library ---");
                        for (int i = 0; i < bookCount; i++) {
                            books[i].showDetails(i + 1);
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter book number to issue: ");
                    int issueNo = sc.nextInt();
                    if (issueNo < 1 || issueNo > bookCount) {
                        System.out.println("Invalid book number.");
                    } else if (books[issueNo - 1].isIssued) {
                        System.out.println("Book already issued.");
                    } else {
                        books[issueNo - 1].isIssued = true;
                        System.out.println("Book issued.");
                    }
                    break;

                case 4:
                    System.out.print("Enter book number to return: ");
                    int returnNo = sc.nextInt();
                    if (returnNo < 1 || returnNo > bookCount) {
                        System.out.println("Invalid book number.");
                    } else if (!books[returnNo - 1].isIssued) {
                        System.out.println("Book is not issued.");
                    } else {
                        books[returnNo - 1].isIssued = false;
                        System.out.println("Book returned.");
                    }
                    break;

                case 5:
                    System.out.println("Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 5);

        sc.close();
    }
}
