package Multithreading;

import java.net.SocketOption;

public class ThreadExtendsTest extends Thread{
    void test()
    {
        System.out.println("lets call this method at  run method");
    }
    @Override
   public void run()
    {
        System.out.println("this is running state");
        test();
    }

    public static void main(String[] args) {
        ThreadExtendsTest thread= new ThreadExtendsTest();
       thread.test();
       thread.start();
    }

}
