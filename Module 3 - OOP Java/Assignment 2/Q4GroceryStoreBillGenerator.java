import java.util.Scanner;
class Q4GroceryStoreBillGenerator{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter number of items: ");
    int n = sc.nextInt();
    sc.nextLine();

    String[] itemNames = new String[n];
    int[] quantity = new int[n];
    double[] price = new double[n];
    double[] total = new double[n];

    double grandTotal = 0;
    
    for(int i=0; i<n; i++){
      System.out.println("Enter details for item "+(i+1));

      System.out.print("Item name: ");
      itemNames[i] = sc.nextLine();

      System.out.print("Quantity: ");
      quantity[i] = sc.nextInt();

      System.out.print("price per item: ");
      price[i] = sc.nextDouble();
      sc.nextLine();

     total[i] = quantity[i] * price[i];
     grandTotal += total[i];
    }

    double discount = 0;
    if(grandTotal > 3000){
      discount = grandTotal * 0.10;
    }

    double finalAmount = grandTotal - discount;

    System.out.println("----------Final Bill----------------");
    System.out.print("Item          "+"Qty            "+"Price             "+"Total              ");
    for(int i=0; i<n; i++){
      System.out.println(itemNames[i]+"    "+quantity[i]+"     "+price[i]+"     "+total[i]);
      
    }
    System.out.println("------------------------------------------");
    System.out.println("Grand Total: "+grandTotal);
    System.out.println("Discount: "+discount);
    System.out.println("Final Amount: "+finalAmount);
    System.out.println("------------------------------------------");

  }
}