class CountDownTimer extends Thread{
    public void run(){
        for(int i = 10;i>=0;i--){
        System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
            }
        }
    }
}
public class CountDown{
    public static void main(String... args){
        CountDownTimer cd = new CountDownTimer();
        cd.start();
    }
}