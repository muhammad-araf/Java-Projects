interface vehicle{
    void start();
}
class car implements vehicle{
    public void start(){
        System.out.println("Car is starting");
    }
}
class bike implements vehicle{
    public void start(){
        System.out.println("bike is starting");
    }
}
class bus implements vehicle{
    public void start(){
        System.out.println("bus is starting");
    }
}
public class VehicleInterface{
    public static void main(String[] args) {
        vehicle c = new car();
        c.start();
        vehicle b = new bike();
        b.start();
        vehicle bus = new bus();
        bus.start();
    }
}