//  import java.sql.Time;
import java.time.LocalTime;
 class SimpleClock extends Thread{
   public  void run(){
   LocalTime time;
        while(true)
        {
            time = LocalTime.now();
            System.out.println(" Current Time is  : " + time.getHour() + " : " + time.getMinute() + " : " + time.getSecond());
             try {
             Thread.sleep(1000);
        } catch (Exception e) {
       
        }
        }
 }
}
public class PrintTime {
    public static void main(String[] args) {
        SimpleClock sc = new SimpleClock();
        sc.start();
       
    }
}