interface Account {
    void deposit(int amount);
    void withdraw(int amount);
    static void aboutBank() {
        System.out.println("'SBI'");
    }
    default void takeLoan(int amount) {
        System.out.println("Loan can't be approved!");
    }
}
class Saving implements Account {
    int balance;

    Saving(int balance) {
        this.balance = balance;
    }
    @Override
    public void deposit(int amount) {
        balance+=amount;
        System.out.println("Amount deposited(Savings Account): "+amount+", New Balance: "+balance);
    }
    @Override
    public void withdraw(int amount) {
        balance-=amount;
        System.out.println("Amount withdrawn(Savings Account): "+amount+", New Balance: "+balance);
    }
    @Override
    public void takeLoan(int amount) {
        System.out.println("Loan of amount '"+amount+"' approved with 5% interest");
    }
}
class Current implements Account {
    int balance;

    Current(int balance) {
        this.balance = balance;
    }
    @Override
    public void deposit(int amount) {
        balance+=amount;
        System.out.println("Amount deposited(Current Account): "+amount+", New Balance: "+balance);
    }
    @Override
    public void withdraw(int amount) {
        balance-=amount;
        System.out.println("Amount withdrawn(Current Account): "+amount+", New Balance: "+balance);
    }
}
public class w11_1and2 {
    public static void main(String[] args) {
        Account.aboutBank();

        Saving s =new Saving(2550000);
        s.deposit(500);
        s.withdraw(670);
        s.takeLoan(4000000);
        System.out.println();
        Current c = new Current(1725000);
        c.deposit(700);
        c.withdraw(240);
    }
}