//Omkar Velonde
//CDAC KHARGHAR PGCP_AC
//Problem6: Calculate the Sum of Numbers from 1 to N (Using for Loop)
import java.util.Scanner;
class Problem6{
  int calculateSum(int n){
    int j=0;
    for(int i=1; i<=n; i++){
      j=j+i;
    }
    return j;
  }
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a number: ");
    int n = sc.nextInt();
    Problem6 p6 = new Problem6();
    int a =p6.calculateSum(n);
    System.out.println(a);
  }
}