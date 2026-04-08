import java.util.Scanner;

class Q9DailyExpenseTracker {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);

    double[] expenses = new double[7];
    String[] days = {"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};

    double total = 0;

    for (int i = 0; i < 7; i++) {
      System.out.print("Enter expense for " + days[i] + ": ");
      expenses[i] = sc.nextDouble();
      total += expenses[i];
    }

    double avg = total / 7;

    double highest = expenses[0];
    double lowest = expenses[0];
    int highDay = 0;

    for (int i = 1; i < 7; i++) {
      if (expenses[i] > highest) {
        highest = expenses[i];
        highDay = i;
      }
      if (expenses[i] < lowest) {
        lowest = expenses[i];
      }
    }

    System.out.println("\n===== REPORT =====");
    System.out.println("Total Expense: " + total);
    System.out.println("Average Expense: " + avg);
    System.out.println("Highest Expense: " + highest);
    System.out.println("Lowest Expense: " + lowest);
    System.out.println("Highest Expense on: " + days[highDay]);

  }
}