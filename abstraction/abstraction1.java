abstract class animal{
  public  abstract void sound();
}
class dog extends animal{
  public void sound(){
    System.out.println("dog is bark");
  }
}
class cat extends animal{
  public void sound(){
System.out.println("cat meow");
  }
}
class abstractionDriver {
  public static void main(String[] args) {
animal obj=new dog();
obj.sound();

animal obj2=new cat();
obj2.sound();
  }
}