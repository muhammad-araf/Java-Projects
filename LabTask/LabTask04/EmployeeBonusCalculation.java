class Employee{
    int calculateBonus(int sal){
        int bonus = (sal / 100)*5;
        return bonus;
    }
    double calculateBonus(double BaseSal, int rate){
        double bonus = 0;
        if(rate == 5){
            bonus = (BaseSal*0.20)+BaseSal;

        }else if(rate == 4){
            bonus = (BaseSal*0.15)+BaseSal;
        }
        else if(rate == 3){
            bonus = (BaseSal*0.10)+BaseSal;
        }
        else if(rate == 2){
            bonus = (BaseSal*0.05)+BaseSal;
        }
        else if(rate == 1){
            bonus = (BaseSal*0)+BaseSal;
        }
        else{
           return 0;
        }
        return bonus;
    }
}
public class EmployeeBonusCalculation{
    public static void main(String[] args){
        Employee e = new Employee();
        e.calculateBonus(25000);
        System.out.println("Your Bonus Salary is :"+e.calculateBonus(25000, 5));
    }
}