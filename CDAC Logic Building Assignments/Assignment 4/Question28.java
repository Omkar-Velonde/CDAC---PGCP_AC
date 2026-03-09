//Omkar Velonde
//CDAC KHARGHAR PGCP_AC
//Question 28: String Creation with new Keyword
class Question28{
  public static void main(String[] args){
    String str1=new String("omkar");
    String str2=new String("omkar");

    boolean result=(str1 == str2);

    System.out.println("Using == : "+result); 

    boolean result1=str1.equals(str2);
    System.out.println("Using .equals() : "+result1);
    
  }
}