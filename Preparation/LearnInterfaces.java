interface Remote{
    void control();
    static void hello(){
        System.out.println("hello");
    }
    default void hello(int a){
        System.out.println("Hello");
    }
}
class LGRemote implements Remote{
    @Override
    public void control(){
        System.out.println("Remote in remoting");
    }
}
public class LearnInterfaces{
    public static void main(String... args){
        LGRemote r = new LGRemote();
        r.hello(2);
        r.control();
        Remote.hello();
    }
}