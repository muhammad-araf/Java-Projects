class SimplePrinter extends Thread{
    public void run(){
        for(int i = 1;i<=5;i++){
        System.out.println("Hello From Thread");
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
            }
        }
    }
}
public class PrintEveryOneSecond{
    public static void main(String... args){
        SimplePrinter sp = new SimplePrinter();
        sp.start();

    }
}