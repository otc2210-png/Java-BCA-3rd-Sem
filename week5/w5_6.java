public class w5_6 {
    public static void main(String[] args) {
        int n = 5;
        int fact = 1;
        System.out.println("n = "+n);
        while (n>0) {
            fact *= n;
            n = n-1;
        }
        System.out.println("Factorial of n = "+fact);
    }
}
