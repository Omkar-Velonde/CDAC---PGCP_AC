//Omkar Velonde
//CDAC KHARGHAR PGCP_AC
//Problem5: Print Multiplication Table (Using for Loop)
import java.util.Scanner;
class Problem5{
  int printMultiplicationTable(int number){
    for(int i=1; i<=10;i++){
      System.out.println(number+"x"+i+"="+number*i);
    }
    return 0;
  }
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a number for multiplication table: ");
    int number=sc.nextInt();
    Problem5 p5 = new Problem5();
    p5.printMultiplicationTable(number);
  }
}