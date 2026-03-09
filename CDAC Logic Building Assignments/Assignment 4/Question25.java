//Omkar Velonde
//CDAC KHARGHAR PGCP_AC
//Question 25: Count Vowels in a String
import java.util.Scanner;
class Question25{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a string: ");
    String str=sc.nextLine();

    int count=0;
    str=str.toLowerCase();
    for(int i=0; i<str.length(); i++){
      char ch=str.charAt(i);
      if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
        count++;
      }
    }
    System.out.println("The number of vowels in "+str+" is: "+count);
  }
}