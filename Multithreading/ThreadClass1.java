package Multithreading;

public class ThreadClass1 extends Thread {
    void test()
    {
        System.out.println("lets call this method from run method");
    }
    @Override
    public void run() {
        System.out.println("thread is running state ");
        test();
    }

    public static void main(String[] args) {
        ThreadClass1 thread = new ThreadClass1();
        thread.start();
        thread.run();
    }

}