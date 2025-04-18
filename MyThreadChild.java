public class MyThreadChild extends Thread {
  
    public void run() {
      System.out.println(Thread.currentThread().getName() + "Started");
        }
    }
