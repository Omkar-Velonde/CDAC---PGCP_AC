import java.util.*;

// Interface
interface BankService {
    void deposit(double amount);
    void withdraw(double amount);
}

// Base Class
class Account {
    int accNo;
    String name;
    double balance;

    Account(int accNo, String name, String balance) {
        this.accNo = accNo;
        this.name = name;
        this.balance = Double.parseDouble(balance); // Wrapper
    }

    void displayAccountDetails() {
        System.out.println("Account No: " + accNo);
        System.out.println("Name: " + name);
    }

    String getSummary() {
        StringBuilder sb = new StringBuilder();
        sb.append("\n--- Account Summary ---\n");
        sb.append("Account No: ").append(accNo).append("\n");
        sb.append("Name: ").append(name).append("\n");
        sb.append("Balance: ").append(balance).append("\n");
        return sb.toString();
    }
}

// Savings Account
class SavingsAccount extends Account implements BankService {

    SavingsAccount(int accNo, String name, String bal) {
        super(accNo, name, bal);
    }

    public void deposit(double amount) {
        if (amount < 0) throw new RuntimeException("Invalid deposit");
        balance += amount;
    }

    // Overloaded deposit
    public void deposit(double amount, double bonus) {
        if (amount < 0 || bonus < 0) throw new RuntimeException("Invalid deposit");
        balance += amount + bonus;
    }

    public void withdraw(double amount) {
        if (amount < 0) throw new RuntimeException("Invalid withdrawal");
        if (amount > balance) throw new RuntimeException("Insufficient balance");
        balance -= amount;
    }

    // Overriding
    void displayAccountDetails() {
        super.displayAccountDetails();
        System.out.println("Type: Savings Account");
    }
}

// Current Account
class CurrentAccount extends Account implements BankService {

    CurrentAccount(int accNo, String name, String bal) {
        super(accNo, name, bal);
    }

    public void deposit(double amount) {
        if (amount < 0) throw new RuntimeException("Invalid deposit");
        balance += amount;
    }

    public void deposit(double amount, double bonus) {
        balance += amount + bonus;
    }

    public void withdraw(double amount) {
        if (amount < 0) throw new RuntimeException("Invalid withdrawal");
        if (amount > balance) throw new RuntimeException("Insufficient balance");
        balance -= amount;
    }

    void displayAccountDetails() {
        super.displayAccountDetails();
        System.out.println("Type: Current Account");
    }
}

class Q2SmartBankingSystem {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter Acc No: ");
            int accNo = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Balance (String): ");
            String bal = sc.nextLine();

            System.out.println("1.Savings 2.Current");
            int type = sc.nextInt();

            Account acc;

            if (type == 1)
                acc = new SavingsAccount(accNo, name, bal);
            else if (type == 2)
                acc = new CurrentAccount(accNo, name, bal);
            else
                throw new Exception("Invalid account type");

            // Deposit & Withdraw
            System.out.print("Deposit: ");
            double dep = sc.nextDouble();
            ((BankService) acc).deposit(dep);

            System.out.print("Withdraw: ");
            double wd = sc.nextDouble();
            ((BankService) acc).withdraw(wd);

            // Display
            acc.displayAccountDetails();
            System.out.println(acc.getSummary());

        } catch (NumberFormatException e) {
            System.out.println("Invalid numeric input!");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}