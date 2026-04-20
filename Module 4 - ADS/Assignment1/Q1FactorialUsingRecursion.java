package Assignment1;

public class Q1FactorialUsingRecursion {

  static int factorial(int a) {
    if(a <= 0){
      //System.out.println("Enter a valid number.");
      return 0;
    }
		else if (a == 1 ) {
			return 1;
		}
		else {
			return a * factorial(a-1);
		}
	
	}
  public static void main(String[] args) {
    int n = 5;
    System.out.println(Q1FactorialUsingRecursion.factorial(n));
  }
}
