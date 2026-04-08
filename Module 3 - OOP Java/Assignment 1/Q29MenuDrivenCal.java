import java.util.Scanner;
class Q29MenuDrivenCal{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    loop: for(int i=0; i<100; i++){
      int num1;
      int num2;
      
      System.out.println("1. Add");
      System.out.println("2. Substract");
      System.out.println("3. Exit");
      System.out.print("Enter Choice: ");
      int choice;
      choice = sc.nextInt();
      switch(choice){
        case 1:
          System.out.print("Enter a first Number: ");
          num1 = sc.nextInt();
          System.out.print("Enter a second Number: ");
          num2 = sc.nextInt();
          System.out.println("Sum: "+(num1+num2));
          break;
        case 2:
          System.out.print("Enter a first Number: ");
          num1 = sc.nextInt();
          System.out.print("Enter a second Number: ");
          num2 = sc.nextInt();
          System.out.println("Substract: "+(num1-num2));
          break;
        case 3:
          break loop;
      }
    }
  }
}