abstract class parent {
  public abstract void m1();

  public abstract void m2();
}

class A extends parent {
  @Override
  public void m1() {
    System.out.println("from Am1");
  }

  @Override
  public void m2() {
    System.out.println(" from Am2");
  }
}

class B extends parent {
  public void m1() {
    System.out.println("from Bm1");
  }

  @Override
  public void m2() {
    System.out.println(" from Bm2");
  }
}

public class abstractClass {
  public static void main(String[] args) {
    parent obj = new A();
    obj.m1();
    obj.m2();

    parent obj1 = new B();
    obj1.m1();
    obj1.m2();
  }
}
