import java.util.Scanner;
public class w4_10 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = s.nextInt();
        System.out.println("Factors:");

        for( int i=1; i<=n; i++){
            if (n%i==0) {
                System.out.println(i);
            }
        }
        s.close();
    }
}
