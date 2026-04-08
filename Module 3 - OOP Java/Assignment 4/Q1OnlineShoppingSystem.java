import java.util.*;

// Product Class
class Product {
    int productId;
    String productName;
    String price; // String input

    Product(int id, String name, String price) {
        this.productId = id;
        this.productName = name;
        this.price = price;
    }

    // Convert String price to double using Wrapper class
    double getPriceAsDouble() throws NumberFormatException {
        return Double.parseDouble(price);
    }
}

// Order Class
class Order {
    String customerName;
    Product[] products;

    Order(String customerName, Product[] products) {
        this.customerName = customerName;
        this.products = products;
    }

    // Calculate total
    double calculateTotal() throws NumberFormatException {
        double total = 0;
        for (Product p : products) {
            total += p.getPriceAsDouble();
        }
        return total;
    }

    // Overloaded: total after discount
    double calculateTotal(double discountPercent) throws NumberFormatException {
        double total = calculateTotal();
        return total - (total * discountPercent / 100);
    }

    // Generate bill using StringBuilder
    String generateBill(double finalAmount) throws NumberFormatException {
        StringBuilder sb = new StringBuilder();

        sb.append("\n------ BILL ------\n");
        sb.append("Customer: ").append(customerName).append("\n");

        sb.append("Products:\n");
        for (Product p : products) {
            sb.append(p.productName)
              .append(" - ")
              .append(p.getPriceAsDouble())
              .append("\n");
        }

        sb.append("Final Amount: ").append(finalAmount).append("\n");
        sb.append("------------------\n");

        return sb.toString();
    }
}

// Payment Interface
interface Payment {
    void pay(double amount);
    void refund(double amount);
}

// UPI Payment
class UPIPayment implements Payment {
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using UPI.");
    }

    public void refund(double amount) {
        System.out.println("Refund " + amount + " via UPI.");
    }
}

// Card Payment
class CardPayment implements Payment {
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using Card.");
    }

    public void refund(double amount) {
        System.out.println("Refund " + amount + " via Card.");
    }
}

class Q1OnlineShoppingSystem {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            // Customer input
            System.out.print("Enter customer name: ");
            String customer = sc.nextLine();

            System.out.print("Enter number of products: ");
            int n = sc.nextInt();
            sc.nextLine();

            if (n <= 0) {
                throw new Exception("Product count must be greater than 0");
            }

            Product[] products = new Product[n];

            // Input products
            for (int i = 0; i < n; i++) {
                System.out.println("\nEnter product " + (i + 1));

                System.out.print("ID: ");
                int id = sc.nextInt();
                sc.nextLine();

                System.out.print("Name: ");
                String name = sc.nextLine();

                System.out.print("Price (String): ");
                String price = sc.nextLine();

                products[i] = new Product(id, name, price);
            }

            Order order = new Order(customer, products);

            // Discount
            System.out.print("\nEnter discount % (0 if none): ");
            double discount = sc.nextDouble();

            double finalAmount;
            if (discount > 0)
                finalAmount = order.calculateTotal(discount);
            else
                finalAmount = order.calculateTotal();

            // Payment choice
            System.out.println("\nChoose Payment Method:");
            System.out.println("1. UPI\n2. Card");
            int choice = sc.nextInt();

            Payment payment;

            if (choice == 1) {
                payment = new UPIPayment();
            } else if (choice == 2) {
                payment = new CardPayment();
            } else {
                throw new Exception("Invalid Payment Option");
            }

            // Display bill
            System.out.println(order.generateBill(finalAmount));

            // Payment
            payment.pay(finalAmount);

            System.out.println("Payment Successful!");

        } catch (NumberFormatException e) {
            System.out.println("Invalid price format!");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}