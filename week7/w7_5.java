public class w7_5 {
    public static int factorial(int a) {
        if (a==1) {
            return 1;
        }
        else {
            return a*factorial(a-1);
        }
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println("n = "+n);
        System.out.println("Factorial = "+factorial(n));

    }
}
