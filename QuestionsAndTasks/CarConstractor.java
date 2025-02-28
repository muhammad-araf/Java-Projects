class Car{
    String brand;
    String model;
    int year;
    public Car(String brand,String model,int year){
        this.brand = brand;
        this.model = model;
        this.year = year;

    }
    void display(){
        System.out.println("Car brand : "+brand);
        System.out.println("Car model : "+model);
        System.out.println("Car year : "+year);
    }
}
public class CarConstractor {
    public static void main(String[] args){
        Car car = new Car("Toyota", "Camry", 2015);
        car.display();
    }
}
