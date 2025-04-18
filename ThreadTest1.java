public class ThreadTest1 {
    public static void main(String args[]) {
        // MyThreadChild threadExample = new MyThreadChild();
        // threadExample.start();
        // MyThreadChild threadSExample = new MyThreadChild();
        // threadSExample.start();
        // MyThreadChild threadTExample = new MyThreadChild();
        // threadTExample.start();
        MyRunnableThread threadExample = new MyRunnableThread();
        Thread thread = new Thread(threadExample);
        thread.setName("My first thread ");
        thread.start();
    }
    
}
