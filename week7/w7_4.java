public class w7_4 {
    public static void main(String[] args) {
        String s1 = "tacocat";
        String s2 = "";
        for (int i = 0; i < s1.length(); i++) {
            char c = s1.charAt(i);
            s2 = c+s2;
        }
        System.out.println("String: "+s1);
        if (s2.equals(s1)) {
            System.out.println("string is palindrome");
        } else {
            System.out.println("not a palindrome");
        }
    }
}
