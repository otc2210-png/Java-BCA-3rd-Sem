import java.util.Scanner;

class InvalidAgeException extends Exception {}

public class w12_4 {
    static void licenseAge(int age) throws InvalidAgeException {
        if (age<18) {
            throw new InvalidAgeException();
        }
        else {
            System.out.println("License approved");
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        try {
            System.out.println("Enter age for a driving license:");
            int age = s.nextInt();
            licenseAge(age);
            s.close();

        } catch (InvalidAgeException e) {
            System.out.println("Invalid age");
        }
    }
}