import java.util.*;
class addition{
    int sum(int a, int b){
        return (a+b);
    }
    double sum(float a, float b){
        return (a+b);
    }
}
public class PolymorphismOverloading {
    public static void main(String[] args){
        addition sum1 = new addition();
        System.out.println(sum1.sum(10, 20));
        System.out.println(sum1.sum(10.2f, 20.3f));
    }
}
