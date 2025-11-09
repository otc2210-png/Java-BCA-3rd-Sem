public class w6_5 {
    public static void main(String[] args) {
        for (int i = 0; i <= 100; i++) {
            boolean prime = true;
            if (i<=1) {
                prime = false;
            }
            else {
                for (int j = 2; j <= i/2; j++) {
                    if (i%j==0) {
                        prime=false;
                        break;
                    }
                }
            }
            if (prime) {
                System.out.print(i+" ");
            }
        }
    }
}
