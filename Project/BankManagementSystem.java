import java.util.*;

class Account {
    private int balance;
    private String name;
    private int accountNumber;

    Account(String name,int accountNumber, int balance) {
        this.balance = balance;
        this.accountNumber = accountNumber;
    }

    void deposit(int money) {
        if(money>0){
        balance += money;
        System.out.println("Your Deposit Money is: " + money);
        System.out.println(name + " Your New Balance is: " + balance);
        }else{
            System.out.println("Invalid Deposit Money");
        }
    }

    void Withdraw(int money) {
        if (money > balance) {
        balance -= money;
        System.out.println("Your Withdraw Money is: " + money);
        System.out.println(" Your New Balance is: " + balance);
        }
        else{
            System.out.println("You don't have enough money");
        }
    }

    void check() {
        System.out.println(" Your Balance is: " + balance);
    }
}

public class BankManagementSystem {
    public static void main(String[] args){
        Account account1 = null;
        String name = null;
        int acn;
        boolean check = true;
do{
    
        System.out.println("Bank Management System");
        System.out.println("1. Create Account");
        System.out.println("2. Deposit Money");
        System.out.println("3. Withdraw Money");
        System.out.println("4. Check Balance");
        System.out.println("5. Exit");
        if (!check) {
          
            System.out.println(name+" Choose Option");
        }
        Scanner scan = new Scanner(System.in);
        int choice = scan.nextInt();
    switch(choice){
        case 1:
            if(check){
            System.out.println("Enter Your Name");
            name = scan.next();
            acn = (int)(Math.random() * 99999999);
            account1 = new Account(name,acn,0);
            System.out.println("Your Account Number is : "+acn);
            System.out.println("Balance : O$");
            check = false;
            }
            else{
                System.out.println("Account Already Exist");
            }
            break;
        case 2:
            if(!check){
            System.out.println("Enter Deposit Amount: ");
            int amount = scan.nextInt();
            account1.deposit(amount);

            }else{
                System.out.println("Account Not Exist");
            }
            break;
        case 3:
            if (!check) {
                System.out.println("Enter Withdraw Amount: ");
                int amount2 = scan.nextInt();
                account1.Withdraw(amount2);
            } else {
                System.out.println("Account Not Exist");
            }
            break;

        case 4:
            account1.check();
            break;
        case 5:
            System.out.println("Thanks for using OUR ATM");
            System.exit(0);
        default:
            System.out.println("Please Choose Correct Option");
            break;
    }
}while(true);
    }
}