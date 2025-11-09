public class w6_4 {
    public static void main(String[] args) {
        int[] a = {4, 8, 2, 11, 3, 7};
        int largest = a[0];
        int smallest = a[0];

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
        System.out.println();
        for (int i = 0; i < a.length; i++) {
            if (a[i]>largest) {
                largest = a[i];
            }
            if (a[i]<smallest) {
                smallest = a[i];
            }
        }
        System.out.println("Largest element in array = "+largest);
        System.out.println("Smallest element in array = "+smallest);
    }
}
