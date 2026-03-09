//Omkar Velonde
//CDAC KHARGHAR PGCP-AC
//Task 3: Check Odd or Even Number
import java.util.Scanner;
class Task3{
  public static void main(String[] args){
    Scanner scanner=new Scanner(System.in);
    //int num=4;
    System.out.println("Enter a number");
    int num = scanner.nextInt();
    if(num%2==0){
      System.out.println("Number is Even");
    }
    else{
      System.out.println("Number is Odd");
    }
  }
}