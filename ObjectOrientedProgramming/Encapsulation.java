    import java.util.*;
    class atm{
    private String name;
    private int pin;
    public void input(String name, int pin){
        this.name = name;
        this.pin = pin;
    }
    public void print(){
        System.out.println("Welcome "+name+" to ATM");
        System.out.println("Your Pin is "+pin);
    }
    }

    public class Encapsulation {
        public static void main(String[] args){
        atm user1 = new atm();

        user1.input("Araf",1234);
        user1.print();
        }

    }
