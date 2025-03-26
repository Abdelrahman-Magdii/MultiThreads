import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

public class Main {
    public static void main(String[] args) throws InterruptedException {

//        MyThread thread = new MyThread();

//        thread.start();


//        // (Main Thread)
//        for (int i = 1; i <= 5; i++) {
//            System.out.println("Main thread is running: " + i);
//            try {
//                Thread.sleep(500);
//            } catch (InterruptedException e) {
//                System.out.println("Main thread was interrupted!");
//            }
//        }


        //TODO MyRunnable
//        MyRunnable myRunnable = new MyRunnable();
//
//        Thread threadRunnable= new Thread(myRunnable);
//
//        threadRunnable.start();
//
//        // (Main Thread)
//        for (int i = 1; i <= 5; i++) {
//            System.out.println("Main thread is running: " + i);
//            try {
//                Thread.sleep(500);
//            } catch (InterruptedException e) {
//                System.out.println("Main thread was interrupted!");
//            }
//        }

            //TODO States
//        System.out.println(thread.getState());
//        thread.start();
//        System.out.println(thread.getState());
//        Thread.sleep(100);
//        System.out.println(thread.getState());
//        thread.join();
//        System.out.println(thread.getState());


//        MyThread l = new MyThread("Low Priority Thread");
//        MyThread m = new MyThread("Medium Priority Thread");
//        MyThread n = new MyThread("High Priority Thread");
//
//        l.setPriority(Thread.MIN_PRIORITY);// 1
//        m.setPriority(Thread.NORM_PRIORITY);// 5
//        n.setPriority(Thread.MAX_PRIORITY);// 10
//
//        l.start();
//        m.start();
//        n.start();






//        Counter counter = new Counter();
//        MyThread t1 = new MyThread(counter);
//        MyThread t2 = new MyThread(counter);
//        t1.start();
//        t2.start();
//
//        t1.join();
//        t2.join();
//
//        System.out.println(counter.getCount());


//        Reentrant lock = new Reentrant();
//
//        MyThread myThread = new MyThread(lock); // 5
//        myThread.start();
//
//
//        MyRunnable runnable=new MyRunnable(lock);//10
//        Thread thread = new Thread(runnable);
//
//        thread.start();




        MyRunnable runnable=new MyRunnable();

        Thread thread1=new Thread(runnable);
        Thread thread2=new Thread(runnable);
        Thread thread3=new Thread(runnable);
        Thread thread4=new Thread(runnable);

        ArrayList<Thread>  threads=new ArrayList<>();
        threads.add(thread1);
        threads.add(thread2);
        threads.add(thread3);
        threads.add(thread4);


        // Fixed number of threads
        ExecutorService fixedPool = Executors.newFixedThreadPool(2);

//        for(Thread thread:threads){
//            fixedPool.submit(thread);
//        }

        // Dynamically expanding/shrinking pool
        ExecutorService cachedPool = Executors.newCachedThreadPool();

//        for(Thread thread:threads){
//            cachedPool.submit(thread);
//        }

        // Single thread executor
        ExecutorService singleThread = Executors.newSingleThreadExecutor();

//        for(Thread thread:threads){
//            singleThread.submit(thread);
//        }

        // Scheduled tasks
        ScheduledExecutorService scheduled = Executors.newScheduledThreadPool(2);

        for(Thread thread:threads){
            scheduled.submit(thread);
        }







    }

}