class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void intro() {
        System.out.println("HI i am " + name + ", and I'm " + age + " years old");
    }
}

class Student extends Person {
    String school;

    Student(String name, int age, String school) {
        super(name, age);
        this.school = school;
    }
    
    void intro() {
        System.out.println("HI i am " + name + ", " + age + " years old and my school name is " + school );
    }
}

class Teacher extends Person {
    String subject;
    Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    void intro() {
        System.out.println("HI i am " + name + ", " + age + " years old and I teach " + subject );
    }
}

public class PersonDemo {
    public static void main(String[] args) {
        Student student = new Student("Airaf", 18, "Saint Mary");
        Teacher teacher = new Teacher("Jaweriya", 18, "Mathematics");
        student.intro();
        teacher.intro();
    }
}