import java.util.Scanner;

class Q18ExpressionEvaluator {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int a, b, c;

    System.out.print("Enter value of a: ");
    a = sc.nextInt();

    System.out.print("Enter value of b: ");
    b = sc.nextInt();

    System.out.print("Enter value of c: ");
    c = sc.nextInt();

    int result1 = (a + b) * c;
    boolean result2 = a > b && b > c;
    int result3 = a % b;

    System.out.println("\n(a + b) * c = " + result1);
    System.out.println("Addition of a and b, then multiplied by c");

    System.out.println("\na > b && b > c = " + result2);
    System.out.println("Checks if a is greater than b AND b is greater than c");

    System.out.println("\na % b = " + result3);
    System.out.println("Remainder when a is divided by b");

  }
}