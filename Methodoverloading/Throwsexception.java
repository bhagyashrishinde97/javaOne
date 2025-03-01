package Methodoverloading;


    class Parent {
        void display() {
            System.out.println("Parent display");
        }
    }

    class Child extends Parent {
        @Override
        void display() throws RuntimeException { // Unchecked exceptions are allowed
            System.out.println("Child display");
            throw new RuntimeException("Unchecked Exception");
        }
    }

     class Main3 {
        public static void main(String[] args) {
            Parent obj = new Child();
            obj.display();
        }
    }

