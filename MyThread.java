public class MyThread extends Thread {

    public MyThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println("This is the child thread: " + Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        MyThread myThread = new MyThread("MyThread");
        myThread.start();

        System.out.println("This is the main thread: " + Thread.currentThread().getName());
    }
}

