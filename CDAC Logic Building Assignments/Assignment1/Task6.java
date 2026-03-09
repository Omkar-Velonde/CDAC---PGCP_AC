//Omkar Velonde
//CDAC KHARGHAR PGCP-AC
//Task 6: Print Area of a Rectangle
import java.util.Scanner;
class Task6{
  public static void main(String[] args){
    Scanner scanner=new Scanner(System.in);
    //int length = 7;
    //int width = 5;
    System.out.println("Enter the length of the Rectangle: ");
    int length = scanner.nextInt();
    System.out.println("Enter the width of the Rectangle: ");
    int width = scanner.nextInt();
    int area = length*width;
    System.out.println("Area of Rectangle is: "+ area);
  }
}