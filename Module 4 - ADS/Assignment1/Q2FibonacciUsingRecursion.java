package Assignment1;

public class Q2FibonacciUsingRecursion {
  static int fibonacci(int a) {
		if(a == 0 || a == 1) {
			return 1;
		}
		else {
			return(fibonacci(a-1) + fibonacci(a-2));
		}
		
	}
  public static void main(String args[]){

    int n = 5;;
    System.out.println(Q2FibonacciUsingRecursion.fibonacci(n));
  }
}
