class Finder{
    double Square(int base, int exp){
        return (int)Math.pow(base, exp);
    }
}
public class P1PowerCalculator{
    public static void main(String[] args){
        Finder find = new Finder();
        System.out.println(find.Square(2,3));

    }
}
