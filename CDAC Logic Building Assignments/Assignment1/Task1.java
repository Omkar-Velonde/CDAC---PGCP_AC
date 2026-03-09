//Omkar Velonde
//CDAC KHARGHAR PGCP-AC
//Task 1: Check Positive Number
import java.util.Scanner;
class Task1{
  public static void main(String[] args){
    Scanner scanner=new Scanner(System.in);
    //int num=5;
    System.out.println("Enter a number: ");
    int num = scanner.nextInt();
    if(num>0){
      System.out.println("Number is Positive");
    }
    else{
      System.out.println("Number is not Positive");
    }
  }
}