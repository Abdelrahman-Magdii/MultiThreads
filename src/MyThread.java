public class MyThread extends Thread {

//    Reentrant lock ;
//
//   public MyThread(Reentrant lock) {
//        this.lock = lock;
//    }
//
//    @Override
//    public void run() {
//        lock.print(5);
//    }


//    Counter counter;
//    public MyThread(Counter counter) {
//        this.counter = counter;
//    }
//
//    @Override
//    public void run() {
//        for (int i = 0; i < 1000; i++) {
//         counter.increment();
//        }
//    }


//    public MyThread(String name) {
//        super(name);
//    }

//    @Override
//    public void run() {
//        System.out.println("Thread is Running...");
//        for (int i = 1; i <= 5; i++) {
//                System.out.println(Thread.currentThread().getName() + " - Priority: " + Thread.currentThread().getPriority() + " - count: " + i);
//                try {
//                    Thread.sleep(1000);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//
//                }
//        }
//    }

//    @Override
//    public void run() {
//        for (int i = 1; i <= 5; i++) {
//            System.out.println(Thread.currentThread().getName() + "Thread is running: " + i);
//            try {
//                Thread.sleep(500);
//            } catch (InterruptedException e) {
//                System.out.println("Thread was interrupted!");
//            }
//        }
//    }
}
