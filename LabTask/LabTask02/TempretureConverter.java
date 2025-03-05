package LabTask02;
import java.util.*;
class Temp{
    private float temp;
    void celsius(float value){
        temp = value;
    }
    void setfaren(float value){
        temp = value;
    }
    void Tofaren(float value){
        float faren1 = (value*(9/5)) + 32;
        temp = faren1;
        System.out.println("tO FAREN"+faren1);
    }
    void toCel(float value){
        float cel = (value - 32)*(5/9);
        temp = cel;
        System.out.println("tO Cel"+cel);

    }
    void show(){
        System.out.println("the stored temp is "+temp);
    }
}
 public class TempretureConverter {
    public static void main(String[] args){
        Temp tem = new Temp();
        int choice;
        System.out.println("1. Store to celsius");
        System.out.println("2. Store to Faren");
        System.out.println("3. Convert to Faren");
        System.out.println("4. Convert to Cel");
        System.out.println("5. Show Temp");
        Scanner scan = new Scanner(System.in);
        choice = scan.nextInt();
       switch(choice){
        case 1:
        tem.celsius(52);
        break;
        case 2:
        tem.setfaren(43);
        break;
        case 3:
        tem.Tofaren(100);
        break;
        case 4:
        tem.toCel(12);
        break;
        case 5:
        tem.show();
        break;
        default:
        System.out.println("Invalid");
        break;
       }
    }

}
