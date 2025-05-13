import java.util.Scanner;
interface Shape{
    double area();
}
class Circle implements Shape{
    private double r;
    Circle(double r){
        this.r = r;
    }
    public double area(){
        return Math.PI * r * r;
    }
}
class rectangle implements Shape{
    private double len,wid;
    rectangle(double len,double wid){
        this.len = len;
        this.wid = wid;
    }
    public double area(){
        return (len*wid);
    }
}
public class InterfaceShape{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("1. Circle");
        System.out.println("2. Rectangle");
        int choice = scan.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Input Radius");
                double rad = scan.nextDouble();
                Shape s = new Circle(rad);
                System.out.println(s.area());
                break;
            case 2:
                System.out.println("Input Length");
                double wid = scan.nextDouble();
                System.out.println("Input Width");
                double len = scan.nextDouble();

                Shape a = new rectangle(len,wid);
                System.out.println(a.area());
                break;
            default:
                throw new AssertionError();
        }
    }
}