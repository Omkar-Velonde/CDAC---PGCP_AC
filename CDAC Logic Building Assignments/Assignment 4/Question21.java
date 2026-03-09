//Omkar Velonde
//CDAC KHARGHAR PGCP_AC
//Question 21: Write a program to print the following pattern
class Question21{
  public static void main(String[] args){
     char c = 'A';
     int a = 1;
     for(int i = 0; i<5 ; i++){
       for(int j = 0; j<=i; j++){
	 System.out.print(a++ +" ");
       }
       System.out.println();
    }

  }
}