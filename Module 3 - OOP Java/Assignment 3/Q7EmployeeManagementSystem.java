import java.util.*;

// Employee Class
class Employee {
    int id;
    String name;
    double salary;

    static int totalEmployees = 0;

    Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        totalEmployees++;
    }

    // Salary without allowance
    double calculateSalary() {
        return salary;
    }

    // Overloaded: Salary with allowance %
    double calculateSalary(double allowancePercent) {
        return salary + (salary * allowancePercent / 100);
    }

    void display(double finalSalary) {
        System.out.println("\n--- Employee Details ---");
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Base Salary: " + salary);
        System.out.println("Final Salary: " + finalSalary);
    }
}

class Q7EmployeeManagementSystem {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Employee> list = new ArrayList<>();

        System.out.print("Enter number of employees: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter employee " + (i + 1) + " details:");

            System.out.print("ID: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Salary: ");
            double salary = sc.nextDouble();

            list.add(new Employee(id, name, salary));
        }

        // Calculate & display
        for (Employee e : list) {
            double finalSalary = e.calculateSalary(10); // 10% allowance
            e.display(finalSalary);
        }

        System.out.println("\nTotal Employees: " + Employee.totalEmployees);
    }
}