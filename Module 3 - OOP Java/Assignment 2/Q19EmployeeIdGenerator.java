class Employee {
  static int counter = 1;

  int id;
  String name;

  Employee(String name) {
    this.name = name;
    id = counter;
    counter++;
  }

  void display() {
    System.out.println("ID: " + id + ", Name: " + name);
  }
}

class Q19EmployeeIdGenerator {
  public static void main(String args[]) {

    Employee e1 = new Employee("Amit");
    Employee e2 = new Employee("Rahul");
    Employee e3 = new Employee("Sneha");

    e1.display();
    e2.display();
    e3.display();
  }
}