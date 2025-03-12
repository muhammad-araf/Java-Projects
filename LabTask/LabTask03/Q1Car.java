class Vehicle{
    String brand;
    void StartEngine(){
        System.out.println("The Vehicle Engine Start");
    }
}
class hon extends Vehicle{
    void honk(){
        System.out.println("The car HOnks");
    }
}
public class Q1Car {
    public static void main(String[] args){
        Vehicle v = new Vehicle();
        hon h = new hon();
        v.StartEngine();
        h.honk();
    }
}
