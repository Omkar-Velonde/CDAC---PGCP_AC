class Patient {
  int id;
  String name;
  int age;
  String disease;

  Patient(int id, String name, int age, String disease) {
    this.id = id;
    this.name = name;
    this.age = age;
    this.disease = disease;
  }

  void display() {
    System.out.println("Patient ID   : " + id);
    System.out.println("Name         : " + name);
    System.out.println("Age          : " + age);
    System.out.println("Disease      : " + disease);
    System.out.println("Senior Citizen: " + (isSenior() ? "Yes" : "No"));
  }

  boolean isSenior() {
    return age >= 60;
  }
}

class Q8HospitalPatientRecordSystem {
  public static void main(String args[]) {

    Patient p1 = new Patient(101, "abc", 65, "Diabetes");
    Patient p2 = new Patient(102, "xyz", 30, "Fever");
    Patient p3 = new Patient(103, "pqr", 70, "Heart Problem");

    p1.display();
    p2.display();
    p3.display();
  }
}