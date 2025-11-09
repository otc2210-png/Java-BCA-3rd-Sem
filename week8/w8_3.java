class FRUIT {
    private String color;
    private String taste;
    private int price;

    FRUIT(String c, String t, int p) {
        color = c;
        taste = t;
        price = p;
    }
    void display() {
        System.out.println("Color of the fruit = "+color);
        System.out.println("Taste of the fruit = "+taste);
        System.out.println("Price of the fruit = Rs."+price+"/kg");
        System.out.println();
    }
}
public class w8_3 {
    public static void main(String[] args) {
        FRUIT apple = new FRUIT("Red", "Sweet", 100);
        apple.display();

        FRUIT orange = new FRUIT("Orange", "Sweet n Sour", 85);
        orange.display();

        FRUIT lemon = new FRUIT("Yellow", "Sour", 120);
        lemon.display();
    }
}