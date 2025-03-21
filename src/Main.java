public class Main {
    public static void main(String[] args) {

        MyThread thread = new MyThread();
        MyThread myThread = new MyThread();

        thread.start();
        myThread.start();

//        thread.wait();
//        thread.notify();
//        thread.notifyAll();

//        // (Main Thread)
//        for (int i = 1; i <= 5; i++) {
//            System.out.println("Main thread is running: " + i);
//            try {
//                Thread.sleep(500);
//            } catch (InterruptedException e) {
//                System.out.println("Main thread was interrupted!");
//            }
//        }


//        //MyRunnable
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

    }

}