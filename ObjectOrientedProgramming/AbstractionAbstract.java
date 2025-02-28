abstract class human {
    abstract void eat();
    void sleep(){
        System.out.println("Human Sleeping.....");
    }
}
class chinese extends human {
    void eat(){
        System.out.println("Chinese eating Snake");
    }

}
public class AbstractionAbstract {
    public static void main(String[] args){
        chinese c = new chinese();
        c.eat();
        c.sleep();
    }
}
