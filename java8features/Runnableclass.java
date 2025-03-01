package java8features;

public class Runnableclass {
    public static void main(String[] args) {
        Runnable r1 = () -> {
            for (int i = 0; i <= 10; i++) {
                System.out.println("Value of i is: " + i);
                try {
                    Thread.sleep(1000); // Corrected syntax
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        Thread t = new Thread(r1); // Initialize a new thread with the runnable
        t.setName("john");
        t.start();
    }
}
