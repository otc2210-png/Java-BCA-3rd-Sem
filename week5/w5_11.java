public class w5_11 {
    public static void main(String[] args) {;
        for (int i = 1; i <= 3; i++) {
            for (int j = 3; j > i ; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int l = 1; l <= 2; l++) {
            for (int m = 1; m <= l; m++) {
                System.out.print(" ");
            }
            for (int n = 2; n >= l; n--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }   
}