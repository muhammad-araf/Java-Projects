class Animal{
    void sound(){
    }
}
class Dog extends Animal{
    void sound(){
        System.out.println("bhao bhao");
    }
}
class Cat extends Animal{
    void sound(){
        System.out.println("Meow Meow"); 
     }
    }

public class InterfacesforMultiplePolymorphic{
    public static void main(String[] args){
        Animal a = new Dog();
        a.sound();
        a = new Cat();
        a.sound();

    }
}