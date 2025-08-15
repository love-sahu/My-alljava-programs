class parent{
  public void sleep(){
    System.out.println("sleep");
}
public void eatig(){
  System.out.println("eating");
}
}
class dog extends parent{
  public void barks(){
    System.out.println("barking");
  }
    public void sleep(){
    System.out.println("dog_sleep");
}
}
class cat extends parent{
  public void meows(){
    System.out.println("meowwe");
  }
}

class up_castingDriver {
  public static void main(String[] args) {

    // storing dog obj reference inside reference varianle of parent class
    parent obj=new dog();
    obj.sleep();
    obj.eatig();
    // obj.barking(); -!>we cannot use without down casting bcoz of child behaves like parent if it is override method then we can use 
    obj.sleep(); //overrided method can use in child classs only


    /// bcoz of is a realtionship class cat extends from parent class so we can access mambers of parent class.
    cat obj1=new cat();
    obj1.eatig();
    obj1.meows();
    obj1.sleep();

    //
    dog obj2=new dog();
    obj2.barks();
   
  }
}