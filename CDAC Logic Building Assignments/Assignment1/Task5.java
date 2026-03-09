//Omkar Velonde
//CDAC KHARGHAR PGCP-AC
//Task 5: Print Area of a Square
import java.util.Scanner;
class Task5{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter a number: ");
    int side=scanner.nextInt();
    //int side=7;
    int area=side*side;
    System.out.println("Area of Circle is: "+area);
  }
}