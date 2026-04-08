import java.util.*;

// Ticket Class
class Ticket {
    int id;
    String passengerName;
    String source, destination;
    double fare;

    Ticket(int id, String passengerName, String source, String destination, double fare) {
        this.id = id;
        this.passengerName = passengerName;
        this.source = source;
        this.destination = destination;
        this.fare = fare;
    }

    // Update fare
    void updateFare(double newFare) {
        this.fare = newFare;
    }

    void display() {
        System.out.println("\n--- Ticket Details ---");
        System.out.println("Ticket ID: " + id);
        System.out.println("Passenger: " + passengerName);
        System.out.println("From: " + source + " To: " + destination);
        System.out.println("Fare: " + fare);
    }
}

class Q10TransportTicketSystem {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Ticket> list = new ArrayList<>();

        System.out.print("Enter number of bookings: ");
        int n = sc.nextInt();
        sc.nextLine();

        // Input tickets
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter ticket " + (i + 1));

            System.out.print("ID: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("Passenger Name: ");
            String name = sc.nextLine();

            System.out.print("Source: ");
            String src = sc.nextLine();

            System.out.print("Destination: ");
            String dest = sc.nextLine();

            System.out.print("Fare: ");
            double fare = sc.nextDouble();

            list.add(new Ticket(id, name, src, dest, fare));
            sc.nextLine();
        }

        double totalFare = 0;

        // Update + display
        for (Ticket t : list) {
            t.updateFare(t.fare + 50);   // example update
            t.display();
            totalFare += t.fare;
        }

        System.out.println("\nTotal Fare of all bookings: " + totalFare);
    }
}