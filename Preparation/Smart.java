interface Device{
    void PowerOn();
}
interface SmartDevices extends Device{
    void connectToWifi();
}
class aa implements SmartDevices{
    public void PowerOn(){
        System.out.println("Power On........");
    }
    public void connectToWifi(){
        System.out.println("Wifi Turning On,.......");
    }
}
public class Smart{
    public static void main(String... args){
        SmartDevices s = new aa();
        s.PowerOn();
        s.connectToWifi();
    }
}