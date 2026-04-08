
/*
Omkar Velonde
4. Write a program to find ASCII value of a character.
*/
import java.util.Scanner;

public class Q4CharacterASCIIValue {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Enter charater to find ASCII value: ");

    //int b = 'A';
    String input = sc.next();
    char a = input.charAt(0);
    int b = a;
    System.out.println("ASCII value of A is= "+b);
  }
}
