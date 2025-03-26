public class MyRunnable implements Runnable {

//    Reentrant lock ;
//   public MyRunnable(Reentrant lock) {
//        this.lock = lock;
//    }
//
//    @Override
//    public void run() {
//        lock.print(10);
//    }


//        @Override
//    public void run() {
//        for (int i = 1; i <= 5; i++) {
//            System.out.println(Thread.currentThread().getName()+" Runnable thread is running: " + i);
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                System.out.println("Runnable thread was interrupted!");
//            }
//        }
//    }


    @Override
    public void run() {
        System.out.println("Runnable thread is running: "+Thread.currentThread().getName());
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Runnable thread was interrupted!");
        }
    }

}
