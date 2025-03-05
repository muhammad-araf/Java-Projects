package LabTask01;
class calc{
    int add(int a,int b){
        return (a+b);
    }
    int multi(int a ,int b){
        return (a*b);
    }
}

public class Calculator {
    public static void main(String[] args){
        calc cal = new calc();
        System.out.println(cal.add(5, 2));
        System.out.println(cal.multi(5, 2));

    }
}
