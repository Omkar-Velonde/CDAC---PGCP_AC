import java.util.Scanner;

class Q3ATMSimulation {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);

    double balance = 1000; 
    int choice;

    do {
      System.out.println("\n------------------ ATM MENU ----------------");
      System.out.println("1. Check Balance");
      System.out.println("2. Deposit Money");
      System.out.println("3. Withdraw Money");
      System.out.println("4. Exit");
      System.out.print("Enter your choice: ");
      
      choice = sc.nextInt();

      switch (choice) {
        case 1:
          System.out.println("Balance: Rs. " + balance);
          break;

        case 2:
          System.out.print("Enter amount to deposit: ");
          double deposit = sc.nextDouble();
          balance = balance + deposit;
          System.out.println("Amount Deposited!");
          break;

        case 3:
          System.out.print("Enter amount to withdraw: ");
          double withdraw = sc.nextDouble();

          if (withdraw <= balance) {
            balance = balance - withdraw;
          } else {
            System.out.println("Insufficient Balance!");
          }
          break;

        case 4:
          break;

        default:
          System.out.println("Invalid choice!");
      }

    } while (choice != 4);

  }
}