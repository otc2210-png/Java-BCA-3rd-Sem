public class w7_6 {
    public static void fib(int a) {
        int first=0, sec=1;
        for (int i = 0; i <= a; i++) {
            System.out.print(first+" ");;
            int third = first+sec;
            first=sec;
            sec=third;
        }
    }
    public static int fib_rec(int b) {
        if (b==0) {
            return 0;
        }
        else if (b==1) {
            return 1;
        }
        else {
            return fib_rec(b-1)+fib_rec(b-2);
        }
    }
    public static void main(String[] args) {
        int n = 8;
        System.out.println("n = "+n);
        if (n<=0) {
            System.out.println("Enter positive number");
        }
        else {
            System.out.print("Fibonacci series: ");
            fib(n);
            System.out.println();
            System.out.print("Fibonacci series(using recursion): ");
            for (int i = 0; i <= n; i++) {
                System.out.print(fib_rec(i)+" ");
            }
        }
    }
}
