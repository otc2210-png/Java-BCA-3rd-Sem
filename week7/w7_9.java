public class w7_9 {
    public static void main(String[] args) {
        int a[]={5, 2, 7, 12, 3, 9};

        System.out.print("Array : ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
        quick_sort(0, a.length-1, a);
        System.out.println();
        System.out.print("Sorted array (using quicksort): ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
    }
    public static void quick_sort(int low, int high, int a[]){
        if (low<high) {
            int p = partition(low, high, a);

            quick_sort(low, p-1, a);
            quick_sort(p+1, high, a);
        }
    }
    public static int partition(int low, int high, int a[]){
        int pivot = a[high];
        int i = low-1;
        for (int j = low; j < high; j++) {
            if (a[j]<=pivot) {
                i++;
                int t = a[i];
                a[i]=a[j];
                a[j]=t;
            }
        }
        int t = a[i+1];
        a[i+1]=a[high];
        a[high]=t;

        return i+1;
    }
}
