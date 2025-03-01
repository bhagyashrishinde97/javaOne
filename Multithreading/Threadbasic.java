package Multithreading;


import java.nio.channels.ScatteringByteChannel;

public class Threadbasic extends Thread {
    public static void main(String[] args) {
        Threadbasic thread = new Threadbasic();
        thread.setName("Thread1");
        thread.start();
    }

    @Override
    public void run() {
        System.out.println("thread running state" + "with name"  +Thread.currentThread().getName());

        try {
            Thread.sleep(5000);
        } catch (InterruptedException ex) {
            System.out.println("In Catch block");
        }

        System.out.println("calling method from run method");
        }
                }



