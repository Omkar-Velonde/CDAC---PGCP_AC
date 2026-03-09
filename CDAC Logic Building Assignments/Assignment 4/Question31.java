//Omkar Velonde
//CDAC KHARGHAR PGCP_AC
//Question 31: Multiple String Literals with Same Content
class Question31{
  public static void main(String[] args){
    String str1="java";
    String str2="java";
    String str3="java";

    boolean result=(str1 == str2) && (str2 == str3);


    System.out.println("All string point to the same object: "+result); 
    
  }
}