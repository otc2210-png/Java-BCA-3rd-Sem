class FRUIT {
    String color;
    String taste;
    int price;

    void display() {
        System.out.println("Color of the fruit = "+color);
        System.out.println("Taste of the fruit = "+taste);
        System.out.println("Price of the fruit = Rs."+price+"/kg");
        System.out.println();
    }
}
public class w8_1 {
    public static void main(String[] args) {
        FRUIT apple = new FRUIT();
        apple.color = "Red";
        apple.taste = "Sweet";
        apple.price = 100;
        apple.display();

        FRUIT orange = new FRUIT();
        orange.color = "Orange";
        orange.taste = "Sweet n Sour";
        orange.price = 85;
        orange.display();

        FRUIT lemon = new FRUIT();
        lemon.color = "Yellow";
        lemon.taste = "Sour";
        lemon.price = 120;
        lemon.display();
    }
}
