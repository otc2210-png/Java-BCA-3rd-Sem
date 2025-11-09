abstract class Appliance {
    String brand;
    int power;

    Appliance(String brand, int power) {
        this.brand=brand;
        this.power=power;
    }
    abstract void turnOn();
    abstract void turnOff();

    void display() {
        System.out.println("Brand: "+brand);
        System.out.println("Power consumption: "+power+"Wh");
    }
}
class WashingMachine extends Appliance {
    WashingMachine(String brand, int power){
        super(brand, power);
    }
      void turnOn() {
          System.out.println("Washing machine is 'On'");
      }
      void turnOff() {
          System.out.println("Washing machine is 'Off'");
      }
}
class Refrigerator extends Appliance {
    Refrigerator(String brand, int power){
        super(brand, power);
    }
    void turnOn() {
        System.out.println("Refrigerator is 'On'");
    }
    void turnOff() {
        System.out.println("Refrigerator is 'Off'");
    }
}
public class w9_8 {
    public static void main(String[] args) {
        WashingMachine w = new WashingMachine("LG", 1500);
        w.display();
        w.turnOn();
        w.turnOff();
        System.out.println();
        Refrigerator r = new Refrigerator("Samsung", 500);
        r.display();
        r.turnOn();
        r.turnOff();
    }
}