import java.util.*;
class Employee{
    private int id;
    private String name;
    private double salary;
    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public double getSalary(){
        return salary;
    }
    void print(){
        System.out.print("Name : "+name+"\nID : "+id+"\nSalary : "+salary);
    }
}

public class PrintSalaryWithArrayList{
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();

        employees.add(new Employee(1, "Araf", 75000.50));
        employees.add(new Employee(2, "Fasih", 82000.75));
        employees.add(new Employee(3, "Jiya", 65000.25));

        Employee highestPaid = employees.get(0);
        for (Employee emp : employees) {
            if (emp.getSalary() > highestPaid.getSalary()) {
                highestPaid = emp;
            }
            emp.print();
        }


        System.out.println("Employee with the highest salary:");
        System.out.println(highestPaid);
    }
}