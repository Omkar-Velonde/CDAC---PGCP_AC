//Omkar Velonde
//CDAC KHARGHAR PGCP_AC
//Question 14: Find the Index of an Element in an Array

import java.util.Arrays;
import java.util.Scanner;
import java.util.List;

class Question14{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int arr[]=new int[5];
    
    System.out.println("Enter a 5 numbers: ");
    for(int i=0; i<5; i++){
        arr[i]=sc.nextInt();
      
    }
    Arrays.sort(arr);

    System.out.println("Enter the number to search: ");
    int search = sc.nextInt();

    int index = Arrays.binarySearch(arr, search);

    if(index >= 0) {
        System.out.println("The number " + search + " is found at index " + index);
    } 
    else {
        System.out.println("Not Found");
    }
  }
}