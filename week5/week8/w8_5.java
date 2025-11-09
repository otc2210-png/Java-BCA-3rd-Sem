class FRUIT {
    private String color;
    private String taste;
    private int price;

    FRUIT(){
        this("Unknown", "Unknown", 0);
    }
    FRUIT(String c){
        this(c, "Unknown", 0);
    }
    FRUIT(String t, int p) {
        this("Unknown", t, p);
    }
    FRUIT(String c, String t, int p) {
        color = c;
        taste = t;
        price = p;
    }
    void display() {
        System.out.println("Color of the fruit = "+color);
        System.out.println("Taste of the fruit = "+taste);
        System.out.println("Price of the fruit = "+price+"/kg");
        System.out.println();
    }
}
public class w8_5 {
    public static void main(String[] args) {
        FRUIT apple = new FRUIT();
        apple.display();

        FRUIT orange = new FRUIT("Orange");
        orange.display();

        FRUIT lemon = new FRUIT("Sour", 120);
        lemon.display();

        FRUIT blueberry = new FRUIT("Sweet", "Blue", 300);
        blueberry.display();
    }
}
