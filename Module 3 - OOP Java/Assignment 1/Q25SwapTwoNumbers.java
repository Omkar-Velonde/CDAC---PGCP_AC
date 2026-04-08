import java.util.Scanner;

class Q25SwapTwoNumbers {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter first number: ");
    int a = sc.nextInt();
    System.out.print("Enter second number: ");
    int b = sc.nextInt();

    System.out.println("Before Swapping: "+"a: "+a+", b: "+b);
    int p = a;
    int q = b;

    int temp;

    temp = a;
    a = b;
    b = temp;
    System.out.println("-----------------Swapping with Third veriable-----------------");
    System.out.println("a = " + a + ", b = " + b);
    System.out.println("--------------------------------------------------------------");

    System.out.println("-----------------Swapping without third veriable---------------------");
    p = p + q;
    q = p - q;
    p = p - q;
    System.out.println("a = " + p + ", b = " + q);
    System.out.println("--------------------------------------------------------------");

    }
}