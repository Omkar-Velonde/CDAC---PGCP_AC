//Omkar Velonde
//CDAC KHARGHAR PGCP_AC
//Question 24: Reverse a String
import java.util.Scanner;
class Question24{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a String: ");
    String str= sc.nextLine();
    
    System.out.print("Reverse String: ");
    for(int i=str.length() - 1; i>=0; i--){
      System.out.print(str.charAt(i));
    }

  }
}