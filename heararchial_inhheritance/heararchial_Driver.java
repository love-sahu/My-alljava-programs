class Google {
  private String firstName;
  private String lastName;
  private String email;
  private String password;
  private long contact;
  private String dob;
  private String gender;

  public String getfirstName() {
    return firstName;
  }

  public String getlastname() {
    return lastName;
  }

  public String getemail() {

    // System.out.println(email);
    return email;
  }

  public String getpassword() {
    return password;
  }

  public long getcontact() {
    return contact;
  }

  public String getdob() {
    return dob;
  }

  public String getgender() {
    return gender;
  }

  public

  Google(String firstName, String lastName, String email, String password, long contact, String dob, String gender) {
    super();
    this.firstName = firstName;
    this.lastName = lastName;
    this.email = email;
    this.password = password;
    this.contact = contact;
    this.dob = dob;
    this.gender = gender;

  }

  public void getGoogleInfo() {
    System.out.println("____________________google info_______________________");
    System.out.println("full name" + firstName + " " + lastName);
    System.out.println("email :" + email);
    System.out.println("password :" + password);
    System.out.println("contact :" + contact);
    System.out.println("gender :" + gender);
    System.out.println("dob :" + dob);
    System.out.println("__________________________________________");
  }
}

class GoogleClassRoom extends Google {
  private String classRoomName;
  private String subject;
  private String teacher;
  private String classRoomCode;
  private String link;
  private int students;
  {
    this.classRoomCode = "" + (int) (Math.random() * 100000);
    this.link = "https://WWW.GoogleClassRoom/" + classRoomCode + "abc";
  }

  GoogleClassRoom(String firstName, String lastName, String email, String password, long contact, String dob,
      String gender,

      String classRoomName, String subject, int students, String teacher) {
    super(firstName, lastName, email, password, contact, dob, gender);
    this.classRoomName = classRoomCode;
    this.classRoomName = classRoomName;
    this.subject = subject;
    this.link = link;
    this.teacher = teacher;
    this.students = students;

  }

  public void getGoogleclassRoomInfo() {
    System.out.println("____________getGoogleclassRoomInfo____________");
    System.out.println("classRoomName :" + classRoomName);
    System.out.println("classRoomcode :" + classRoomCode);
    System.out.println("subject :" + subject);
    System.out.println("link :" + link);
    System.out.println("Teacher Name :" + teacher);
    System.out.println("____________________________________________________");
  }

}

class Bank {
  private String bankName;
  private String ifsc;
  private long accountNumber;

  Bank(String bankName, String ifsc, long accountNumber) {
    super();
    this.accountNumber = accountNumber;
    this.ifsc = ifsc;
    this.bankName = bankName;
  }

  public void getBankInfo() {
    System.out.println("_______________getBankInfo_________________");
    System.out.println("bank name" + bankName);
    System.out.println("ifsc" + ifsc);
    System.out.println("accountnumber" + accountNumber);
    System.out.println("__________________________________________");
  }

  public String getname() {
    return bankName;
  }

  public String getifsc() {
    return ifsc;
  }

  public long getaccountNumber() {
    return accountNumber;
  }

}

class GooglePay extends Google {
  private String name;
  private String upiId;
  private Bank bank;
  private int upipin;
  private long contact1;

  GooglePay(GoogleClassRoom obj, String name, int upipin, long contact1) {
    this(obj.getfirstName(), obj.getlastname(), obj.getemail(), obj.getpassword(), obj.getcontact(), obj.getdob(),
        obj.getgender(), name, upipin, contact1);
  }

  GooglePay(String firstName, String lastName, String email, String password, long contact, String dob, String gender,
      String name, int upipin, long contact1) {
    super(firstName, lastName, email, password, contact, dob, gender);
    this.contact1 = contact;
    this.name = name;
    this.upipin = upipin;
  }

  public void getgooglepayInfo() {
    System.out.println("GooglePayInfo");
    System.out.println("gpay name :" + name);
    System.out.println("upi id :" + upiId);
    System.out.println("upi pin :" + upipin);
    System.out.println("contact :" + contact1);
  }

  public void addBank(String bankName, String ifsc, long accountNumber) {
    bank = new Bank(bankName, ifsc, accountNumber);
    this.upiId = contact1 + "@" + bank.getname();
    System.out.println("bank account added");
  }

  public Bank getBank() {
    return bank;
  }
}

class GoogleMeet extends Google {
  private String hostName;
  private String link;
  private int people;
  private String schedule;
  private String code;
  {
    link = "WWW.Googlemeet.com";
    code = "124587412";
  }

  GoogleMeet(GoogleClassRoom obj, String hostName, int people, String schedule) {
    this(obj.getfirstName(), obj.getlastname(), obj.getemail(), obj.getpassword(), obj.getcontact(), obj.getdob(),
        obj.getgender(), hostName, people, schedule);
  }

  GoogleMeet(String firstName, String lastName, String email, String password, long contact, String dob, String gender,
      String hostName, int people, String schedule) {
    super(firstName, lastName, email, password, contact, dob, gender);
    this.hostName = hostName;
    this.people = people;
    this.schedule = schedule;
  }

  public void getGoogleMeetInfo() {
    System.out.println("_________getGoogleMeetInfo_____________");
    System.out.println("HostName :" + hostName);
    System.out.println("link :" + link);
    System.out.println("people :" + people);
    System.out.println("code :" + code);
    System.out.println("schedule :" + schedule);
  }
}

public class heararchial_Driver {
  public static void main(String[] args) {
    GoogleClassRoom obj = new GoogleClassRoom("love", "sahu", "love@gmail.com", "love12340", 1245369871l, "7/9/2003",
        "male", "m58", "CORE JAVA", 250, "shrikant sar");
    obj.getGoogleclassRoomInfo();
    obj.getGoogleInfo();

    GooglePay obj1 = new GooglePay(obj, "kush", 288123, 8605731042l);
    obj1.addBank("SBI", "INSBI", 9352416528l);
    obj1.getgooglepayInfo();
    obj1.getGoogleInfo();
    obj1.getBank().getBankInfo();

    System.out.println("___________obj2____________");
    GooglePay obj2 = new GooglePay("riya", "sahu", "riya@gmail.com", "4563210", 5661546161l, "5/5/190", "F", "Prachi",
        7887, 55964162l);
    obj2.addBank("ICC", "ICC45", 789654123l);

    obj2.getGoogleInfo();
    obj2.getgooglepayInfo();
    obj2.getBank().getBankInfo();

    System.out.println("_________GoogleMeet_________");

    GoogleMeet obj3 = new GoogleMeet(obj, "Qspider", 145, "5/1/2025");
    obj3.getGoogleMeetInfo();
    obj3.getGoogleInfo();
    obj3.getemail();

    GoogleMeet obj4 = new GoogleMeet("love", "sahu", "love144114@gmail.com", "love145", 9325761969l, "7/9/2003", "male",
        "host-jSpider", 500, "1st june");
    obj4.getGoogleInfo();
    obj4.getGoogleMeetInfo();
    obj4.getemail();

  }
}