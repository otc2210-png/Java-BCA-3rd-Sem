public class w5_5 {
    public static void main(String[] args) {
        int n = 381;
        int sum = 0;
        System.out.println("n = "+n);
        while (n>0) {
            int r = n%10;
            sum += r;
            n = n/10;
        }
        System.out.println("The sum of the digits of 'n' = "+sum);
    }
}
