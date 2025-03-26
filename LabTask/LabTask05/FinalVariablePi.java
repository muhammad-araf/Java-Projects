public class FinalVariablePi {
    public static void main(String[] args) {
        final double pi = 3.14;
        System.out.println("The value of PI is : " +pi);        
        pi = 3.20;  //The final local variable pi can not be Re-initialized.
       System.out.println(pi);
    }
}