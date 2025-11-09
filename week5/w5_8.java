public class w5_8 {
    public static void main(String[] args) {
        
        int k = 361;
        int l = 0;
        System.out.println("k = "+k);
        while (k>0) {
            l = (l*10)+(k%10);
            k = k/10;
        }
        System.out.println("Reverse of k = "+l);
    }
}
