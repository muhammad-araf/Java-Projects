class Animal{
    final void makeSound()
    {
        System.out.println("Animals Make Sounds");
    }
}

class Dog extends Animal{
    void makeSound() // cannot override because it is Final Method of class Animanl
    {
        System.out.println("Animal Can't Make Sound");
    }

}
public class TryFinalMethodOverriding {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.makeSound();

        Animal a = new Animal();
        a.makeSound();
    }
}