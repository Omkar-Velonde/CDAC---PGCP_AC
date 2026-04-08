import java.util.Scanner;

class Q26ArmstrongNumber {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int num = sc.nextInt();

    int orignum = num;
    int temp = num;
    int count = 0;

    while (temp > 0) {
      count++;
      temp = temp / 10;
    }

    temp = num;
    int sum = 0;

    while (temp > 0) {
      int digit = temp % 10;

      int power = 1;
      for (int i = 1; i <= count; i++) {
         power = power * digit;             
      }

      sum = sum + power;
      temp = temp / 10;
    }

    if (sum == orignum) {
      System.out.println(orignum + " is an Armstrong Number");
    } 
    else {
      System.out.println(orignum + " is not an Armstrong Number");
    }

    }
}