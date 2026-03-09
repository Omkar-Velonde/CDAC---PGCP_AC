//Omkar Velonde
//CDAC KHARGHAR PGCP_AC
//Problem3: Print Even Numbers (Using while Loop)

class Problem3{
  int printEvenNumbers(){
    for(int i=1; i<=50; i++){
      if(i%2==0){
        System.out.println(i);
      }
    }
    return 0;
  }
  public static void main(String[] args){
    Problem3 p3=new Problem3();
    p3.printEvenNumbers();
  }
}