abstract class Test{
    public abstract double Calculation();//Signature
} 
class add extends Test{
    @Override
    public double Calculation(){//Implementation
        int a = 3;
        int b = 4;
        return a+b;

    }
}
class sub extends Test{
    @Override
    
    public double Calculation(){//Implementation
        int a = 10;
        int b = 6;
        return a-b;

    }
}
public class AbstractionInClass {
    public static void main(String[] args){
        Test t1 = new add();
        System.out.println(t1.Calculation());
         Test t2 = new sub();
        System.out.println(t2.Calculation());
    }
}