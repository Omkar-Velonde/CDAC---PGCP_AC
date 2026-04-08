
class Q33PrimeNumbers {
  public static void main(String args[]) 
  {
    for(int num = 1; num<=100; num++){
        
      boolean isPrime = true;

      if (num <= 1) {
          continue;
      }
      else {
        for (int i = 2; i <= num / 2; i++) {
           if (num % i == 0) {
             isPrime = false;
                break;
           }
        }
      }

      if (isPrime) 
      {
            System.out.println(num + " ");
      } 
     
     }   
   }
}
