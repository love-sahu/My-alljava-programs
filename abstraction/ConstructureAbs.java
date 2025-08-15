abstract class parent{
  {
    System.out.println("from parentnon static block");

  }
}
class child extends parent{
  {
    System.out.println("child nonstatic block");
  }
}


class ConstructureAbs {
  public static void main(String[] args) {
child obj=new child();
  }
}