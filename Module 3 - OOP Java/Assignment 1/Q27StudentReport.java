import java.util.Scanner;
class Q27StudentReport{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter marks for 5 subjects: ");
    double mark1=sc.nextDouble();
    double mark2=sc.nextDouble();
    double mark3=sc.nextDouble();
    double mark4=sc.nextDouble();
    double mark5=sc.nextDouble();
    double total=mark1+mark2+mark3+mark4+mark5;
    double percentage = total/5;
    System.out.println("Total Marks: "+total);
    System.out.println("Percentage: "+percentage);
    if(percentage>90){
      System.out.println("Grade: A");
    }
    else if(percentage>70 && percentage<=90){
      System.out.println("Grade: B");
    }
    else if(percentage>=45 && percentage<=70){
      System.out.println("Grade: C");
    }
    else if(percentage<45){
      System.out.println("Grade: Fail");
    }

  }
}