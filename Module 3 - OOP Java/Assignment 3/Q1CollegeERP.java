import java.util.*;

class Student {
    int rollNo;
    String name;
    int[] marks;
    String phone, email;

    static int totalStudents = 0;

    Student(int rollNo, String name, int[] marks, String phone, String email) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
        this.phone = phone;
        this.email = email;
        totalStudents++;
    }

    int getTotal() {
        int sum = 0;
        for (int m : marks) sum += m;
        return sum;
    }

    double getAverage() {
        return (double) getTotal() / marks.length;
    }

    void display() {
        System.out.println("\n--- Student Report ---");
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);

        System.out.print("Marks: ");
        for (int m : marks) System.out.print(m + " ");

        System.out.println("\nTotal: " + getTotal());
        System.out.println("Average: " + getAverage());
        System.out.println("Phone: " + phone + ", Email: " + email);
    }
}

public class Q1CollegeERP {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Student> list = new ArrayList<>();

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details of student " + (i + 1));

            System.out.print("Roll No: ");
            int roll = sc.nextInt();
            sc.nextLine(); // clear buffer

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Enter number of subjects: ");
            int sub = sc.nextInt();

            int[] marks = new int[sub];
            System.out.println("Enter marks:");
            for (int j = 0; j < sub; j++) {
                marks[j] = sc.nextInt();
            }

            sc.nextLine(); // clear buffer

            System.out.print("Phone: ");
            String phone = sc.nextLine();

            System.out.print("Email: ");
            String email = sc.nextLine();

            list.add(new Student(roll, name, marks, phone, email));
        }

        // Display all students
        for (Student s : list) {
            s.display();
        }

        System.out.println("\nTotal Students: " + Student.totalStudents);
    }
}