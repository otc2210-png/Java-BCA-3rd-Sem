import java.util.Scanner;
public class w6_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Enter "+n+" elements in array:");
        for (int i = 0; i < a.length; i++) {
            a[i]= sc.nextInt();
        }
        System.out.print("Array = ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
        System.out.println();
        System.out.println("Enter a number to search in the array:");
        int k = sc.nextInt();
        int count=0;
        for (int i = 0; i < a.length; i++) {
            if (k==a[i]) {
                System.out.println(k+" is at position "+i);
                count++;
            }
        }
        if (count==0) {
            System.out.println("Not found");
        }
    sc.close();
    }
}
