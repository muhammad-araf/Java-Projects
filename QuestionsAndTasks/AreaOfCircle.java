class circle{
    float radius;
    circle(float rad){
        radius = rad;
    }
    void calc(){
        float calcu = (3.142f) * (radius * radius);
        System.out.println("The Area of the circle is : "+calcu);
    }

}
public class AreaOfCircle {
    public static void main(String[] args){
        circle c = new circle(5);
        c.calc();
    }
}
