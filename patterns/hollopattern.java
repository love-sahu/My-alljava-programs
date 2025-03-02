public class hollopattern {
  public static void main(String[] args) {
    for (int i = 1; i <= 5; i++) {
      for (int j = 1; j <= 5 - i; j++) {
        System.out.print("  ");
      }
      for (int j = 1; j <= i; j++) {
        if (i == 5 || j == i || j == 1) {
          System.out.print("* ");
        } else {
          System.out.print("  ");
        }
      }
      System.out.println();

    }

    for (int i = 5; i >= 1; i--) {
      for (int j = 1; j <= 5 - i; j++) {
        System.out.print("  ");
      }
      for (int j = 1; j <= i; j++) {
        if (i == 5 || j == i || j == 1) {
          System.out.print("* ");
        } else {
          System.out.print("  ");
        }
      }
      System.out.println();

    }

    for (int i = 1; i <= 5; i++) {
      for (int j = 1; j <= i; j++) {

        if (i == 5 || j == 1 || i == j) {
          System.out.print("* ");
        } else {
          System.out.print("  ");
        }
      }
      System.out.println();

    }
    for (int i = 5; i >= 1; i--) {
      for (int j = 1; j <= i; j++) {

        if (j == 1 || i == j) {
          System.out.print("* ");
        } else {
          System.out.print("  ");
        }
      }
      System.out.println();

    }

    // ............................................................................................................
    for (int i = 1; i <= 5; i++) {
      for (int j = 1; j <= 5 - i; j++) {
        System.out.print("  ");
      }
      for (int j = 1; j <= i; j++) {
        if (j == 1) {
          System.out.print("* ");
        } else {
          System.out.print("  ");
        }
      }
      for (int j = 2; j <= i; j++) {

        if (j == 1 || i == j) {
          System.out.print("* ");
        } else {
          System.out.print("  ");
        }
      }
      System.out.println();

    }
    for (int i = 4; i >= 1; i--) {
      for (int j = 1; j <= 5 - i; j++) {
        System.out.print("  ");
      }
      for (int j = 1; j <= i; j++) {
        if (i == 5 || j == 1) {
          System.out.print("* ");
        } else {
          System.out.print("  ");
        }

      }
      for (int j = 2; j <= i; j++) {

        if (i == 5 || j == 1 || i == j) {
          System.out.print("* ");
        } else {
          System.out.print("  ");
        }
      }
      System.out.println();

    }
  }
}
