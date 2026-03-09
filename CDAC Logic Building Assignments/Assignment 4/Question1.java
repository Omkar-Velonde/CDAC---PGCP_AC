//Omkar Velonde
//CDAC KHARGHAR PGCP_AC
//Question 1: Print Numbers from 1 to N

import java.util.Scanner;
class Question1{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number to print number from 1 to n: ");
    int n = sc.nextInt();
    for(int i=0; i<=n; i++){
      System.out.println(i);
    }
  }
}