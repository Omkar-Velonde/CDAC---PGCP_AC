import java.util.Scanner;

class Q1ElectricityBillCalculator {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter Customer Name: ");
    String custName = sc.nextLine();
    System.out.print("Enter Consumer Number: ");
    int consumerNo = sc.nextInt();
    System.out.print("Enter Units Consumed: ");
    int units = sc.nextInt();
    double bill = 0;

    if (units <= 100) {
      bill = units * 5;
    } else if (units <= 200) {
      bill = (100 * 5) + (units - 100) * 7;
    } else {
      bill = (100 * 5) + (100 * 7) + (units - 200) * 10;
    }
    if (bill > 1500) {
      bill = bill + (bill * 0.05);
    }

    System.out.println("\n------- Electricity Bill -------");
    System.out.println("Customer Name   : " + custName);
    System.out.println("Consumer Number : " + consumerNo);
    System.out.println("Units Consumed  : " + units);
    System.out.println("Total Bill      : Rs. " + bill);

  }
}