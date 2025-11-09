class CAR {
    private String model;
    private String color;
    private int price;

    CAR() {
        this("Unknown", "Unknown");
    }
    CAR(String model) {
        this(model, "Unknown");
    }
    CAR(String model, String color) {
        this.model = model;
        this.color = color;
    }
    void setDetails(int price) {
        this.price = price;
    }
    int getDetails() {
        return price;
    }
    void display() {
        System.out.println("Model: "+model);
        System.out.println("Color: "+color);
        System.out.println("Price: "+price);
        System.out.println();
    }
}
public class w8_6 {
    public static void main(String[] args) {
        CAR c1 = new CAR();
        CAR c2 = new CAR("Swift");
        CAR c3 = new CAR("Polo", "Red");

        c1.setDetails(500000);
        c2.setDetails(700000);
        c3.setDetails(850000);

        c1.display();
        c2.display();
        c3.display();
    }
}
