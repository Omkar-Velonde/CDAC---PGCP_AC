class Q17ScopeDemo {

  void methodScope() {
    int a = 10;
    System.out.println("Method variable a: " + a);
  }

  public static void main(String args[]) {

    int x = 5;
    System.out.println("Main variable x: " + x);

    for (int i = 0; i < 3; i++) {
      int y = i * 2;
      System.out.println("Loop i: " + i + ", y: " + y);
    }

    {
      int z = 100;
      System.out.println("Block variable z: " + z);
    }

    Q17ScopeDemo obj = new Q17ScopeDemo();
    obj.methodScope();
  }
}