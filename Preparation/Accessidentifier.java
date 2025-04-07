class AccessExample {
    private int pvtVar = 1;
    int defaultVar = 2;  
    protected int protectedVar = 3;
    public int publicVar = 4;

    public void display() {
        System.out.println("Private: " + pvtVar);
        System.out.println("Default: " + defaultVar);
        System.out.println("Protected: " + protectedVar);
        System.out.println("Public: " + publicVar);
    }
}
public class Accessidentifier {
    public static void main(String[] args) {
        AccessExample obj = new AccessExample();
        System.out.println(obj.defaultVar);    
        System.out.println(obj.protectedVar);  
        System.out.println(obj.publicVar);    
    }
}