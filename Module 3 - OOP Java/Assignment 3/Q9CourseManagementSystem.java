import java.util.*;

// Course Class
class Course {
    int id;
    String name;
    double fees;

    static int totalCourses = 0;

    Course(int id, String name, double fees) {
        this.id = id;
        this.name = name;
        this.fees = fees;
        totalCourses++;
    }

    void display() {
        System.out.println("Course ID: " + id + ", Name: " + name + ", Fees: " + fees);
    }
}

// Student Class
class Student {
    int id;
    String name;
    ArrayList<Course> courses = new ArrayList<>();

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    void enroll(Course c) {
        courses.add(c);
    }

    void display() {
        System.out.println("\n--- Student Details ---");
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);

        System.out.println("Enrolled Courses:");
        for (Course c : courses) {
            c.display();
        }
    }
}

class Q9CourseManagementSystem {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Student> students = new ArrayList<>();
        ArrayList<Course> courses = new ArrayList<>();

        // Input Courses
        System.out.print("Enter number of courses: ");
        int c = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < c; i++) {
            System.out.println("\nEnter course " + (i + 1));

            System.out.print("ID: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Fees: ");
            double fees = sc.nextDouble();

            courses.add(new Course(id, name, fees));
        }

        // Input Students
        System.out.print("\nEnter number of students: ");
        int s = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < s; i++) {
            System.out.println("\nEnter student " + (i + 1));

            System.out.print("ID: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("Name: ");
            String name = sc.nextLine();

            Student stu = new Student(id, name);

            System.out.print("How many courses to enroll: ");
            int n = sc.nextInt();

            for (int j = 0; j < n; j++) {
                System.out.print("Enter course index (0 to " + (courses.size()-1) + "): ");
                int idx = sc.nextInt();
                stu.enroll(courses.get(idx));
            }

            students.add(stu);
        }

        // Display
        for (Student stu : students) {
            stu.display();
        }

        System.out.println("\nTotal Courses: " + Course.totalCourses);
    }
}