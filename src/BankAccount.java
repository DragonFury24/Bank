public class BankAccount {
    public BankAccount (String ownerName, double balance) {
        this.ownerName = ownerName;
        this.balance = balance;
    }

    private String ownerName;
    private double balance;

    public String getOwnerName() {
        return ownerName;
    }

    public double getBalance() {
        return balance;
    }

    public double deposit(double deposit) {
        balance +=deposit;
        return deposit;
    }

    public double withdraw(double withdraw) { //Withdraws specified amount from @balance and returns withdrawal amount. Returns -1 if @balance is less than withdrawal
        if (balance - withdraw < 0) {
            System.out.println("You do not have enough funds to withdraw this much.");
            System.out.println("Your balance has remained unchanged.");
            return -1;
        }
        balance -= withdraw;
        return withdraw;
    }

    public String toString() { //Returns @ownerName and @balance of BankAccount
        return "[" + ownerName.trim() + ", " + balance + "]";
    }
}
