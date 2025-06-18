public class ThreadSleepDemo {

  public static void main(String[] args) throws InterruptedException {
    System.out.println("main execution starts");

    int ms = 3000;
    System.out.println("main is going to sleep for some seconds...");

    MyThread t1 = new MyThread();
    t1.start(); // Start child thread

    Thread.sleep(ms); // Main thread sleeps
    System.out.println("main is out of sleeping state");
  }
}

class MyThread extends Thread {
  @Override
  public void run() {
    System.out.println("t1 thread starts");

    try {
      Thread.sleep(5000); // Child thread sleeps for 5 sec
    } catch (InterruptedException ie) {
      System.out.println("InterruptedException handled in t1");
    }

    System.out.println("t1 thread ends");
  }
}
