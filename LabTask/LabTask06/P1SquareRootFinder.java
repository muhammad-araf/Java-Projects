class finder{
    double squareRoot(int num){
        return Math.sqrt(num);
    }
}
public class P1SquareRootFinder{
    public static void main(String[] args){
        finder find = new finder();
        System.out.println(find.squareRoot(9));
    }
}