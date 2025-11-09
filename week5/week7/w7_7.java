public class w7_7 {
    public static int gcd(int a, int b) {
        int k;
        do {
            k = a%b;
            a = b;
            b = k;
        } while (k>0);
        return a;
    }
    public static int gcd_rec(int a, int b) {
        if (a%b==0) {
            return b;
        }
        else {
            return gcd_rec(b, a%b);
        }
    }
    public static void main(String[] args) {
        int a = 25;
        int b = 10;

        System.out.println("GCD of "+a+" and "+b+" is: "+gcd(a, b));
        System.out.println("GCD of "+a+" and "+b+" (using recursion) is: "+gcd_rec(a, b));
    }
}
