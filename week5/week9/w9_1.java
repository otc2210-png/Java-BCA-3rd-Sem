class Vehicle {
    String cost;

    void cost(String cost) {
        this.cost=cost;
    }
}
class Bus extends Vehicle {
    void display() {
        System.out.println("Cost of Bus: "+cost);
        System.out.println();
    }
}
class Train extends Vehicle {
    void display() {
        System.out.println("Cost of train: "+cost);
        System.out.println();
    }
}
public class w9_1 {
    public static void main(String[] args) {
        Bus b = new Bus();
        b.cost("30 lakh");
        b.display();

        Train t = new Train();
        t.cost("40 crore");
        t.display();
    }
}
