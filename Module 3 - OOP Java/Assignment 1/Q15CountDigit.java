import java.util.Scanner;
import static java.lang.Math.abs;

class Q15CountDigit{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int n = sc.nextInt();
    int count = 0;
    if (n==0){
      count = 1;
    }
    else{
      int temp = abs(n);
      while(temp!=0){
        temp/=10;
        count++;
      }
    }
    System.out.println("Count of Digits: "+count);
  }
}