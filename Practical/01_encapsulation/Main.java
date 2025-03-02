class BankAccount{
    private String accountHolder;
    private double balance;

    // Constructor
    public BankAccount(String accountHolder, double balance){
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

     // Getter for balance
    public double getBalance(){
        return this.balance;
    }

    // Setter for balance (with validation)
    public void deposit(double amount) {
        if(amount > 0){
            this.balance += amount;
            System.out.println("Deposited: $" + amount);
        } else {
            System.out.println("Deposit amount must be positive!");
        }
    }

    // Withdraw method (controlled access)
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
        } else {
            System.out.println("Invalid withdrawal amount!");
        }
    }
}

public class Main{
    public static void main(String[] args){
        BankAccount myAccount = new BankAccount("Priyesh", 1000);

        myAccount.deposit(5456.5);
        System.out.println("Current Balance: $" + myAccount.getBalance());
        myAccount.withdraw(10500);

    }

}