package regular;

class A {
  int a = 0;

  static int a2 = 10;

  A() { a = 1; }

  class B {
    B(A a){

    }

    void m1() {
      System.out.println(a);
      System.out.println(a2);
    }

  }
}

public class InnerClass {

  public static void main(String[] args) {
    A a = new A();

    A.B b = new A().new B(null);
    b.m1();
    return;
  }
}
