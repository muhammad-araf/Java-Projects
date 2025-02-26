class student {
    String name;
    int age;

    void print() {
        System.out.println("Your Name : " + name);
        System.out.println("Your Age : " + age);
    }
}
public class ClassObject {
    
    public static void main(String[] args){
        student s1 = new student();
        s1.name = "Araf";
        s1.age = 17;
        s1.print();
    }
}   
