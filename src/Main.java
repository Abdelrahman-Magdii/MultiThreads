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


        Reentrant lock = new Reentrant();

        MyThread myThread = new MyThread(lock); // 5
        myThread.start();


        MyRunnable runnable=new MyRunnable(lock);//10
        Thread thread = new Thread(runnable);

        thread.start();





    }

}