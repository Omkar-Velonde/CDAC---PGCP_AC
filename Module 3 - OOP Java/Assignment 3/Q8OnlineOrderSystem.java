import java.util.*;

// Order Class
class Order {
    int orderId;
    String customerName;
    String[] items;
    double[] prices;

    Order(int orderId, String customerName, String[] items, double[] prices) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.items = items;
        this.prices = prices;
    }

    double getTotal() {
        double sum = 0;
        for (double p : prices) sum += p;
        return sum;
    }

    double applyGST(double gstPercent) {
        double total = getTotal();
        return total + (total * gstPercent / 100);
    }

    void display() {
        System.out.println("\n--- Order Details ---");
        System.out.println("Order ID: " + orderId);
        System.out.println("Customer: " + customerName);

        System.out.println("Items:");
        for (int i = 0; i < items.length; i++) {
            System.out.println(items[i] + " - " + prices[i]);
        }

        double total = getTotal();
        double finalBill = applyGST(18); // 18% GST

        System.out.println("Total: " + total);
        System.out.println("Final Bill (with GST): " + finalBill);
    }
}

class Q8OnlineOrderSystem {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Order> list = new ArrayList<>();

        System.out.print("Enter number of orders: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter order " + (i + 1) + " details:");

            System.out.print("Order ID: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("Customer Name: ");
            String name = sc.nextLine();

            System.out.print("Number of items: ");
            int m = sc.nextInt();
            sc.nextLine();

            String[] items = new String[m];
            double[] prices = new double[m];

            for (int j = 0; j < m; j++) {
                System.out.print("Item " + (j + 1) + ": ");
                items[j] = sc.nextLine();

                System.out.print("Price: ");
                prices[j] = sc.nextDouble();
                sc.nextLine();
            }

            list.add(new Order(id, name, items, prices));
        }

        // Display all orders
        for (Order o : list) {
            o.display();
        }
    }
}