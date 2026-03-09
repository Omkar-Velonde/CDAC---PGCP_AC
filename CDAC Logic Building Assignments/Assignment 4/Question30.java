//Omkar Velonde
//CDAC KHARGHAR PGCP_AC
//Question 30: String Pool with intern() Method
class Question30{
  public static void main(String[] args){
    String str1="hello";
    String str2=str1.intern();
    String str3="hello";

    boolean result=(str2 == str3);


    System.out.println("Is str2 and str3 pointing to the same object? "+result); 
    
  }
}