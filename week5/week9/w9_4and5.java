abstract class Account {
    int Id;
    String Account_holder_name;
    String Address;

    Account(int Id,String Account_holder_name,String Address) {
        this.Id=Id;
        this.Account_holder_name=Account_holder_name;
        this.Address=Address;
    }
    abstract void deposit(int amount);

    abstract void withdraw(int amount);
}
class Saving extends Account {
    int min_balance;

    Saving(int Id,String Account_holder_name,String Address, int min_balance) {
        super(Id, Account_holder_name, Address);
        this.min_balance=min_balance;
    }
    void deposit(int amount) {
        min_balance+= amount;
        System.out.println("New Balance: "+min_balance+" ; Amount deposited: "+amount);
    }
    void withdraw(int amount) {
        min_balance-= amount;
        System.out.println("New Balance: "+min_balance+" ; Amount withdrawn: "+amount);
    }
    void display() {
        System.out.println("Savings Account");
        System.out.println("Account Id: "+Id);
        System.out.println("Account holder: "+Account_holder_name);
        System.out.println("Address of holder: "+Address);
        System.out.println("Minimum Balance: "+min_balance);
        System.out.println();
    }
}
class Current extends Account {
    int max_withdraw_limit;

    Current(int Id,String Account_holder_name,String Address,int max_withdraw_limit) {
        super(Id, Account_holder_name, Address);
        this.max_withdraw_limit=max_withdraw_limit;
    }
    void deposit(int amount) {
        System.out.println("Amount "+amount+" deposited in the account");
    }
    void withdraw(int amount) {
        System.out.println("Amount "+amount+" withdrawn from the account");
    }
    void display() {
        System.out.println("Current Account");
        System.out.println("Account Id: "+Id);
        System.out.println("Account holder: "+Account_holder_name);
        System.out.println("Address of holder: "+Address);
        System.out.println("Maximum withdraw limit: "+max_withdraw_limit);
        System.out.println();
    }
}
public class w9_4 {
    public static void main(String[] args) {
        Saving saveAcc = new Saving(362, "XYZ","Mumbai", 30000);
        saveAcc.display();
        saveAcc.deposit(500);
        saveAcc.withdraw(700);
        System.out.println();
        Current currAcc = new Current(520, "ABC", "Hyderabad", 50000);
        currAcc.display();
        currAcc.deposit(700);
        currAcc.withdraw(350);
    }
}
