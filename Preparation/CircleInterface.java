interface Shape{
    void draw();
}
class Circle implements Shape{
    public void draw(){
        System.out.println("Drawing Circle");
    }
}
class Rectangle implements Shape{
    public void draw(){
        System.out.println("Drawing Rectangle");
    }
}
public class CircleInterface{
    public static void main(String... args){
        Shape s = new Circle();
        s.draw();
        s = new Rectangle();
        s.draw();
    }
}