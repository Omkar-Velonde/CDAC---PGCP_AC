import java.util.Scanner;

public class Q15StudentMarksTable {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);

    int[][] marks = new int[3][3];
    int total;
    double avg;

    for (int i = 0; i < 3; i++) {
      System.out.println("Enter marks for Student " + (i + 1));
      for (int j = 0; j < 3; j++) {
        marks[i][j] = sc.nextInt();
      }
    }

    System.out.println("\nStudent  Sub1  Sub2  Sub3  Total  Avg");

    for (int i = 0; i < 3; i++) {
      total = 0;
      for (int j = 0; j < 3; j++) {
        total += marks[i][j];
      }
      avg = total / 3.0;

      System.out.print("S" + (i + 1) + "       ");
      for (int j = 0; j < 3; j++) {
        System.out.print(marks[i][j] + "     ");
      }
      System.out.println(total + "     " + avg);
    }

  }
}