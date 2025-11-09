public class w5_2 {
    public static void main(String[] args) {
        int[] array = {4, 8, 9, 3, 11};
        int sum = 0;
        System.out.print("Array = ");
        for( int i=0; i<array.length; i++){
            System.out.print(array[i]+" ");
            sum+=array[i];
        }
        System.out.println();
        System.out.println("Sum of array = "+sum);
    }
}
