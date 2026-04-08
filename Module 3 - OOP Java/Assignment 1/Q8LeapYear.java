import java.util.Scanner;

class Q8LeapYear{
  public static void main(String[] args){
    Scanner scanner=new Scanner(System.in);
    //int year = 1900;
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
}