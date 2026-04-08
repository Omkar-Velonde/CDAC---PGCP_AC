import java.util.Scanner;

class Q23EvenOddSum {
  public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.print("Enter value of N: ");
     int n = sc.nextInt();

     int evenSum = 0;
     int oddSum = 0;

     for (int i = 1; i <= n; i++) {
       if (i % 2 == 0) {
         evenSum += i;
       } 
       else {
         oddSum += i;
       }
     }

     System.out.println("Sum of Even numbers = " + evenSum);
     System.out.println("Sum of Odd numbers = " + oddSum);
    }
}