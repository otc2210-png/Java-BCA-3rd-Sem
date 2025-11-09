import java.util.Scanner;
public class w5_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int d = sc.nextInt();
        String h="";
        while (d>0) {
            int k=d%16;
            if (k>=10 && k<=15) {
                char c= (char)('A'+k-10);
                h = c + h;
            }
            else {
                h = k+h;
            }
            d=d/16;
        }
        System.out.println("Hexadecimal equivalent = "+h);
        System.out.println("....................");
        System.out.print("Enter a hexadecimal number: ");
        String hex = sc.next();
        int dec = 0;
        int base = 1;
        for (int i = hex.length()-1; i >= 0; i--) {
            char c = hex.charAt(i);
            c=Character.toUpperCase(c);
            int value=0;
            if (c>='0' && c<='9') {
                value = c-'0';
            }
            else if (c>='A' && c<='F') {
                value = c-'A'+10;
            }
            dec+=value*base;
            base*=16;
        }
        System.out.println("Decimal equivalent = "+dec);
        sc.close();
    }
}
