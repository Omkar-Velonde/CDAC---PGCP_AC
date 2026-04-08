class BankAccount {
  int accountNumber;
  String name;
  double balance;

  BankAccount() {
    accountNumber = 0;
    name = "Not Assigned";
    balance = 0;
  }

  BankAccount(int accNo, String n, double bal) {
    accountNumber = accNo;
    name = n;
    balance = bal;
  }

  void display() {
    System.out.println("Account No: " + accountNumber);
    System.out.println("Name: " + name);
    System.out.println("Balance: " + balance);
    System.out.println();
  }
}

class Q13BankAccountSystem {
  public static void main(String args[]) {

    BankAccount a1 = new BankAccount();
    BankAccount a2 = new BankAccount(101, "Amit", 5000);
    BankAccount a3 = new BankAccount(102, "Sneha", 8000);

    a1.display();
    a2.display();
    a3.display();
  }
}