//Omkar Velonde
//CDAC KHARGHAR PGCP_AC
//Question 2: Print Multiples of 3 between 1 and N

import java.util.Scanner;
class Question2{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number to print multiples of 3 number from 1 to n: ");
    int n = sc.nextInt();
    for(int i=1; i<=n; i++){
      if(i%3==0){
        System.out.println(i);
      }
    }
  }
}