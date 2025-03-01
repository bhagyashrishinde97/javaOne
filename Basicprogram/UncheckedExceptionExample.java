package Basicprogram;


    class Parent3 {
        // Parent method does not throw any exception
        void display() {
            System.out.println("Parent display method.");
        }
    }

    class Child3 extends Parent3 {
        // Overriding method throws unchecked exception
        @Override
        void display() {
            System.out.println("Child display method.");
            throw new RuntimeException("Unchecked exception from Child class.");
        }
    }

    public class UncheckedExceptionExample {
        public static void main(String[] args) {
            Parent3 obj = new Child3();
            obj.display(); // This will throw the RuntimeException
        }
    }
    //o/p /* UncheckedExceptionExample
/*Child display method.
Exception in thread "main" java.lang.RuntimeException: Unchecked exception from Child class.
	at Basicprogram.Child3.display(UncheckedExceptionExample.java:16)
	at Basicprogram.UncheckedExceptionExample.main(UncheckedExceptionExample.java:23)*/



