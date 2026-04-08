import java.util.*;

// Product Class
class Product {
    int id;
    String name;
    double price;
    int quantity;

    Product(int id, String name, double price, int quantity) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    // Update quantity
    void updateQuantity(int qty) {
        this.quantity = qty;
    }

    // Overloaded: Direct price update
    void updatePrice(double newPrice) {
        this.price = newPrice;
    }

    // Overloaded: Discount price update
    void updatePrice(double discount, boolean isDiscount) {
        if (isDiscount) {
            price = price - (price * discount / 100);
        }
    }

    double getStockValue() {
        return price * quantity;
    }

    void display() {
        System.out.println("\n--- Product Details ---");
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Stock Value: " + getStockValue());
    }
}

class Q5ProductInventorySystem {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Product> list = new ArrayList<>();

        System.out.print("Enter number of products: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter product " + (i + 1) + " details:");

            System.out.print("ID: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Price: ");
            double price = sc.nextDouble();

            System.out.print("Quantity: ");
            int qty = sc.nextInt();

            list.add(new Product(id, name, price, qty));
        }

        double totalValue = 0;

        for (Product p : list) {
            p.updateQuantity(p.quantity + 10);     // update stock
            p.updatePrice(10, true);               // apply 10% discount
            p.display();
            totalValue += p.getStockValue();
        }

        System.out.println("\nTotal Inventory Value: " + totalValue);
    }
}