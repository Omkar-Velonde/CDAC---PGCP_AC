import java.util.Scanner;
class Q28VotingEligibility{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter your Age: ");
    int age=sc.nextInt();
    if(age>=18){
      System.out.println("Eligible for voting.");
    }
    else{
      System.out.println("Not eligible for voting.");
    }
  }
}