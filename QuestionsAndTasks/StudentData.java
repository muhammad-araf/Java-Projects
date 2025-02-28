import java.util.*;
class Student{
    String name;
    int age;
    int rollNumber;
    void display(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("RollNumber: "+rollNumber);
    }
}
public class StudentData {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Student s = new Student();
        System.out.println("Enter Student Name: ");
        s.name = scan.nextLine();
        System.out.println("Enter Student Age: ");
        s.age = scan.nextInt();
        System.out.println("Enter Student Roll Number: ");
        s.rollNumber = scan.nextInt();
        s.display();
    }
}
