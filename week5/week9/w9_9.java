class MathOperations {
    static int findGCD (int a, int b) {
        if (a%b==0) {
            return b;
        }
        else {
            return findGCD(b, a/b);
        }
    }
    static int findLCM (int a, int b) {
        return (a*b)/findGCD(a,b);
    }
}
public class w9_9 {
    public static void main (String[] args) {
        int n1 = 48;
        int n2 = 20;

        int gcd = MathOperations.findGCD(n1,n2);
        int lcm = MathOperations.findLCM(n1,n2);

        System.out.println("GCD of "+n1+" and "+n2+" is: "+gcd);
        System.out.println("LCM of "+n1+" and "+n2+" is: "+lcm);
    }
}