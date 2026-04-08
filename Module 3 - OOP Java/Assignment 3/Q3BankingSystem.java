import java.util.*;

// Account Class
class Account {
    int accNo;
    String name;
    double balance;

    static int totalAccounts = 0;

    Account(int accNo, String name, double balance) {
        this.accNo = accNo;
        this.name = name;
        this.balance = balance;
        totalAccounts++;
    }

    // Deposit (Cash)
    void deposit(double amount) {
        balance += amount;
        System.out.println("Cash Deposited: " + amount);
    }

    // Deposit (Online) - Overloaded
    void deposit(double amount, String mode) {
        balance += amount;
        System.out.println("Deposited via " + mode + ": " + amount);
    }

    void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient Balance!");
        } else {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        }
    }

    void display() {
        System.out.println("\n--- Account Details ---");
        System.out.println("Account No: " + accNo);
        System.out.println("Name: " + name);
        System.out.println("Balance: " + balance);
    }
}

public class Q3BankingSystem {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Account> list = new ArrayList<>();

        System.out.print("Enter number of accounts: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details of account " + (i + 1));

            System.out.print("Account No: ");
            int accNo = sc.nextInt();
            sc.nextLine();

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Initial Balance: ");
            double bal = sc.nextDouble();

            list.add(new Account(accNo, name, bal));
        }

        // Operations
        for (Account a : list) {
            a.deposit(1000);                  // cash deposit
            a.deposit(500, "Online");         // overloaded method
            a.withdraw(700);                 // withdrawal
            a.display();
        }

        System.out.println("\nTotal Accounts: " + Account.totalAccounts);
    }
}