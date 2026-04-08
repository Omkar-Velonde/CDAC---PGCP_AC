import java.util.Scanner;
class Q10CheckVowel{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a character: ");
    String a = sc.next();
    char b = a.charAt(0);
    if(b=='a'|| b=='e' || b=='i' || b=='o' ||b=='u'){
      System.out.println("Character is Vowel.");
    }
    else{
      System.out.println("Character is consonent.");
    }
  }
}