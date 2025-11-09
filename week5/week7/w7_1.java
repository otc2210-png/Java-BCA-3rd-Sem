public class w7_1 {
    public static void main(String[] args) {
        int a[] = {2, 5, 7, 12, 15, 22, 27};
        int target = 15;
        System.out.print("Array: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
        System.out.println();
        System.out.println("Target = "+target);

        int pos = binary_search(a, target);

        if (pos==-1) {
            System.out.println("Element not found");
        }
        else {
            System.out.println(target+" is at position: "+pos);
        }
    }

    public static int binary_search(int a[], int target) {
        int first = 0, last = a.length-1;
        while (first<=last) {
            int mid = (first+last)/2;
            if (a[mid]==target) {
                return mid;
            }
            else if (a[mid]<target) {
                first=mid+1;
            }
            else {
                last=mid-1;
            }
        }
        return -1;
    }
}
