//Omkar Velonde
//CDAC KHARGHAR PGCP_AC
//Question 4: Print Even Numbers from 1 to N

import java.util.Scanner;
class Question4{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number: ");
    int n = sc.nextInt();
    for(int i=1; i<=n; i++){
      if(i%2==0){
        System.out.println(i);
      }
    }
  }
}