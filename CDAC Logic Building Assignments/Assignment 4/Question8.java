//Omkar Velonde
//CDAC KHARGHAR PGCP_AC
//Question 8: Print All Names in a String Array

import java.util.Scanner;
class Question8{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    String arr[]=new String[4];
    
    System.out.println("Enter a 4 names: ");
    for(int i=0; i<4; i++){
        arr[i]=sc.nextLine();
      
    }
    System.out.println("Output");
    for(int i=0; i<4; i++){
        System.out.print(arr[i]+" ");
      System.out.println();
    }
  }
}