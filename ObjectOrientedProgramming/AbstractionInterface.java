interface Makhlooq{
    void sleep();
    void wakeUp();
}
class Animal implements Makhlooq{
    public void sleep(){
        System.out.println("Animal Sleeping");
    }
    
    public void wakeUp() {
        System.out.println("Animal WakingUp");
    }

}

class Human implements Makhlooq {
    public void sleep() {
        System.out.println("Human Sleeping");
    }

    public void wakeUp() {
        System.out.println("human WakingUp");
    }

}
class Jinn implements Makhlooq {
    public void sleep() {
        System.out.println("Jinn Sleeping");
    }

    public void wakeUp() {
        System.out.println("Jinn WakingUp");
    }
}
public class AbstractionInterface {
    public static void main(String[] args){
        Animal Dog = new Animal();
        Dog.sleep();
        Dog.wakeUp();
        Human Araf = new Human();
        Araf.sleep();
        Araf.wakeUp();
        Jinn jinn = new Jinn();
        jinn.sleep();
        jinn.wakeUp();
    }
}
