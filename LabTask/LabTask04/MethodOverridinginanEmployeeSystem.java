class Employee{
    void calculateSalary(){
        System.out.println("Base Salary : 3000$");
    }
}
class Manager extends Employee{
    void calculateSalary(){
        System.out.println("Base Salary : 5000$ + Bonus");
    }
}
class Developer extends Employee{
    void calculateSalary(){
        System.out.println("Developer Salary: $4000 + Project Allowance");
    }
}
public class MethodOverridinginanEmployeeSystem{
    public static void main(String[] args) {
        Developer Developer = new Developer();
        Manager Manager = new Manager();
        Employee Employee = new Employee();
        Developer.calculateSalary();
        Manager.calculateSalary();
        Employee.calculateSalary();

    }
}