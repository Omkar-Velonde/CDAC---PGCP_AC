//Omkar Velonde
//CDAC KHARGHAR PGCP_AC
//Problem1: Sum of Two Numbers (Using a Method)

import java.util.Scanner;
class Problem1{
  int sumOfTwoNumbers(int a, int b){
    int sum = a+b;
    return sum;
  }
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter first number: ");
    int a= scanner.nextInt();
    System.out.println("Enter second number: ");
    int b= scanner.nextInt();
    Problem1 p = new Problem1();
    int sum1=p.sumOfTwoNumbers(a,b);
    System.out.println("The sum of "+a+" and "+b+" is "+ sum1);

  }
}