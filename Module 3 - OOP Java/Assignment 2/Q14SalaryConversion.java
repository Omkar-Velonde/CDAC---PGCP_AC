import java.util.Scanner;

class Q14SalaryConversion {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter Salary (double): ");
    double salary = sc.nextDouble();

    int intSalary = (int) salary;

    float floatSalary = (float) salary;

    System.out.println("\n----- Salary Conversion -----");
    System.out.println("Original (double) : " + salary);
    System.out.println("Converted (int)   : " + intSalary);
    System.out.println("Converted (float) : " + floatSalary);

    System.out.println("\nPrecision Loss:");
    System.out.println("Loss in int   : " + (salary - intSalary));
    System.out.println("Loss in float : " + (salary - floatSalary));

  }
}