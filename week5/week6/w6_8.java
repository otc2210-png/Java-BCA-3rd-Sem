public class w6_8 {
    public static void main(String[] args) {
        int[] a = {5, 7, 1, 4, 8, 3};
        int l = a[0];
        int sl = a[0];
        System.out.print("Array = ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
        for (int i = 0; i < a.length; i++) {
            if (a[i]>l) {
                sl = l;
                l = a[i];
                }
            }
        System.out.println();
        System.out.println("Largest element in array = "+l);
        System.out.println("Second largest element in array = "+sl);
    }
}