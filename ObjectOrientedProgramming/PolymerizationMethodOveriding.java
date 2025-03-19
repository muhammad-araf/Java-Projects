class Parent{
    public void greet(){
        System.out.println("Helloooo");
    }
}
class Child extends Parent{
    public void greet(){
        System.out.println("Byeeee");
    }
}
public class PolymerizationMethodOveriding{
    public static void main(String[] args){
        Child ch = new Child();
        ch.greet();

    }
}