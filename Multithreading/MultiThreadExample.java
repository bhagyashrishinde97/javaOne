package Multithreading;

public class MultiThreadExample  extends Thread{

    @Override
    public void run() {
        synchronized (MultiThreadExample.class) {
            for (int i = 0; i < 3; i++) {
                System.out.println("Value of index is " + i + " Name of Thread is " + Thread.currentThread().getName());

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }

        }
        for (int i = 0; i < 3; i++) {
            System.out.println("Value of index is" + i);
        }

    }

    public static void main(String[] args)throws InterruptedException {
        MultiThreadExample obj1=new MultiThreadExample();
        obj1.setName("Thread1");
        MultiThreadExample obj2=new MultiThreadExample();
        obj2.setName("Thread2");
        MultiThreadExample obj3=new MultiThreadExample();
        obj3.setName("Thread3");
        MultiThreadExample obj4=new MultiThreadExample();
        obj3.setName("Thread4");
        obj1.start();
        obj1.join();
        obj2.start();
        obj2.join();
        obj3.start();
        obj3.join();
        obj4.start();
        obj4.join();
    }
}
