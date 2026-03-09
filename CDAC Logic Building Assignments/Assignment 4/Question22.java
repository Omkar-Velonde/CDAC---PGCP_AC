//Omkar Velonde
//CDAC KHARGHAR PGCP_AC
//Question 22: Write a program to print the following pattern
class Question22{
  public static void main(String[] args){
     int n=6;
     for(int i = 1; i<=6 ; i++){
       for(int j = 1; j<=6; j++){
         
         if(i==1 || i==6 || j==1 || j==6){
           System.out.print("*");       
         }
         else{
           System.out.print(" ");
         }
       }
       System.out.println();
    }

  }
}