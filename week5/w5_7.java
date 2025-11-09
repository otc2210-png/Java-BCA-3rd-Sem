public class w5_7 {
    public static void main(String[] args) {
        int[] array = {4, 7, 8, 5, 12, 9};
        int big = array[0];
        System.out.print("Array = ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }
        for (int j = 0; j < array.length; j++) {
            if (array[j]>big) 
                big = array[j];
        }
        System.out.println();
        System.out.println("Largest element in the array = "+big);
    }
}
