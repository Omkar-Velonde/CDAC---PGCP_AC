import java.util.Scanner;

class Q38NumberGuessingGame {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);

    //int num = (int)(Math.random() * 100) + 1;
    //int num = 42;  
    System.out.print("Player 1, enter number: ");
    int num = sc.nextInt();
    int guess;
    int attempts = 0;
    System.out.println("Guess the number between 1 and 100");
    do {
      System.out.print("Enter your guess: ");
      guess = sc.nextInt();
      attempts++;

      if (guess > num) {
        System.out.println("Too High!");
      } 
      else if (guess < num) {
        System.out.println("Too Low!");
      } 
      else {
        System.out.println("Correct! You guessed in " + attempts + " attempts.");
      }
    } while (guess != num);
    }
}