import java.util.*;

// Base class
class Payment {
    int paymentId;
    double amount;

    Payment(int paymentId, double amount) {
        this.paymentId = paymentId;
        this.amount = amount;
    }

    void displayPayment() {
        System.out.println("Payment ID: " + paymentId + ", Amount: " + amount);
    }
}

// Credit Card subclass
class CreditCardPayment extends Payment {
    String cardNumber;

    CreditCardPayment(int id, double amount, String cardNumber) {
        super(id, amount);
        this.cardNumber = cardNumber;
    }

    void displayPayment() {
        System.out.println("Credit Card Payment -> ID: " + paymentId +
                ", Amount: " + amount + ", Card: " + cardNumber);
    }
}

// UPI subclass
class UPIPayment extends Payment {
    String upiId;

    UPIPayment(int id, double amount, String upiId) {
        super(id, amount);
        this.upiId = upiId;
    }

    void displayPayment() {
        System.out.println("UPI Payment -> ID: " + paymentId +
                ", Amount: " + amount + ", UPI: " + upiId);
    }
}

public class Q4PaymentSystem {

    public static void displayAll(List<? extends Payment> list) {
        for (Payment p : list) {
            p.displayPayment();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<CreditCardPayment> ccList = new ArrayList<>();
        List<UPIPayment> upiList = new ArrayList<>();

        // Credit Card Payments
        System.out.print("Enter number of Credit Card payments: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter ID, Amount, Card Number: ");
            ccList.add(new CreditCardPayment(
                    sc.nextInt(),
                    sc.nextDouble(),
                    sc.next()
            ));
        }

        // UPI Payments
        System.out.print("Enter number of UPI payments: ");
        int m = sc.nextInt();

        for (int i = 0; i < m; i++) {
            System.out.print("Enter ID, Amount, UPI ID: ");
            upiList.add(new UPIPayment(
                    sc.nextInt(),
                    sc.nextDouble(),
                    sc.next()
            ));
        }

        System.out.println("\n--- Credit Card Payments ---");
        displayAll(ccList);

        System.out.println("\n--- UPI Payments ---");
        displayAll(upiList);
    }
}