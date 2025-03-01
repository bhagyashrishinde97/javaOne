package Multithreading;

public class ThreadClass extends Thread{
    @Override

    public void run()
    {
        try {
            Thread.sleep(100);//break
        }catch(InterruptedException e)
        {
          throw new  RuntimeException (e);
        }
        System.out.println("Thread is currently in running state");
    }

    public static void main(String[] args) throws InterruptedException {
       // Thread obj=new Thread();
        ThreadClass obj=new ThreadClass();
        obj.start();

    }
}
class  runnable implements Runnable {
    @Override
    public void run() {

    }
}
