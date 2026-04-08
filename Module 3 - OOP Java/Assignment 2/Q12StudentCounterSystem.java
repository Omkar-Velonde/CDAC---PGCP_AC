class Student {
  String name;
  int rollNo;
  static int totalStudents = 0;

  Student(String name, int rollNo) {
    this.name = name;
    this.rollNo = rollNo;
    totalStudents++;
  }

  static void showTotalStudents() {
    System.out.println("Total Students: " + totalStudents);
  }
}

class Q12StudentCounterSystem {
  public static void main(String args[]) {

    Student s1 = new Student("Amit", 1);
    Student s2 = new Student("Rahul", 2);
    Student s3 = new Student("Sneha", 3);

    Student.showTotalStudents();
  }
}