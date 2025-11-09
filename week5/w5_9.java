public class w5_9 {
    public static void main(String[] args) {
        int n = 1221;
        int r = 0;
        System.out.println("n = "+n);
        int k=n;
        while (k>0) {
            r = (r*10)+(k%10);
            k = k/10;
        }
        if (n==r) {
            System.out.println("'n' is a Palindrome");
        }
        else{
            System.out.println("'n' is not a palindrome");
        }
    }
}
