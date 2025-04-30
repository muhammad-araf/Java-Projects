// Q4. Interface with Multiple Classes
// Define an interface Vehicle with method void start();.
// Implement this interface in three classes:
// •	Car
// •	Bike
// •	Bus


interface Vehicle {
    void start();
}

class Car implements Vehicle {
    public void start() {
        System.out.println("Car is starting...");
    }
}

class Bike implements Vehicle {
    public void start() {
        System.out.println("Bike is starting...");
    }
}

class Bus implements Vehicle {
    public void start() {
        System.out.println("Bus is starting...");
    }
}

public class Q4 {
    public static void main(String[] args) {
        Vehicle car = new Car();
        Vehicle bike = new Bike();
        Vehicle bus = new Bus();

        car.start();
        bike.start();
        bus.start();
    }
}
