//Omkar Velonde
//CDAC KHARGHAR PGCP_AC
//Question 9: Find the Largest Element in an Array

import java.util.Arrays;
import java.util.Scanner;
class Question9{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int arr[]=new int[5];
    
    System.out.println("Enter a 5 numbers: ");
    for(int i=0; i<5; i++){
        arr[i]=sc.nextInt();
      
    }
    Arrays.sort(arr);
    System.out.println("The largest element is: " + arr[4]);
  }
}