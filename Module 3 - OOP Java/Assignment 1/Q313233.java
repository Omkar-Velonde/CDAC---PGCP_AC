/*
//Q30
class Q313233{
  public static void main(String args[]){
    // int x;    error: variable x might not have been initialized  change: variable initialized
    int x=10;
    System.out.println(x);
  }
}
*/

/*
//Q31
class Q303132{
  public static void main(String args[]){
    int x=10;
    if(x == 10){//error: incompatible types: int cannot be converted to boolean change = to ==
      System.out.println("Hello");
    }
  }
}
*/

//Q32
class Q303132{
  public static void main(String args[]){
    int i=5;
    while(i < 10){
      System.out.println(i); //infinite loop
      i++;  // added increment
    }
  }
}



