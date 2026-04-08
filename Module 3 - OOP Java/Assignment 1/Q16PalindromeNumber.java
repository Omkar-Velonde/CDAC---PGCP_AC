import java.util.Scanner;
class Q16PalindromeNumber{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int num = sc.nextInt();
    int originalNumber = num;
    int reverseNumber = 0;
    while(originalNumber != 0)
    {
      int d = originalNumber%10;
      originalNumber /= 10;
      reverseNumber = reverseNumber * 10 + d;
    }
    if(reverseNumber == num)
    {
      System.out.println("Palindrome number.");
    }
    else{
      System.out.println("Not a palindrome number.");
    }
  }
}