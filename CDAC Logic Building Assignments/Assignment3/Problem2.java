//Omkar Velonde
//CDAC KHARGHAR PGCP_AC
//Problem2: Simple Age Checker (using Method)

import java.util.Scanner;
class Problem2{
  int checkAgeCategory(int age){
    if(age<=18){
      System.out.println("You are a Minor");
    }
    else if(age>=19 && age<=50){
      System.out.println("You are an Adult");      
    }
    else{
      System.out.println("You are an Senior Citizen");      
    }
    return 0;
  }
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter your age: ");
    int age= scanner.nextInt();
    Problem2 p2=new Problem2();
    p2.checkAgeCategory(age);
  }
}