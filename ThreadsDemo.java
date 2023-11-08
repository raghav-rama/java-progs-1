public class ThreadsDemo {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new MyRunnable(), "Thread 1");
        Thread thread2 = new Thread(new MyRunnable(), "Thread 2");

        thread1.start();
        thread2.start();
    }
}

class MyRunnable implements Runnable {
    @Override
    public void run() {
        try {
            System.out.println(Thread.currentThread().getName() + " is running.");
            Thread.sleep(500);
            System.out.println(Thread.currentThread().getName() + " is done.");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

