//Omkar Velonde
//CDAC KHARGHAR PGCP_AC
//Question 13: Check if an Array Contains a Specific Element

import java.util.Arrays;
import java.util.Scanner;
import java.util.List;

class Question13{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    Integer arr[]=new Integer[5];
    
    System.out.println("Enter a 5 numbers: ");
    for(int i=0; i<5; i++){
        arr[i]=sc.nextInt();
      
    }
    System.out.println("Enter the number to search: ");
    int search = sc.nextInt();

    List<Integer> list = Arrays.asList(arr);
    
    if(list.contains(search))   {
      System.out.println("Found");
    } 
    else{
      System.out.println("Not Found");      
    }
  }
}