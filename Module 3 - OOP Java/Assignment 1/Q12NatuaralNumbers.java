import java.util.Scanner;
class Q12NatuaralNumbers{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter no: ");
    int n = sc.nextInt();
    int s = 0;
    for(int i=1; i<=n; i++){
      System.out.println(i);
      s=s+i;
    }
    System.out.print("Sum: "+s);

  }
}