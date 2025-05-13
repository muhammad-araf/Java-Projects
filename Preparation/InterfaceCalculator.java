interface calculation{
    int add(int a,int b);
    int sub(int a,int b);
    double divide(int a,int b);
    int multiply(int a,int b);
}
class Calculator implements calculation{
    public int add(int a,int b){
        return a+b;
    }
    public int sub(int a,int b){
        return a-b;
    }
    public double divide(int a,int b){
        return a/b;
    }
    public int multiply(int a, int b){
        return a*b;
    }
}
public class InterfaceCalculator{
    public static void main(String... args){
        calculation c = new Calculator();
        System.out.println(c.add(2,2));
        System.out.println(c.sub(9,6));
        System.out.println(c.divide(9,3));
        System.out.println(c.multiply(9,1));
    }
}