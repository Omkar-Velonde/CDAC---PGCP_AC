//Omkar Velonde
//CDAC KHARGHAR PGCP-AC
//Task 2: Check Negative Number
import java.util.Scanner;
class Task2{
  public static void main(String[] args){
    Scanner scanner=new Scanner(System.in);
    //int num = 5;
    System.out.println("Enter a Number: ");
    int num = scanner.nextInt();
    if(num < 0){
      System.out.println("Number is Negative");
    }
    else{
      System.out.println("Number is not Negative");
    }
  }
}