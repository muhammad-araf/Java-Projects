import java.util.*;
class Employee{
    private String name;
    private double Salary;
    Employee(String name, double Salary){
        this.name = name;
        this.Salary = Salary;
    }
    double getSalary(){
        return Salary;
    }
    
}
public class PrintSalaryWithArrayList{
    public static void main(String[] args) {
        ArrayList<Employee> member = new ArrayList<>();
        member.add(new Employee("Araf",20000));
        member.add(new Employee("Fasih",50000));
        member.add(new Employee("Maham",40000));
        // for(Employee e : member){
        //     System.out.println(e.getSalary());
        // }
        double max = member.get(0).getSalary();
        double min = member.get(1).getSalary();
        for(int i = 0; i < 3; i++){
            if(max < member.get(i).getSalary()){
                max = member.get(i).getSalary();
            }
            if(min > member.get(0).getSalary()){
                min = member.get(i).getSalary();
            }
        }
        System.out.println("The Maximum Salary is :"+max);
        System.out.println("The Minimum Salary is :"+min);

 
   }
}