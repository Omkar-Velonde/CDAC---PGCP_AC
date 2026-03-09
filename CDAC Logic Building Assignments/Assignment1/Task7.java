//Omkar Velonde
//CDAC KHARGHAR PGCP-AC
//Task 7: Find the Largest of Three Numbers
import java.util.Scanner;
class Task7{
  public static void main(String[] args){
    Scanner scanner= new Scanner(System.in);
    //int a = 5;
    //int b = 15;
    //int c = 10;
    System.out.println("Enter A: ");
    int a = scanner.nextInt();
    System.out.println("Enter B: ");
    int b = scanner.nextInt();
    System.out.println("Enter C: ");
    int c = scanner.nextInt();
    if(a>b && a>c){
      System.out.println("A is Greater");
    }
    else if(b>a && b>c){
      System.out.println("B is Greater");
    }
    else{
      System.out.println("C is Greater");
    }
  }
}