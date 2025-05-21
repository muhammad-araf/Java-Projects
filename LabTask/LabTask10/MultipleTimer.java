class MiltiTimer extends Thread{
    public void run(){
        try {
            Thread.sleep(2000);
            System.out.println("This run from Run Method");
        } catch (Exception e) {
        }
    }
    public void rani(){
        try {
            Thread.sleep(6000);
            System.out.println("This run from Run Method");
        } catch (Exception e) {
        }
    }
    public void rena(){
        try {
            Thread.sleep(4000);
            System.out.println("This run from Run Method");
        } catch (Exception e) {
        }
    }
}


public class MultipleTimer{
    public static void main(String... args){
        MiltiTimer mt = new MiltiTimer();
        mt.start();

    }


}