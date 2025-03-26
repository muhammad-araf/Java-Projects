class Person {
    final String name; 

    Person(String name) {
        this.name = name;
    }
    void changeName() {
        name = "Lentoaraf"; // The final field Person.name cannot be assigned
    }

    void display() {
        System.out.println("Name: " + name);
    }
}
public class FinalVariableInConstractor {
    
    
    public static void main(String[] args) {
        
        Person p1 = new Person("Araf");
        p1.display();
        p1.changeName();
        p1.display();
    }
}