import java.util.Scanner;
class Q6PositiveNegatine{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number to check whether the number is positive or negative: ");
    int num = sc.nextInt();
    if(num>0){
      System.out.println("Number is positive.");
    }
    else if(num<0){
      System.out.println("Number is negative.");
    }
    else{
      System.out.println("Number is zero.");
    }
  }


}