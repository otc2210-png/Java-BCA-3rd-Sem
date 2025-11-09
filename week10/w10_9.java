class Vehicle {
    void run() {
        System.out.println("Runs");
    }
}
class Bike extends Vehicle {
    @Override
    void run() {
        System.out.println("Bike runs");
    }
}
class Car extends Vehicle {
    @Override
    void run() {
        System.out.println("Car runs");
    }
}
public class w10_9 {
    public static void main(String[] args) {
        Vehicle v1 = new Bike();
        v1.run();

        Vehicle v2 = new Car();
        v2.run();
    }
}
