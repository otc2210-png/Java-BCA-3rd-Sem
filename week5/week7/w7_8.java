import java.util.Arrays;

public class w7_8 {
    public static int[] array(String s) {
        int a[] = new int[150];
        for (int i = 0; i < s.length() ; i++) {
            int j = s.charAt(i);
            a[j]++;
        }
        return a;
    }
    public static void main(String[] args) {
        String s1 = "listen";
        String s2 = "silent";

        System.out.println("String A : "+s1);
        System.out.println("String B : "+s2);

        if (Arrays.equals(array(s2), array(s1))) {
            System.out.println("Strings A and B are Anagrams");
        } else {
            System.out.println("Not Anagrams");
        }
    }
}
