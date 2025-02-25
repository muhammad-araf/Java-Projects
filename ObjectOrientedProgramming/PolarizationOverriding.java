class imran {
    void print(){
        System.out.println("Hello, I am Imran");
    }
}
class araf extends imran{
    void print(){
        System.out.println("Hello, I am Araf");
    }
}
public class PolarizationOverriding {
    public static void main(String[] args) {
        araf human1 = new araf();
        human1.print();

    }
    
}
