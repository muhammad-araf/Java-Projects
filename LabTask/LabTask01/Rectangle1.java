package LabTask01;
class Rectangle {
    int length;
    int width;

    public int calculateArea() {
        return length * width;
    }
}

public class Rectangle1 {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.length = 5;
        r.width = 10;
        System.out.println("Area: " + r.calculateArea());
    }
}
