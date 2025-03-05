package LabTask01;
class banking{
    String accountNumber = "0A122B";
    int balance = 1000;
    void update(String acc,int bal){
        accountNumber = acc;
        balance = bal;
    }
    void print(){
        System.out.println("Account Number: "+accountNumber);
        System.out.println("Account Balance: "+ balance);
    }
}
public class Bank {
    public static void main(String[] args) {
        banking b = new banking();
    b.update("0B123",2000);
    b.print();
    }
    
}
