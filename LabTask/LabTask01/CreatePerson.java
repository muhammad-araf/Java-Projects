package LabTask01;
class Person {

    String name;
    int age;

    void print() {
        System.out.println("Your Name : " + name);
        System.out.println("Your Age : " + age);
    }
}
public class CreatePerson {
    
    public static void main(String[] args){
        Person s1 = new Person();
        s1.name = "Araf";
        s1.age = 17;
        s1.print();
        //------------------
        Person s2 = new Person();
        s2.name = "Imran";
        s2.age = 20;
        s2.print();

    }
}   
