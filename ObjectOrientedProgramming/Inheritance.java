import java.util.*;
class imran{
    String name = "Github";
}
class araf extends imran{
    int age = 18;
}
public class Inheritance {
    public static void main(String[] args){
        araf account1 = new araf();
        System.out.println("Name is : "+account1.name+"\n"+"Age is : "+account1.age);
    }

}
