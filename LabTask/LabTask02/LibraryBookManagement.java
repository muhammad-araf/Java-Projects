package LabTask02;
import java.util.*;
class manage{
    private String Title = "Peer e kamil";
    private String Author = "Nimra ahmed";
    private Boolean Book;

    manage(String title,String author){
        Title = title;
        Author = author;
    }
    void issue(){
        System.out.println(Title+" Is issued");
        Book = true;
        
    }
    void returnBook(){
        System.out.println(Title+"Is returned");
        Book = false;
    }
    void show(){
        if(Book){
            System.out.println(Title+"The Book is Issued");
        }else{
            System.out.println(Title+"The Book is Returned and available");
        }
        
    }
}
public class LibraryBookManagement {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int choice;
        manage mg = new manage("Peer e kamil","Nimra Ahemd");
        do{
        System.out.println("1. Issue Book");
        System.out.println("2. Return Book");
        System.out.println("3. Show Book");
        
        choice = scan.nextInt();
        if(choice == 1){
            mg.issue();
        }
        else if (choice == 2){
            mg.returnBook();
        }else if (choice == 3){
            mg.show();
        }
        else{
            System.out.println("Invalid choice");
        }
    }while(choice != 4);
    }
}
