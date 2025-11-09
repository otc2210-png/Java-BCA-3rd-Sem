interface Bike {
    void offer();
    default void details() {
        System.out.println("Bike: Awesome design, Great power, new gen features");
    }
}
interface Scooty {
    void offer();
    default void details() {
        System.out.println("Scooty: Lightweight, good fuel efficiency, storage compartment");
    }
}
class BuySomething implements Bike, Scooty {
    @Override
    public void offer() {
        System.out.println("10% off on Festive Sale");
    }
    @Override
    public void details() {
        Bike.super.details();
        System.out.println();
        Scooty.super.details();
    }
}
public class w11_3 {
    public static void main(String[] args) {
        BuySomething buy = new BuySomething();
        buy.details();
        System.out.println();
        buy.offer();   
    }
}
