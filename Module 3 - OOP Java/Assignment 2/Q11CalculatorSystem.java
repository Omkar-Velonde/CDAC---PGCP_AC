class Q11CalculatorSystem {

  void calculate(int a, int b) {
    System.out.println("Sum of two integers: " + (a + b));
  }

  void calculate(double a, double b) {
    System.out.println("Sum of two doubles: " + (a + b));
  }

  void calculate(int a, int b, int c) {
    System.out.println("Sum of three integers: " + (a + b + c));
  }

  public static void main(String args[]) {
    Q11CalculatorSystem obj = new Q11CalculatorSystem();

    obj.calculate(10, 20);
    obj.calculate(5.5, 4.5);
    obj.calculate(1, 2, 3);
  }
}