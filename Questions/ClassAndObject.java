class Book{
    String Title;
    String Author;
    int price;
    public Book(String title, String author, int price) {
        Title = title;
        Author = author;
    }
    void display(){
        System.out.println("Title: "+Title);
        System.out.println("Author: "+Author);
    }
}
public class ClassAndObject {
    public static void main(String[] args){
        Book lento = new Book("Novel","Araf",1800);
        lento.display();

    }
}
