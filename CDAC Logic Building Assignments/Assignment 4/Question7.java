//Omkar Velonde
//CDAC KHARGHAR PGCP_AC
//Question 7: Find the Sum of All Elements in an Array

import java.util.Scanner;
class Question7{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int arr[]=new int[5];
    
    System.out.println("Enter a 5 numbers: ");
    for(int i=0; i<5; i++){
        arr[i]=sc.nextInt();
      
    }

    int sum=0;
    for(int i=0; i<5; i++){
        sum=sum+arr[i];      
    }
    System.out.print("Sum of Array elements: "+sum);
  }
}