interface Device {
    void powerOn();
}
interface SmartDevice extends Device {
    void connectWiFi();
}
class SmartPhone implements SmartDevice {
    public void powerOn() {
        System.out.println("Press the power button to switch on the device");
    }
    public void connectWiFi() {
        System.out.println("Turn on the WiFi to connect to a nearby WiFi connection");
    }
}
public class w11_5 {
    public static void main(String[] args) {
        SmartPhone p = new SmartPhone();
        p.powerOn();
        p.connectWiFi();
    }    
}
