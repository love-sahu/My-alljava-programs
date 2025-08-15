public class classAbstractOverride {
  public static void main(String[] args) {
    parent obj1 = new B();
    obj1.m1();

    Agrandchild obj2 = new Agrandchild();
    obj2.m1();
    obj2.m2();
  }
}

abstract class parent {
  public abstract void m1();
}

abstract class A extends parent {
  public abstract void m2();
}

class B extends parent {
  public void m1() {
    System.out.println(" from b");
  }
}

class Agrandchild extends A {
  public void m1() {
    System.out.println("from AGrandChild M1");
  }

  public void m2() {
    System.out.println("from AGrandChild M2");
  }
}
