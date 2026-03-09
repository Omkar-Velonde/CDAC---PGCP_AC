//Omkar Velonde
//CDAC KHARGHAR PGCP_AC
//Question 11: Count Positive and Negative Numbers in an Array

import java.util.Scanner;
class Question11{
  public static void main(String[] args){
    int positive=0;
    int negative=0;
    Scanner sc=new Scanner(System.in);
    int arr[]=new int[6];
    
    System.out.println("Enter a 6 numbers: ");
    for(int i=0; i<6; i++){
        arr[i]=sc.nextInt();
      
    }
    for(int i=0; i<arr.length; i++){
        if(arr[i]>0){
          positive++;
        } 
        else if(arr[i]<0){
          negative++;
        }     
    }
        System.out.println("Positive numbers: "+positive);
        System.out.println("Negative numbers: "+negative);
  }
}