import java.util.Scanner;

class Q7MobileRecharge {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter Mobile Number: ");
    String mobile = sc.nextLine();

    System.out.println("\nAvailable Plans:");
    System.out.println("199  -> 28 days");
    System.out.println("399  -> 56 days");
    System.out.println("599  -> 84 days");

    System.out.print("Enter Recharge Amount: ");
    int amount = sc.nextInt();

    String validity;

    switch (amount) {
      case 199:
        validity = "28 days";
        break;
      case 399:
        validity = "56 days";
        break;
      case 599:
        validity = "84 days";
        break;
      default:
        validity = "Invalid Plan";
    }

    System.out.println("\n------------ Recharge Details -----");
    System.out.println("Mobile Number : " + mobile);
    System.out.println("Amount        : Rs. " + amount);

    if (!validity.equals("Invalid Plan")) {
      System.out.println("Validity      : " + validity);
      System.out.println("Status        : Recharge Successful");
    } else {
      System.out.println("Status        : Invalid Recharge Plan");
    }

  }
}