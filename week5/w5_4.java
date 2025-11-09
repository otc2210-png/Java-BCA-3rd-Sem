import java.util.Scanner;

public class w5_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of 'n' for the series: ");
        int n = sc.nextInt();
        double sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += 1.0/i;
        }
        System.out.println("The sum of the series 1+1/2+...+1/"+n+" = "+sum);
        sc.close();
    }
}
