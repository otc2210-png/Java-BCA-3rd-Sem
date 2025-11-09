import java.util.Scanner;
public class w4_4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter limit of series:");
        int n = s.nextInt();
        int sum = 0;

        for( int i=1; i<=n; i++){
            sum+=i;
        }
        System.out.println("The sum of series 1+2+3+4+....+"+n+" = "+sum);
        s.close();
    }    
}
