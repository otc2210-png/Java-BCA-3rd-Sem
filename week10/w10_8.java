class Shape {
    void area(int side) {
       System.out.println("Side of Square: "+side);
       System.out.println("Area: "+side*side);
    }
    void area(int length, int breadth) {
        System.out.println("Length and Breadth of Rectangle: "+length+", "+breadth);
        System.out.println("Area: "+length*breadth);
    }
    void area(double radius) {
        System.out.println("Radius of Circle: "+radius);
        System.out.println("Area: "+Math.PI*radius*radius);
    }
}
public class w10_8 {
    public static void main(String[] args) {
        Shape s = new Shape();
        s.area(6);
        s.area(12, 9);
        s.area(4.1);
    }
}
