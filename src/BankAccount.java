public class BankAccount {
    public BankAccount (String ownerName, double balance) {
        this.ownerName = ownerName;
        this.balance = balance;
    }

    private String ownerName;
    private double balance;

    //return owner name
    public String getOwnerName() {
        return ownerName;
    }

    //return balance
    public double getBalance() {
        return balance;
    }

    public double deposit(double deposit) {
        balance +=deposit; //Add deposit amount to balance
        return deposit;
    }

    public double withdraw(double withdraw) { //Withdraws specified amount from @balance and returns withdrawal amount. Returns -1 if @balance is less than withdrawal

        if (balance - withdraw < 0) {
            System.out.println("You do not have enough funds to withdraw this much.");
            System.out.println("Your balance has remained unchanged.");
            return -1;
        }
        balance -= withdraw; //subtract withdrawal amount from the balance
        return withdraw; //returns the amount withdrawed
    }

    public String toString() { //Returns @ownerName and @balance of BankAccount
        return "[" + ownerName.trim() + ", " + "$" + balance + "]"; //return name and balance
    }
}
