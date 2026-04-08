import java.util.Scanner;

public class Q16WeeklyWorkHours {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);

    int[][] hours = new int[3][];

    for (int i = 0; i < 3; i++) {
      System.out.print("Enter number of days for Employee " + (i + 1) + ": ");
      int days = sc.nextInt();

      hours[i] = new int[days];

      for (int j = 0; j < days; j++) {
        System.out.print("Enter hours for day " + (j + 1) + ": ");
        hours[i][j] = sc.nextInt();
      }
    }

    System.out.println("\nEmployee Work Hours:");

    for (int i = 0; i < hours.length; i++) {
      System.out.print("Employee " + (i + 1) + ": ");
      for (int j = 0; j < hours[i].length; j++) {
        System.out.print(hours[i][j] + " ");
      }
      System.out.println();
    }

  }
}