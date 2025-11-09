class Account {
    int Id;
    String Account_holder_name;
    String Address;
    int balance;

    Account(int Id, String Account_holder_name, String Address, int balance) {
        this.Id=Id;
        this.Account_holder_name=Account_holder_name;
        this.Address=Address;
        this.balance=balance;
    }
    void display(){
        System.out.println("Account Id: "+Id);
        System.out.println("Account holder: "+Account_holder_name);
        System.out.println("Address of holder: "+Address);
        System.out.println("Balance: "+balance);
        System.out.println();
    }
    void deposit(int amount) {
        balance+= amount;
        System.out.println("New Balance: "+balance+" ; Amount deposited: "+amount);
    }
    void withdraw(int amount) {
        balance-= amount;
        System.out.println("New Balance: "+balance+" ; Amount withdrawn: "+amount);
    }
    static double calculateSimpleInterest(int balance, double rate, double time) {
        return (balance*rate*time)/100.0;
    }
    static double calculateCompoundInterest(int balance, double rate, double time) {
       return balance*Math.pow(1+rate/100, time)-balance;
    }
}
public class w9_3 {
    public static void main(String[] args) {
        Account x = new Account(210, "ABC", "Delhi", 250000);
        x.display();
        x.deposit(500);
        x.withdraw(350);
        
        double rate = 12.4;
        double time = 5;
         
        double SI = Account.calculateSimpleInterest(x.balance, rate, time );
        double CI = Account.calculateCompoundInterest(x.balance, rate, time);

        System.out.println("Simple Interest: "+SI);
        System.out.println("Compound Interest: "+CI);
    }
}