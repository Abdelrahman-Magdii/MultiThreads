import java.util.concurrent.locks.ReentrantLock;

public class Reentrant {

    ReentrantLock lock = new ReentrantLock();

    public void print(int count) {

        try {
            lock.lock();
            for (int i = 1; i < 5; i++) {
                System.out.println(count*i);
                Thread.sleep(500);
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }finally {
            lock.unlock();
        }

    }
}
