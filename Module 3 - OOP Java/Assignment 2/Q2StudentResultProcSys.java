import java.util.Scanner;

class Q2StudentResultProcSys {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter Student Name: ");
    String name = sc.nextLine();
    System.out.print("Enter Roll Number: ");
    int roll = sc.nextInt();

    int m1, m2, m3, m4, m5;

    System.out.print("Enter marks of 5 subjects: ");
    m1 = sc.nextInt();
    m2 = sc.nextInt();
    m3 = sc.nextInt();
    m4 = sc.nextInt();
    m5 = sc.nextInt();

    int total = m1 + m2 + m3 + m4 + m5;
    double average = total / 5.0;
    double percentage = (total / 500.0) * 100;

    char grade;
    if (percentage >= 90) {
      grade = 'A';
    } else if (percentage >= 75) {
      grade = 'B';
    } else if (percentage >= 60) {
      grade = 'C';
    } else if (percentage >= 40) {
      grade = 'D';
    } else {
      grade = 'F';
    }

    System.out.println("\n------------ Student Result --------------");
    System.out.println("Name        : " + name);
    System.out.println("Roll No     : " + roll);
    System.out.println("Total       : " + total);
    System.out.println("Average     : " + average);
    System.out.println("Percentage  : " + percentage);
    System.out.println("Grade       : " + grade);

    if (percentage >= 40) {
      System.out.println("Result      : Promoted");
    } else {
      System.out.println("Result      : Not Promoted");
    }

  }
}