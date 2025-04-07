class bank{
    private String name;
    private String AccNo;
    private double balance;

    bank(String name, String AccNo,double balance){
        this.name = name;
        this.AccNo = AccNo;
        this.balance = balance;
    }
    double deposit(double Amount){
        balance += Amount;
        return balance;
    }
    double Withdraw(double Amount){
        if (balance > Amount || Amount == 0){
            balance -= Amount;
        }else{
            System.out.println("Invalid OR Insufficient balance");
        }
        return balance;
        }
    void PrintDetail(){
        System.out.println("Name : "+name);
        System.out.println("Account Number : "+AccNo);
        System.out.println("Account Balance : "+balance);
    }   
}
public class QuizSolution {
    public static void main(String[] args) {
        bank banking = new bank("Araf","A001B21098",1000);
        System.out.println("Your balance has been Updated : "+banking.deposit(2500));
        System.out.println("Your balance has been Updated : "+banking.Withdraw(1000));
        banking.PrintDetail();


    }
}