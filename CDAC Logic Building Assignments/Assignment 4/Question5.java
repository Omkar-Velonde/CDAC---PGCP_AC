//Omkar Velonde
//CDAC KHARGHAR PGCP_AC
//Question 5: Sum of Odd Numbers between 1 and N

import java.util.Scanner;
class Question5{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number: ");
    int n = sc.nextInt();
    int sum=0;
    for(int i=1; i<=n; i++){
      if(i%2!=0){
        sum=sum+i;
      }
    }
    System.out.println(sum);
  }
}