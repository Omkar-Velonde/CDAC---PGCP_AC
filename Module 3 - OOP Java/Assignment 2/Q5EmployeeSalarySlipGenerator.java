import java.util.Scanner;
class Q5EmployeeSalarySlipGenerator{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.print("Employee Name: ");
    String name = sc.nextLine();
    System.out.print("Employee Id: ");
    int id = sc.nextInt();
    System.out.print("Salary: ");
    double salary= sc.nextDouble();

    double hra = 0.20*salary;
    double da = 0.10*salary;
    double pf = 0.08*salary;
    double net = salary + hra + da - pf;

    System.out.println();
    System.out.println("----------------SALARY SLIP---------------");
    System.out.println("Employee  name: "+name);
    System.out.println("Employee Id: "+id);
    System.out.println("Employee Salary: "+salary);
    System.out.println("HRA: "+hra);
    System.out.println("DA: "+da);
    System.out.println("PF: "+pf);
    System.out.println("Net Salary: "+net);
    System.out.println("------------------------------------------");

     
  }
  
}
