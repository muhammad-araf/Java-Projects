package LabTask01;
class Student{
    String name;
    double marks;
    void checkpass(){
        if(marks>=50){
            System.out.println("Passed..!");
        }else{
            System.out.println("Failed..!");
        }
    }
}
public class Grade {
    public static void main(String[] args){
        Student s = new Student();
        s.name = "Rahul";
        s.marks = 60;
        s.checkpass();
    }
}
