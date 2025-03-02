public class expattern {
  public static void main(String args[]) {
    // for (int i = 1; i <= 5; i++) {
    // for (int j = 1; j <= i; j++) {
    // System.out.print("* ");
    // }
    // System.out.println(" ");
    // }
    // for (int i = 1; i <= 5; i++) {
    // for (int j = 1; j <= i; j++) {
    // System.out.print(j + " ");
    // }
    // System.out.println(" ");
    // }
    // int number = 1;
    // for (int i = 1; i <= 5; i++) {

    // for (int j = 1; j <= i; j++) {

    // System.out.print(number + " ");
    // number += 1;
    // }
    // System.out.println(" ");
    // }
    // char ch = 'a';
    // for (int i = 1; i <= 5; i++) {

    // for (int j = 1; j <= i; j++) {

    // System.out.print(ch + " ");
    // ch += 1;
    // }
    // System.out.println(" ");
    // }

    // for (int i = 1; i <= 5; i++) {

    // for (int j = 1; j <= i; j++) {
    // char ch2 = 'a';
    // System.out.print(ch2 + " ");
    // ch += 1;
    // }
    // System.out.println(" ");
    // }

    // for (int i = 1; i <= 5; i++) {

    // for (int j = 1; j <= i; j++) {

    // if ((i + j) % 2 != 0) {
    // System.out.print("0 ");
    // } else {
    // System.out.print("1 ");
    // }
    // }
    // System.out.println(" ");
    // }
    // int table = 2;
    // for (int i = 1; i <= 5; i++) {

    // for (int j = 1; j <= i; j++) {

    // System.out.print(table + " ");
    // table += 2;
    // }
    // System.out.println(" ");
    // }

    // int tb = 1;
    // for (int i = 1; i <= 5; i++) {

    // for (int j = 1; j <= i; j++) {

    // System.out.print(tb + " ");
    // tb += 2;
    // }
    // System.out.println(" ");
    // }

    // char ch3 = 'a';
    // int n = 1;
    // for (int i = 1; i <= 5; i++) {

    // for (int j = 1; j <= i; j++) {
    // if (i % 2 == 1) {
    // System.out.print(ch3 + " ");
    // ch3++;
    // } else {
    // System.out.print(n + " ");
    // n += 1;
    // }
    // }
    // System.out.println(" ");
    //
    // }

    for (int i = 5; i >= 1; i--) {

      for (int j = 1; j <= 5 - i; j++) {

        System.out.print(" ");

      }
      for (int j = 1; j <= i; j++) {
        System.out.print("* ");
      }
      System.out.println();
    }

  }
}
