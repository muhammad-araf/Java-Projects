interface Greet{
    void sayHello();
    public default void sayGoodBye(){
        System.out.println("Bye Bye..........");
    }
    static void Greety(){
        System.out.println("Hii ");
    }
}
class Welcome implements Greet{
    public void sayHello(){
        System.out.println("Hello");
    }

}
public class Java8plus{
    public static void main(String... args){
        Welcome w = new Welcome();
        w.sayHello();
        w.sayGoodBye();
        Greet.Greety();
    }
}