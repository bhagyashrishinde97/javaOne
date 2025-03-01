package Multithreading;

public class Example extends Thread{
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println("Run");
        }
    }

    public static void main(String[] args) {
        Example ex = new Example();
        ex.start();

        for(int i=0;i<5;i++){
            System.out.println("Main");
        }
        System.out.println(ex.getName());
        System.out.println(currentThread().getName());










    }
}
