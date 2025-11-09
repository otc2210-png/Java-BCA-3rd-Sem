import java.util.Scanner;
public class w6_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of terms to print of Fibonacci series:");
        int n = sc.nextInt();

        if (n<=0) {
            System.out.println("Please enter positive number!");
        }
        else {
            int first = 0, sec = 1;
            for (int i = 1; i <= n; i++) {
                System.out.print(first+" ");
                int next = first+sec;
                first = sec;
                sec = next;
            }
        }
        sc.close();
    }
}
