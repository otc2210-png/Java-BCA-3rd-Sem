import java.io.IOException;
import java.util.Scanner;

public class w12_2 {
    static void third() throws IOException{
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a positive number: ");
        int n = s.nextInt();
        s.close();
        if (n<0) {
            throw new IOException("No negative number");
        }
    }
    static void second() throws IOException{
        third();
    }
    static void first() {
        try {
            second();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
    public static void main(String[] args) {
        first();
    }
}
