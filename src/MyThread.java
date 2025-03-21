
public class MyThread extends Thread{
    @Override
    public synchronized void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + "Thread is running: " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("Thread was interrupted!");
            }
        }
    }
}
