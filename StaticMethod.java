class Test{
    static int add(int a, int b){
        int ans = a+b;
        return ans;
    }
}
public class StaticMethod {
    public static void main(String[] args){
        System.out.println(Test.add(2, 2));
    }
}
