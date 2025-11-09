public class w6_11 {
    public static void main(String[] args) {
        String str = "mississippi";
        int k = 0;
        int a[] = new int[150];
        for (int i = 0; i < str.length(); i++){
            k = str.charAt(i);
            a[k]++;
        }
        for (int j = 0; j < a.length; j++){
            if (a[j]>0) {
                System.out.println((char)j+" = "+a[j]);
            }
        }
    }
}
