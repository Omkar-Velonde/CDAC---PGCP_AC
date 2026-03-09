//Omkar Velonde
//CDAC KHARGHAR PGCP-AC
//Problem 1: Grade Evaluation System
import java.util.Scanner;

class Problem1{
  public static void main(String[] args){
    //int marks_in_maths = 80;
    //int marks_in_science = 85;
    //int marks_in_history = 90;

    Scanner scanner=new Scanner(System.in);
    System.out.println("Enter your marks of Maths(out of 100): ");
    int marks_in_maths = scanner.nextInt();
    System.out.println("Enter your marks of Science(out of 100): ");
    int marks_in_science = scanner.nextInt();
    System.out.println("Enter your marks of History(out of 100): ");
    int marks_in_history = scanner.nextInt();

    int average_marks=(marks_in_maths + marks_in_science + marks_in_history)/3;

    if(average_marks >= 90){
      System.out.println("Average Marks: "+average_marks);
      System.out.println("Grade: A");
    }
    else if(average_marks >= 70 && average_marks <= 89){
      System.out.println("Average Marks: "+average_marks);
      System.out.println("Grade: B");
    }
    else if(average_marks >= 50 && average_marks <= 69){
      System.out.println("Average Marks: "+average_marks);
      System.out.println("Grade: C");
    }
    else if(average_marks >= 30 && average_marks <= 49){
      System.out.println("Average Marks: "+average_marks);
      System.out.println("Grade: B");
    }
    else if(average_marks < 30){
      System.out.println("Average Marks: "+average_marks);
      System.out.println("Fail");
    }
    else{
      System.out.println("plz ener valid marks");
    }
  }
}