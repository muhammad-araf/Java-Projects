class person{
    String name = "Salim";
    int age = 20;
    void intro(){
        System.out.println("hello, My Name Is "+name+" and i am "+age+" Years old");
    }
}
class student extends person{
    String school;
}
public class Q2Student {
    public static void main(String[] args){
        student stds = new student();
        stds.intro();
    }
}
