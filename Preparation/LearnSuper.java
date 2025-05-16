abstract class hell{
    protected String name;
    hell(String name){
        this.name = name;
    }
    abstract void display();
}
class hello extends hell{
    hello(String name){
        super(name);
    }
    void display(){
        System.out.println(name);
    }
}
public class LearnSuper {
    public static void main(String... args){
        hello h = new hello("araf");
        h.display(); // I print araf without declare in hello class
    }
}
