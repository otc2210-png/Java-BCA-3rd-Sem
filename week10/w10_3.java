class MathOp {
    static void minMaxAdd(int a, int b) {
        int min, max;
        if (a>b) {
            max = a;
            min = b;
        } else {
            max = b;
            min = a;
        }
        System.out.println("Integers: ");
        System.out.println("Maximum = "+max);
        System.out.println("Minimum = "+min);
        System.out.println("Addition = "+(a+b));
        System.out.println();
    }
    static void minMaxAdd(double a, double b) {
        double min, max;
        if (a>b) {
            max = a;
            min = b;
        } else {
            max = b;
            min = a;
        }
        System.out.println("Real numbers: ");
        System.out.println("Maximum = "+max);
        System.out.println("Minimum = "+min);
        System.out.println("Addition = "+(a+b));
        System.out.println();
    }
    static void minMaxAdd(char a, char b) {
        char min, max;
        if (a>b) {
            max = a;
            min = b;
        } else {
            max = b;
            min = a;
        }
        System.out.println("Characters: ");
        System.out.println("Maximum = "+max);
        System.out.println("Minimum = "+min);
        System.out.println("Addition (ASCII value) = "+(a+b));
        System.out.println();
    }
}
public class w10_3 {
    public static void main(String[] args) {
        MathOp.minMaxAdd(4, 9);
        MathOp.minMaxAdd(3.81, 12.17);
        MathOp.minMaxAdd('g', 'r');
    }
}
