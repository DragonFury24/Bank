import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String name;
        double balance;
        String input;
        boolean exited = false;

        //Ask for name
        System.out.println("What is your name?");
        name = keyboard.nextLine();
        //Ask for initial balance
        System.out.println("What is your initial balance?");
        balance = keyboard.nextDouble();
        keyboard.nextLine();
        BankAccount bankAccount = new BankAccount(name, balance); //Create new BankAccount object
        while (!exited) {
            //Display optiona
            System.out.println();
            System.out.println("Please type in the number of the option you want to choose");
            System.out.println("1. Retrieve account information (name and balance).");
            System.out.println("2. Deposit funds.");
            System.out.println("3. Withdraw funds.");
            System.out.println("4. Exit");
            input = keyboard.nextLine();

            switch (input) {
                case "1":
                    System.out.println(bankAccount.toString());
                    break;
                case "2": //Deposit
                    System.out.println("Please input the amount you would like to deposit.");
                    bankAccount.deposit(keyboard.nextDouble());
                    keyboard.nextLine();
                    break;
                case "3": //Withdrawal
                    System.out.println("Please input the amount you would like to withdraw.");
                    bankAccount.withdraw(keyboard.nextDouble());
                    keyboard.nextLine();
                    break;
                case "4": //Exit bank
                    exited = true;
                    break;
                default:
                    System.out.println("Not a valid option. Please try again.");
            }
        }
    }

}
