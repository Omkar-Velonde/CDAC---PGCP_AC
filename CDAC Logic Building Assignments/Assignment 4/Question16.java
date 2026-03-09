//Omkar Velonde
//CDAC KHARGHAR PGCP_AC
//Question 16: Write a program to print the following pattern
class Question16{
  public static void main(String[] args){
     for(int i = 1; i<6 ; i++){
       for(int j = 1; j<=i; j++){
	 System.out.print(j);
         if(j<i){
           System.out.print("*");
         }
       }
       System.out.println();
    }

  }
}