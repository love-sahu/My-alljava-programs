public class construction_overloading {
  String name;
  String collage;
  int id;
  long number;
  String email;
  String adress;

  construction_overloading() {
  }

  construction_overloading(String name, String collageNam) {
    this.name = name;
    this.collage = collageNam;
  }

  construction_overloading(String name, String collage, int id, long number) {
    this(name, collage);
    this.id = id;
    this.number = number;

  }

  construction_overloading(String name, String collage, int id, long number, String email, String adress) {
    this(name, collage, id, number);

    this.email = email;
    this.adress = adress;
  }

  public void display() {
    System.out.println(name);
    System.out.println(collage);
    System.out.println(id);
    System.out.println(number);
    System.out.println(email);
    System.out.println(adress);
    System.out.println("--------------------------------");

  }

}
