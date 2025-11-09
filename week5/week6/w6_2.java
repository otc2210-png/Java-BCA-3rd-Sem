public class w6_2 {
    public static void main(String[] args) {
        int n = 13;
        boolean prime = true;
        System.out.println("n = "+n);
        for (int i = 2; i <= n/2; i++) {
            if (n%i==0) {
                prime=false;
                break;
            }
        }
        if (prime)
            System.out.println("Is Prime");
        else
            System.out.println("Not a prime");
    }
}
