public class w4_7 {
    public static void main(String[] args) {
        int a=6, b=10, c=3, d=8;
        System.out.println("a = "+a+", b = "+b+", c = "+c+", d = "+d);
        int smallest=a;

        if (b<smallest) {
            smallest=b;
        }
        if (c<smallest) {
            smallest=c;
        }
        if (d<smallest) {
            smallest=d;
        }
        System.out.println("Smallest number is: "+smallest);
    }
}
