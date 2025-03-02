public class PalendromeString {
  public static void main(String[] args) {
    String str = "nitin";
    String duplicate = str;
    String rev = "";
    for (int i = str.length() - 1; i >= 0; i--) {
      rev += str.charAt(i);
    }
    if (duplicate.equals(rev)) {
      System.out.print("palendrome string");
    } else {
      System.out.print("not palendrome ");
    }

  }
}
