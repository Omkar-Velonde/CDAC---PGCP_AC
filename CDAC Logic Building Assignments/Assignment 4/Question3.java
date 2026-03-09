//Omkar Velonde
//CDAC KHARGHAR PGCP_AC
//Question 3: Calculate the Factorial of a Number

import java.util.Scanner;
class Question3{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number for factorial: ");
    int n = sc.nextInt();
    int factorial=1;
    for(int i=1; i<=n; i++){
      factorial=factorial*i;
    }
    System.out.println(factorial);
  }
}