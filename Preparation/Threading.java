package Thread;

class MyThread extends Thread{
    public void run()
    {
         try {
            sleep(5000);
        } catch (Exception e) {
           
    }
        for(int i = 0; i <= 5; i++)
        {
            System.out.println(" From MyThread : " + i);
        }

       
 }
}
public class ThreadExample {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        t1.start();
         try {
            t1.sleep(5000);
        } catch (Exception e) {
           
    }
        for(int i = 0; i <= 5; i++)
        {
            System.out.println(" From Main : " + i);
        }
    }
}
