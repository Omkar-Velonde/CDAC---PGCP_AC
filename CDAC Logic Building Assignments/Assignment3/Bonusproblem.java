//Omkar Velonde
//CDAC KHARGHAR PGCP_AC
//Bonus Problem: Menu-Driven Java Program (Switch-Case)
import java.util.Scanner;
class Bonusproblem{

  //Grading System
  void gradingSystem(){
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

  //Leap Year
  void leapYear(){
    Scanner scanner=new Scanner(System.in);
    System.out.println("Enter a year to find if it is leap year or not: ");
    int year = scanner.nextInt();

    int div_year_by_4 = year%4;
    int div_year_by_100 = year%100;
    int div_year_by_400 = year%400;
    if((div_year_by_4 == 0 && div_year_by_100 != 0) || div_year_by_400 == 0){
      System.out.println(year+" is a leap year.");
    }
    else{
      System.out.println(year+" is not a leap year");
    }
  }

  //Day of the week
  void day(){
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

  //Identify default values of variables
  void var(){
    byte a = 10;
    short b = 100;
    int c = 10000;
    long d = 145678;
    float e = 123.123f;
    double f = 12345.12345;
    char g = 'a';
    boolean h = true;

    //Printing values of all variables
    System.out.println("Value of byte is "+a);
    System.out.println("Value of short is "+b);
    System.out.println("Value of int is "+c);
    System.out.println("Value of long is "+d);
    System.out.println("Value of float is "+e);
    System.out.println("Value of double is "+f);
    System.out.println("Value of char is "+g);
    System.out.println("Value of boolean is "+h);
  }

  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    Bonusproblem pr = new Bonusproblem();
    for(;;){      //for loop to return to the menu
    System.out.println();
    System.out.println();
    System.out.println("Select Problem ");
    System.out.println("Problem 1: Grade Evaluation System");
    System.out.println("Problem 2: Leap Year Check");
    System.out.println("Problem 3: Day of the week");
    System.out.println("Problem 4: Identify Default Values of Variables");
    System.out.println("Problem 5: Exit");

    System.out.println("Enter a problem number: ");
    int n = sc.nextInt();
    switch(n){
      case 1:
        pr.gradingSystem();
        break;
      case 2:
        pr.leapYear();
        break;
      case 3:
        pr.day();
        break;
      case 4:
        pr.var();
        break;
      case 5:
        return;
    }
    }
  }
}