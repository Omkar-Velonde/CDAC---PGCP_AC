import java.util.*;

// Base Class
class Vehicle {
    String brand;
    int speed;

    // Static block (system initialization)
    static {
        System.out.println("Fleet Management System Initialized...");
    }

    // Non-static block (object creation log)
    {
        System.out.println("New Vehicle Object Created");
    }

    Vehicle(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    void updateSpeed(int speed) {
        this.speed = speed;
    }

    void display() {
        System.out.println("Brand: " + brand + ", Speed: " + speed);
    }
}

// Derived Class: Car
class Car extends Vehicle {
    String fuelType;

    Car(String brand, int speed, String fuelType) {
        super(brand, speed);
        this.fuelType = fuelType;
    }

    void display() {
        super.display();
        System.out.println("Fuel Type: " + fuelType);
    }
}

// Derived Class: Bike
class Bike extends Vehicle {
    int mileage;

    Bike(String brand, int speed, int mileage) {
        super(brand, speed);
        this.mileage = mileage;
    }

    void display() {
        super.display();
        System.out.println("Mileage: " + mileage + " km/l");
    }
}

class Q2FleetManagementSystem {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Car Input
        System.out.println("Enter Car Details:");
        System.out.print("Brand: ");
        String cBrand = sc.nextLine();

        System.out.print("Speed: ");
        int cSpeed = sc.nextInt();
        sc.nextLine();

        System.out.print("Fuel Type: ");
        String fuel = sc.nextLine();

        Car car = new Car(cBrand, cSpeed, fuel);

        // Bike Input
        System.out.println("\nEnter Bike Details:");
        System.out.print("Brand: ");
        String bBrand = sc.nextLine();

        System.out.print("Speed: ");
        int bSpeed = sc.nextInt();

        System.out.print("Mileage: ");
        int mileage = sc.nextInt();

        Bike bike = new Bike(bBrand, bSpeed, mileage);

        // Update speed
        car.updateSpeed(120);
        bike.updateSpeed(80);

        // Display details
        System.out.println("\n--- Vehicle Details ---");
        car.display();
        System.out.println();
        bike.display();
    }
}