class Shape {
    void area() {
        System.out.println("Area is not defined!");
    }
}
class Rectangle extends Shape {
    int length;
    int breadth;

    Rectangle(int length, int breadth) {
        this.length=length;
        this.breadth=breadth;
    }
    void area() {
        System.out.println("Area of rectangle = "+length*breadth);
    }
}
class Circle extends Shape {
    int radius;

    Circle(int radius) {
        this.radius=radius;
    }
    void area() {
        System.out.println("Area of Circle = "+Math.PI*radius*radius);
    }
}
public class w9_6 {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(14, 9);
        r.area();

        Circle c = new Circle(11);
        c.area();
    }
}
