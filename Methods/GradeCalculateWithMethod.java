import java.util.*;
public class GradeCalculateWithMethod {
    static int average(int a , int b , int c){
        int avg = (a+b+c)/3;
        return avg;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int marks[] = new int[3];
        for(int i = 0;i<3;i++){
            System.out.println("Enter marks of Subject " + (i+1) + ":");
            marks[i] = scan.nextInt();
        }
        int avg = average(marks[0],marks[1],marks[2]);
        System.out.println("Your Average Marks is "+ avg);


    }
}
