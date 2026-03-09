//Omkar Velonde
//CDAC KHARGHAR PGCP_AC
//Question 29: String Concatenation and Object Creation
class Question29{
  public static void main(String[] args){
    String str1="hello";
    String str2="omkar";

    String str3=str1 + str2;

    boolean result=(str3 == str1);


    System.out.println("Is str3 pointing to the same object as str1? "+result); 
    
  }
}