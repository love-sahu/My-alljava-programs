import java.util.Scanner;

public class Evm {

  public static void main(String[] args) {
    int bjp = 0;
    int ss = 0;
    int cns = 0;
    int aap = 0;
    int mns = 0;
    int nota = 0;
    System.out.println("enter your populatuon");
    Scanner sc = new Scanner(System.in);
    int population = sc.nextInt();
    for (int i = 1; i < population; i++) {
      System.out.println("for  BJP enter 1");
      System.out.println("for  SS enter 2");
      System.out.println("for  CNS enter 3");
      System.out.println("for  AAP enter 4");
      System.out.println("for  MNS enter 5");
      System.out.println("for  NOTA enter 6");

      int opt = sc.nextInt();

      if (opt == 1) {
        bjp++;
        System.out.println("BJP");
      }
      if (opt == 2) {
        ss++;
        System.out.println("SS");
      }
      if (opt == 3) {
        cns++;
        System.out.println("CNS");
      }
      if (opt == 4) {
        aap++;
        System.out.println("AAP");
      }
      if (opt == 5) {
        mns++;
        System.out.println("MNS");
      }
      if (opt == 5) {
        nota++;
        System.out.println("NOTA");
      }

      if (!(opt >= 1 || opt <= 6)) {
        System.out.println("envalidd input");
      }

    }
    System.out.println(bjp);
    System.out.println(ss);
    System.out.println(cns);
    System.out.println(aap);
    System.out.println(mns);
    System.out.println(nota);

    if (bjp >= ss && bjp >= cns && bjp >= cns && bjp >= nota) {
      System.out.println(bjp);
    }
    if (ss >= bjp && ss >= cns && ss >= cns && ss >= nota) {
      System.out.println(ss);
    }
    if (cns >= ss && cns >= cns && cns >= bjp && cns >= nota) {
      System.out.println(cns);
    }
    if (aap >= ss && aap >= cns && aap >= cns && aap >= nota) {
      System.out.println(aap);
    }
    if (mns >= ss && mns >= cns && mns >= bjp && mns >= nota) {
      System.out.println(mns);
    }
    if (nota >= ss && nota >= cns && nota >= cns && nota >= bjp) {
      System.out.println(nota);
    }
  }
}
