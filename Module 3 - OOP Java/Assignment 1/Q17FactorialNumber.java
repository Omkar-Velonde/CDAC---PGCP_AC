import java.util.Scanner;
class Q17FactorialNumber{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number: ");
    int num = sc.nextInt();
    long fact = 1;
    if(num<0){
      System.out.println("Factorial is not defined for negative numbers.");
    }
    else{
      for(int i=1; i<=num; i++){
        fact += i;
      }
      System.out.println("Factorial of number is: "+fact);
    }
  }
}