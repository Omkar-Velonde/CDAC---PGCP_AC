//Omkar Velonde
//CDAC KHARGHAR PGCP_AC
//Problem4: User Input for Positive Numbers (Using do-while Loop)
import java.util.Scanner;
class Problem4{
  int askForPositiveNumber(){
    Scanner sc = new Scanner(System.in);
    int i=0;
    do{
    System.out.println("Enter a positive number: ");
    int num=sc.nextInt();
      if(num>0){
        System.out.println("You entered a positive number: "+num);
        break;
      }
      else{
        i++;
      }
    }while(i<100);
    return 0;
  }
  public static void main(String[] args){
    Problem4 p4 = new Problem4();
    p4.askForPositiveNumber();
  }
}