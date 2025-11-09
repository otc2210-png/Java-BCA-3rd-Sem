class FRUIT {
    private String color;
    private String taste;
    private int price;

    FRUIT(){
        color = "Unknown";
        taste = "Unknown";
        price = 0;
    }
    FRUIT(String c){
        color = c;
        taste = "Unknown";
        price = 0;
    }
    FRUIT(String t, int p) {
        color = "Unknown";
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
public class w8_4 {
    public static void main(String[] args) {
        FRUIT apple = new FRUIT();
        apple.display();

        FRUIT orange = new FRUIT("Orange");
        orange.display();

        FRUIT lemon = new FRUIT("Sour", 120);
        lemon.display();
    }
}
