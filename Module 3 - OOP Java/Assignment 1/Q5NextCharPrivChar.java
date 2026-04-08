import java.util.Scanner;
class Q5NextCharPrivChar{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a Character: ");
    String input = sc.next();
    char c = input.charAt(0);
    //c = 'B';
    int i = c;

    char nextCharacter = (char)(i+1);
    char previousCharacter = (char)(i-1);
    System.out.println("Character: "+c);
    System.out.println("Next Character: "+nextCharacter);
    System.out.println("Previous Character: "+previousCharacter);

  }
}