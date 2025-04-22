// Define an interface
interface Animal {
    void makeSound(); 
    void eat();
}

class Dog implements Animal {
    public void makeSound() {
        System.out.println("Dog barks: Woof! Woof!");
    }

    public void eat() {
        System.out.println("Dog eats bones.");
    }
}

class Cat implements Animal {
    public void makeSound() {
        System.out.println("Cat meows: Meow!");
    }

    public void eat() {
        System.out.println("Cat eats fish.");
    }
}

public class Interface0 {
    public static void main(String[] args) {
        Animal myDog = new Dog();
        Animal myCat = new Cat();

        myDog.makeSound();
        myDog.eat();

        myCat.makeSound();
        myCat.eat();
    }
}
