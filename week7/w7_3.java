public class w7_3 {
    public static void main(String[] args) {
        String s1 = "computer";
        String s2 = "";
        for (int i = 0; i < s1.length(); i++) {
            char c = s1.charAt(i);
            s2 = c+s2;
        }
        System.out.println("String: "+s1);
        System.out.println("Reversed string: "+s2);
    }
}
