import java.util.Scanner;
class InsufficientFundsException extends Exception {}
class Account {
    String acc_holder_name;
    int acc_num;
    int balance;

    Account(String acc_holder_name, int acc_num, int balance) {
        this.acc_holder_name = acc_holder_name;
        this.acc_num = acc_num;
        this.balance = balance;
    }
    void withdraw(int amount) throws InsufficientFundsException {
        if (amount>balance) {
            throw new InsufficientFundsException();
        } else {
            balance-=amount;
            System.out.println("New balance = "+balance+", amount withdrawn = "+amount);
        }
    }
    void display() {
        System.out.println("Account holder: "+acc_holder_name);
        System.out.println("Account number: "+acc_num);
        System.out.println("Balance: "+balance);
    }
}
public class w12_3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Account a = new Account("Tony", 412, 50390);
        a.display();
        try {
            System.out.println("Enter amount to withdraw: ");
            int amount = s.nextInt();
            a.withdraw(amount);
            s.close();
        } catch (InsufficientFundsException e) {
            System.out.println("Insufficient Funds");
        }
    }
}