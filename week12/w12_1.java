public class w12_1 {
    static int division(int n, int d) {
        return n/d;
    }
    public static void main(String[] args) {
        int n = 10;
        for (int i = -2; i <= 2; i++) {
            try {
                System.out.println(n+" divided by "+i+" = "+division(n, i));
            } catch (ArithmeticException e) {
                System.out.println("Exception: Cannot be divided by zero");
            }
        }
    }
}
