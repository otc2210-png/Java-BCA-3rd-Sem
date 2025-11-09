class FRUIT {
    private String color;
    private String taste;
    private int price;

    void setDetails(String c, String t, int p) {
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
public class w8_2 {    
    public static void main(String[] args) {
        FRUIT apple = new FRUIT();
        apple.setDetails("Red", "Sweet", 100);
        apple.display();
        
        FRUIT orange = new FRUIT();
        orange.setDetails("Orange", "Sweet n Sour", 85);
        orange.display();

        FRUIT lemon = new FRUIT();
        lemon.setDetails("Yellow", "Sour", 120);
        lemon.display();
    }
}