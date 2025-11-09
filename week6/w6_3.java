public class w6_3 {
    public static void main(String[] args) {
        int[] a = {2, 7, 4, 9, 3, 5};

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
        int temp = a[0];
        a[0] = a[a.length-1];
        a[a.length-1] = temp;
        System.out.println();
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
    }
}
