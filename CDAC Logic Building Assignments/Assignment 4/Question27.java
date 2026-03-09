//Omkar Velonde
//CDAC KHARGHAR PGCP_AC
//Question 27: String Literal and Object Creation
class Question27{
  public static void main(String[] args){
    String str1="omkar";
    String str2="omkar";

    boolean result=(str1 == str2);

    System.out.println("Both variables point to the same object: "+result); 
  }
}