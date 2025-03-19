class Employee{
    void printDetail(int id){
        System.out.println("Employee ID: "+id);
    }
    void printDetail(String name){
        System.out.println("Employee Name: "+name);
    }
    void printDetail(int id, String name){
        System.out.println("Employee ID: "+id+" Employee Name: "+name);
    }
}
public class FunctionOverloadingforPrintingDetails{
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.printDetail(1);
        emp.printDetail("Airaf");
        emp.printDetail(2, "Bhao");

    }
}