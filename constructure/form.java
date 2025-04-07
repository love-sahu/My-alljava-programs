class form {
  String name;
  String email;
  long phone;
  char gen;
  String dob;
  String blood;

  form() {
  }

  form(String name, String email, long phone, char gen, String dob, String blood) {
    this.name = name;
    this.email = email;
    this.phone = phone;
    this.gen = gen;
    this.dob = dob;
    this.blood = blood;
  }

  form(String name, String email, long phone, char gen, String dob) {
    this.name = name;
    this.email = email;
    this.phone = phone;
    this.gen = gen;
  }

  form(String name, String email, long phone, String dob) {
    this.name = name;
    this.email = email;
    this.phone = phone;
    // this.gen = gen;
    this.dob = dob;
  }

  public void display() {
    System.out.println(name);
    System.out.println(email);
    System.out.println(phone);
    System.out.println(dob);
    System.out.println(blood);
  }

}
