public class w4_2 {
    public static void main(String[] args) {
        int a = 5, b = 7, c = 3;
        System.out.println("a = "+a+", b = "+b+", c = "+c);

        if (a>b && a>c) {
            System.out.println("'a' is the largest number");
        }
        else if (b>c) {
            System.out.println("'b' is the largest number");
        }
        else 
            System.out.println("c is the largest number");
    }
}
