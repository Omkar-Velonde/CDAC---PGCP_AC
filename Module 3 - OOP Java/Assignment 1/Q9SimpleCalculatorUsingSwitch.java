import java.util.Scanner;
class  Q9SimpleCalculatorUsingSwitch{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter first number: ");
    int num1= sc.nextInt();
    System.out.print("Enter second number: ");
    int num2= sc.nextInt();
    
    System.out.print("Enter choice(+,-,*,/): ");
    String a=sc.next();
    char choice = a.charAt(0);
    switch(choice){
      case '+' :
        System.out.println("Addition: "+ (num1+num2)); 
        break;
      case '-' :
        System.out.println("Subtraction: "+(num1-num2));
        break;
      case '*' :
        System.out.println("Multiplication: "+(num1*num2));
        break;
      case '/' :
        System.out.println("Division: "+(num1/num2));
        break;
      default:
        System.out.println("Plz enter valid input.");
    }
    
    
  }
}