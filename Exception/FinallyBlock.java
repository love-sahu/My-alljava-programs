public class FinallyBlock {
  public static void main(String args[]) {
    System.out.println("Application lounch");
    try {
      System.out.println("open Database Connection");
      System.out.println(10 / 0 + "Phone charge over");
    } 
     catch (Exception e) {
       System.out.println("Exception Handled");
       System.out.println("put in Charge");
     }   
    finally {
      System.out.println("Close dataBase Connection");
    }
    System.out.println("application close");
  }
}
/**
 * documentation comments
 * hello9 madam my name is locve i an treying to don sometging for me to become
 * successful in my life
 */

// single line comments

/*
 * multi line comments
 * treying to don sometging for me to become
 * successful in my life
 */