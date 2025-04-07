import java.util.Scanner;

class appLikeUpi {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    String password = null;
    String username = null;
    String adress = null;
    double contact = 0.00;
    double diposit = 0.000;
    for (;;) {
      System.out.println("welcom in my own bank");

      System.out.println("1: EXISTING USER");
      System.out.println("2: NEW USER");
      System.out.print(" ENTER YOUR OPTIONS :");

      int option = sc.nextInt();
      System.out.println();
      if (option == 1) {
        if (username == null) {
          System.out.println("create new account first then login");
          continue;
        }
        System.out.println("login");
        System.out.println();

        for (int i = 3; i >= 1; i--) {
          System.out.print("USERNAME :");
          String username1 = sc.next();
          System.out.print("PASSWORD :");
          String password1 = sc.next();
          if ((username1.equals(username)) && (password1.equals(password))) {
            home: for (;;) {

              System.out.println("HOME");
              System.out.println("1: DEPOSIT");
              System.out.println("2: WITGDRAW");
              System.out.println("3:CHEAK BALANCE");
              System.out.println("4: MINI STATEMENT");
              System.out.println("5: LOGOUT");
              int option1 = sc.nextInt();
              switch (option1) {
                case 1:
                  System.out.print("enter diposit amount");
                  double newdiposit = sc.nextDouble();
                  diposit += newdiposit;
                  System.out.println("diposit successful");
                  break;
                case 2:
                  System.out.print("enter withdraw amount");
                  double withdraw1 = sc.nextDouble();
                  System.out.print("enter your pin");
                  String pin = sc.next();
                  if (pin.equals(password)) {
                    if (withdraw1 <= diposit) {
                      diposit -= withdraw1;
                      System.out.println("withdraw successful");

                    } else {
                      System.out.println("insufficent amount");
                    }
                  } else {
                    System.out.print("WRONG PIN");
                  }
                  break;
                case 3:
                  System.out.println("cheak ");
                  for (int j = 3; j >= 1; j--) {
                    System.err.println("enter the pin");
                    String password2 = sc.next();
                    if (password2.equals(password)) {
                      System.out.println("your balance is :" + diposit);
                      continue home;
                    } else {
                      System.out.println("envalid pin remeaning attempt :" + (j - 1));
                    }
                  }
                  System.out.println("your account as been block for 24 hour due to envalit attempt");
                  System.exit(0); //// terminate program and exit

                  break;
                case 4:
                  System.out.println("mini statement");
                  break;
                case 5: {
                  System.out.println("THANKS FOR USING OUR APP");
                  System.out.println("VISIT AGAIN");
                  System.exit(0); // terminate
                }
              }
            }
          } else {
            System.out.println("envalid username " + (i - 1) + " attempt remaining");
          }

        }

        //
        // username=sc.next();
        // adress=sc.next();

      } else if (option == 2) {
        System.out.println("ACCOUNT CREATION");
        System.out.print("enter username :");
        username = sc.next();
        System.out.print("enter password :");
        password = sc.next();
        System.out.print("enter adress :");
        adress = sc.nextLine();
        adress = sc.nextLine();
        System.out.print("contact number :");
        contact = sc.nextDouble();
        System.out.print("enter diposti ammount :");
        diposit = sc.nextDouble();
        System.out.println("ACCOUNT CREATED");
      }

      else {
        System.out.print("envalid input");
      }
    }
  }
}