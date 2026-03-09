//Omkar Velonde
//CDAC KHARGHAR PGCP_AC
//Question 17: Write a program to print the following pattern
class Question17{
  public static void main(String[] args){
     for(int i = 1; i<=5 ; i++){
       for(int j = 1; j<=i; j++){
	 System.out.print(2*j-1);
         
         if(j<i){
           System.out.print("*");
         
        }
       }
       System.out.println();
    }

  }
}