//Omkar Velonde
//CDAC KHARGHAR PGCP-AC
//Problem3: Days of week using switch statement
import java.util.Scanner;

class Problem3{
  public static void main(String[] args){
    Scanner scanner=new Scanner(System.in);
    //int day = 3;
    System.out.println("Enter day(1-7)");
    int day = scanner.nextInt();
    switch(day){
      case 1:
        System.out.println("The day is Monday.");
        break;
      case 2:
        System.out.println("The day is Tuesday.");
        break;
      case 3:
        System.out.println("The day is Wednesday.");
        break;
      case 4:
        System.out.println("The day is Thursday.");
        break;
      case 5:
        System.out.println("The day is Friday.");
        break;
      case 6:
        System.out.println("The day is Saturday.");
        break;
      case 7:
        System.out.println("The day is Sunday.");
        break;
      default:
        System.out.println("Invalid day number.");
    }
  }
}