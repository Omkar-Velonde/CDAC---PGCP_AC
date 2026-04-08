import java.util.Scanner;

class Q10RestaurantOrderManagementSystem {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);

    int choice;
    int qty;
    double total = 0;

    do {
      System.out.println("\n--------- MENU -------");
      System.out.println("1. Pizza      - Rs. 200");
      System.out.println("2. Burger     - Rs. 100");
      System.out.println("3. Sandwich   - Rs. 80");
      System.out.println("4. Coffee     - Rs. 50");
      System.out.println("5. Exit");
      System.out.print("Enter your choice: ");

      choice = sc.nextInt();

      switch (choice) {
        case 1:
          System.out.print("Enter quantity: ");
          qty = sc.nextInt();
          total += qty * 200;
          break;

        case 2:
          System.out.print("Enter quantity: ");
          qty = sc.nextInt();
          total += qty * 100;
          break;

        case 3:
          System.out.print("Enter quantity: ");
          qty = sc.nextInt();
          total += qty * 80;
          break;

        case 4:
          System.out.print("Enter quantity: ");
          qty = sc.nextInt();
          total += qty * 50;
          break;

        case 5:
          break;

        default:
          System.out.println("Invalid choice!");
      }

    } while (choice != 5);

    double gst = total * 0.05;
    double finalAmount = total + gst;

    System.out.println("\n------------- FINAL BILL ----------");
    System.out.println("Total Amount : Rs. " + total);
    System.out.println("GST (5%)     : Rs. " + gst);
    System.out.println("Final Bill   : Rs. " + finalAmount);

  }
}