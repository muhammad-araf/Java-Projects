class NumberPrinter extends Thread{
    public void run(){
    for(int i = 0;i<5;i++){
        System.out.println(i++);
    }}
}
class CharacterPrinter extends Thread{
    public void run(){
    for(char c = 'A';c<='E';c++){
        System.out.println(c);
        
    }}
}
public class PrintNumCharPrintNumChar{
    public static void main(String[] args) {
        NumberPrinter np = new NumberPrinter();
        np.start();
        CharacterPrinter cp = new CharacterPrinter();
        cp.start();
    }
}