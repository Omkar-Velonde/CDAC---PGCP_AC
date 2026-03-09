//Omkar Velonde
//CDAC KHARGHAR PGCP_AC
//Question 26: Check if a String is a Palindrome
import java.util.Scanner;
class Question26{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a string: ");
    String str=sc.nextLine();
    str = str.toLowerCase();
    
    String reversed="";
    for(int i = str.length()-1; i>=0; i--){
      reversed += str.charAt(i);
    }
    if(str.equals(reversed)){
      System.out.println("The string "+ str+ " is a palindrome.");
    }
    else{
      System.out.println("The string "+str+" is not palindrome.");
    }
  }
}