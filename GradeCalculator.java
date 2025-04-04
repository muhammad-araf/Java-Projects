class studentgrade{
    String studentName;
    double marks;

    void input(String stdname , double stdmarks){
        studentName = stdname;
        marks = stdmarks;
    } 

    void checkmarks(){
        System.err.println("Your name is : "+studentName+" Your grade is : ");
        if(marks>=90){
            System.out.print("A");
        }
        else if(marks>=70 || marks<90){
            System.out.print("B");
        }
        else if(marks>=50 || marks<70){
            System.out.print("C");
        }
        else if(marks<50){
            System.out.print("F");
        }
        else{
            System.out.print("Invalid Marks!");
        }
    }
}


public class GradeCalculator {
    public static void main(String[] args) {
        studentgrade g = new studentgrade();
        g.input("nasir", 86);
        g.checkmarks();
    }
}