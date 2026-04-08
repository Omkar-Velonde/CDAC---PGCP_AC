import java.util.*;

// ContactDetails Class (Composition)
class ContactDetails {
    String phone, email;

    ContactDetails(String phone, String email) {
        this.phone = phone;
        this.email = email;
    }

    void display() {
        System.out.println("Phone: " + phone + ", Email: " + email);
    }
}

// Patient Class
class Patient {
    int id, age;
    String name, disease;
    ContactDetails contact;   // Composition

    static int totalPatients = 0;

    Patient(int id, String name, int age, String disease, ContactDetails contact) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.disease = disease;
        this.contact = contact;
        totalPatients++;
    }

    boolean isSenior() {
        return age >= 60;
    }

    void display() {
        System.out.println("\n--- Patient Details ---");
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Disease: " + disease);

        System.out.print("Status: ");
        if (isSenior())
            System.out.println("Senior Citizen");
        else
            System.out.println("Normal");

        contact.display();
    }
}

class Q4HospitalManagementSystem {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Patient> list = new ArrayList<>();

        System.out.print("Enter number of patients: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details of patient " + (i + 1));

            System.out.print("ID: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Age: ");
            int age = sc.nextInt();
            sc.nextLine();

            System.out.print("Disease: ");
            String disease = sc.nextLine();

            System.out.print("Phone: ");
            String phone = sc.nextLine();

            System.out.print("Email: ");
            String email = sc.nextLine();

            ContactDetails cd = new ContactDetails(phone, email);
            list.add(new Patient(id, name, age, disease, cd));
        }

        // Display all patients
        for (Patient p : list) {
            p.display();
        }

        System.out.println("\nTotal Patients: " + Patient.totalPatients);
    }
}