class Edible {
    static class Fruit {
        static void fruitDetails() {
            System.out.println("Fruit is Apple");
        }
        void fruitPackaging() {
            System.out.println("Apples are packed in a cardboard box");
        }
    }
    static class Vegetable {
        static void vegetableDetails() {
            System.out.println("Vegetable is Potato");
        }
        void vegetablePackaging() {
            System.out.println("Potatoes are packed in a jute sack");
        }
    }
}
public class w10_2 {
    public static void main(String[] args) {
        Edible.Fruit.fruitDetails();
        Edible.Vegetable.vegetableDetails();

        Edible.Fruit f = new Edible.Fruit();
        Edible.Vegetable v = new Edible.Vegetable();

        f.fruitPackaging();
        v.vegetablePackaging();
    }
}
