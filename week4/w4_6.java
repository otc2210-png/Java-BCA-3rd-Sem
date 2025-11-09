public class w4_6 {
    public static void main(String[] args){
        char c = 'A';
        c = Character.toLowerCase(c);
        if (c=='a'||c=='e'||c=='i'||c=='o'||c=='u') {
            System.out.println(c+" is a vowel");
        } else {
            System.out.println(c+ " is a consonant");
        }
    }
}
