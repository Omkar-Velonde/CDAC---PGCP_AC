import java.util.*;

class Inventory<T> {
    private T product;

    public void addProduct(T product) {
        this.product = product;
    }

    public T getProduct() {
        return product;
    }
}

// Electronics class
class Electronics {
    String name;
    double price;

    Electronics(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String toString() {
        return "Electronics [Name=" + name + ", Price=" + price + "]";
    }
}

// Clothing class
class Clothing {
    String brand;
    double price;

    Clothing(String brand, double price) {
        this.brand = brand;
        this.price = price;
    }

    public String toString() {
        return "Clothing [Brand=" + brand + ", Price=" + price + "]";
    }
}

class Q1Inventory {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Electronics
        System.out.print("Enter electronics name: ");
        String ename = sc.nextLine();
        System.out.print("Enter price: ");
        double eprice = sc.nextDouble();
        sc.nextLine();

        Inventory<Electronics> eInv = new Inventory<>();
        eInv.addProduct(new Electronics(ename, eprice));

        // Clothing
        System.out.print("Enter clothing brand: ");
        String cname = sc.nextLine();
        System.out.print("Enter price: ");
        double cprice = sc.nextDouble();

        Inventory<Clothing> cInv = new Inventory<>();
        cInv.addProduct(new Clothing(cname, cprice));

        System.out.println("\nStored Products:");
        System.out.println(eInv.getProduct());
        System.out.println(cInv.getProduct());
    }
}