import java.io.IOException;

public class ExceptionWithoutBlock {

  public static void main(String[] args) {
    try {
      String s = null;
      System.out.println(s.length());
      // File = new FileReader("abc,txt");
      // Thread.sleep(5000);
      // Thread.sleep(7000);
    } catch (NullPointerException re) {
      System.out.println("null pointerException handle");
    }
    // catch (IOException io) {
    // System.out.println("ioException");
    // }
    catch (InterruptedException e) { /// Unreachable catch block for InterruptedException. This exception is never
                                     /// thrown from the try statement body
      System.out.println("exception handled");
    }
  }
}
