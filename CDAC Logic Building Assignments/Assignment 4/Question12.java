//Omkar Velonde
//CDAC KHARGHAR PGCP_AC
//Question 12: Sort an Array in Ascending Order

import java.util.Arrays;
import java.util.Scanner;
class Question12{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int arr[]=new int[5];
    
    System.out.println("Enter a 5 numbers: ");
    for(int i=0; i<5; i++){
        arr[i]=sc.nextInt();
      
    }
    Arrays.sort(arr);
    System.out.println("Sorted array: ");
    for(int i=0; i<arr.length; i++){
      System.out.print(arr[i]);
    }
    
  }
}